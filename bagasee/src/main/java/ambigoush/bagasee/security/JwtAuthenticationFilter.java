package ambigoush.bagasee.security;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

public class JwtAuthenticationFilter extends OncePerRequestFilter {
    @Autowired
    private  JwtTokenProfider tokenProfider;

    @Autowired
    private  CustomUserDetailsService customUserDetailsService;

    private static final Logger logger = LoggerFactory.getILoggerFactory(JwtAuthenticationFilter.class);


    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {

    }
}
