package ambigoush.bagasee.security;

import ambigoush.bagasee.model.UserField;
import ambigoush.bagasee.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        UserField userField= userRepository.findByUsernameOrEmail(s,s)
        .orElseThrow(()->
                new UsernameNotFoundException("User not found with username or email : " + s));
        return UserPrincipal.create(user);
    }

    @Transactional
    public UserDetails loadUserById(Long id){
        UserField userField=userRepository.findById(id).orElseThrow(
                ()-> new UsernameNotFoundException("User not found with id : " + id)
        );
        return UserPrincipal.create(userField);
    }
}
