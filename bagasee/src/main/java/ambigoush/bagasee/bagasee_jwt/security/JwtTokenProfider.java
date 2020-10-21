package ambigoush.bagasee.bagasee_jwt.security;

import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;

import java.util.Date;

public class JwtTokenProfider {
    private static final Logger logger = LoggerFactory.getLogger(JwtTokenProfider.class);
    @Value("${app.jwtSecret}")
    private String jwtSecret;

    @Value("${app.jwtExpirationInMs}")
    private int jwtExpirationInMs;

    public String generateToken(Authentication authentication) {
        SellerPrincipal sellerPrincipal = (SellerPrincipal) authentication.getPrincipal();
        Date now = new Date();
        Date expireDate = new Date(now.getTime() + jwtExpirationInMs);

        return Jwts.builder()
                .setSubject(Long.toString(sellerPrincipal.getId()))
                .setIssuedAt()
                .setExpiration(expireDate)
                .signWith(SignatureAlgorithm.HS512,jwtSecret)
                .compact();

    }

    public Long getUserIdFromJWT(String token){
        Claims claims = Jwts.parser()
                .setSigningKey(jwtSecret)
                .parseClaimsJws(token)
                .getBody();
        return  Long.parseLong(claims.getSubject());
    }

    public boolean validateToken(String authToken){
        try{
            Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(authToken);
            return  true;
        } catch (SignatureException ex){
            logger.error("Invalid JWT signature");
        } catch (MalformedJwtException ex){
            logger.error("Invalid JWT token");
        }catch (ExpiredJwtException ex){
            logger.error("Expired JWT token");
        }catch (UnsupportedJwtException ex){
            logger.error("Unsupported JWT token");
        }catch (IllegalArgumentException ex){
            logger.error("JWT claims string is empty");
        }
        return  false;

    }
}

