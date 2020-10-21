package ambigoush.bagasee.bagasee_jwt.security;

import ambigoush.bagasee.bagasee_jwt.model.SellerBaggage;
import ambigoush.bagasee.bagasee_jwt.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    SellerRepository sellerRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        SellerBaggage sellerBaggage = sellerRepository.findByUsernameOrEmail(s,s)
        .orElseThrow(()->
                new UsernameNotFoundException("User not found with username or email : " + s));
        return UserPrincipal.create(user);
    }

    @Transactional
    public UserDetails loadUserById(Long id){
        SellerBaggage sellerBaggage = sellerRepository.findById(id).orElseThrow(
                ()-> new UsernameNotFoundException("User not found with id : " + id)
        );
        return UserPrincipal.create(sellerBaggage);
    }
}
