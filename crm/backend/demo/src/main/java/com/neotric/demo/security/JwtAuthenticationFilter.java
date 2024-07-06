//package com.neotric.demo.security;
//
//import io.jsonwebtoken.ExpiredJwtException;
//import io.jsonwebtoken.SignatureException;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//
//
//@Component
//public class JwtAuthenticationFilter extends OncePerRequestFilter {
//
//    @Autowired
//    private JwtTokenProvider tokenProvider;
//
//    @Autowired
//    private UserDetailsService userDetailsService;
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
//            throws ServletException, IOException {
//        String header = request.getHeader("Authorization");
//        String username = null;
//        String authToken = null;
//        if (header != null && header.startsWith("Bearer ")) {
//            authToken = header.replace("Bearer ", "");
//            try {
//                username = tokenProvider.getUsernameFromToken(authToken);
//            } catch (IllegalArgumentException e) {
//                logger.error("an error occurred during getting username from token", e);
//            } catch (ExpiredJwtException e) {
//                logger.warn("the token is expired and not valid anymore", e);
//            } catch (SignatureException e) {
//                logger.error("Authentication Failed. Username or Password not valid.");
//            }
//        } else {
//            logger.warn("couldn't find bearer string, will ignore the header");
//        }
//        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
//            UsernamePasswordAuthenticationToken authentication =
//                    new UsernamePasswordAuthenticationToken(
//                            userDetails,
//                            null,
//                            userDetails.getAuthorities());
//            if (tokenProvider.validateToken(authToken, userDetails)) {
//                //JwtAuthenticationToken authentication = tokenProvider.getAuthentication(authToken, userDetails);
//                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//                logger.info("authenticated user " + username + ", setting security context");
//                SecurityContextHolder.getContext().setAuthentication(authentication);
//            }
//        }
//        chain.doFilter(request, response);
//    }
//}
