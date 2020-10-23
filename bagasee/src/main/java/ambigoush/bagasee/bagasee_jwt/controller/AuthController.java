package ambigoush.bagasee.bagasee_jwt.controller;

import ambigoush.bagasee.bagasee_jwt.exception.AppException;
import ambigoush.bagasee.bagasee_jwt.model.Role;
import ambigoush.bagasee.bagasee_jwt.model.RoleUser;
import ambigoush.bagasee.bagasee_jwt.model.SellerBaggage;
import ambigoush.bagasee.bagasee_jwt.paylod.ApiResponse;
import ambigoush.bagasee.bagasee_jwt.paylod.JwtAuthenticationResponse;
import ambigoush.bagasee.bagasee_jwt.paylod.LoginRequest;
import ambigoush.bagasee.bagasee_jwt.paylod.SignUpRequestSeller;
import ambigoush.bagasee.bagasee_jwt.repository.RoleSellerRepository;
import ambigoush.bagasee.bagasee_jwt.repository.SellerRepository;
import ambigoush.bagasee.bagasee_jwt.security.JwtTokenProfider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.net.URI;
import java.util.Collections;
import java.util.Optional;


@CrossOrigin("http://localhost:8082")
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    SellerRepository sellerRepository;

    @Autowired
    RoleSellerRepository roleSellerRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    JwtTokenProfider tokenProfider;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUserNameOrEmail(),
                        loginRequest.getUserPassword()
                )
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = tokenProfider.generateToken(authentication);
        return ResponseEntity.ok(new JwtAuthenticationResponse(jwt));
    }

    private String getJwt(HttpServletRequest request) {
        String bearerToken = request.getHeader("Authorization");
        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7, bearerToken.length());
        }

        return null;
    }

    @GetMapping("/user")
    public ResponseEntity<?> user(HttpServletRequest request) {
        String bearerToken = this.getJwt(request);
        if (bearerToken == null) {
            return ResponseEntity.status(403).body("akses tidak diizinkan.");
        }

        long userId = tokenProfider.getUserIdFromJWT(bearerToken);
        Optional<SellerBaggage> user = sellerRepository.findById(userId);

        return ResponseEntity.ok(user);
    }


    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequestSeller signUpRequestSeller) {
        if(sellerRepository.existsByUsername(signUpRequestSeller.getSeller_baggage_name())) {
            return new ResponseEntity(new ApiResponse(false, "Username is already taken!"),
                    HttpStatus.BAD_REQUEST);
        }

        if(sellerRepository.existsByEmail(signUpRequestSeller.getSeller_baggage_email())) {
            return new ResponseEntity(new ApiResponse(false, "Email Address already in use!"),
                    HttpStatus.BAD_REQUEST);
        }

        // Creating user's account
        SellerBaggage sellerBaggage = new SellerBaggage(signUpRequestSeller.getSeller_baggage_name(), signUpRequestSeller.getSeller_baggage_email(),
                signUpRequestSeller.getSeller_baggage_phone_number(), signUpRequestSeller.getSeller_baggage_password());

        sellerBaggage.setSeller_baggage_password(passwordEncoder.encode(sellerBaggage.getSeller_baggage_password()));

        Role sellerBaggageRole = roleSellerRepository.findByName(RoleUser.ROLE_SELLER)
                .orElseThrow(() -> new AppException("User Role not set."));

        sellerBaggage.setRoleSet(Collections.singleton(sellerBaggageRole));

        SellerBaggage sellerBaggage1 = sellerRepository.save(sellerBaggage);

        URI location = ServletUriComponentsBuilder
                .fromCurrentContextPath().path("/api/users/{username}")
                .buildAndExpand(sellerBaggage1.getSeller_baggage_name()).toUri();

        return ResponseEntity.created(location).body(new ApiResponse(true, "User registered successfully"));
    }

}
