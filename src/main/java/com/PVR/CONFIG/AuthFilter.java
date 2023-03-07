package com.PVR.CONFIG;

import com.PVR.SERVICE.jwtService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
    @Component
    public class AuthFilter extends OncePerRequestFilter {
        @Autowired
        private jwtService jservice;
        @Autowired
        private UserInfoDetailsService userInfoDetailsService;
        @Override
        protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
            String authHeader=request.getHeader("Authorized");
            String token=null;
            String username=null;
            if (authHeader !=null && authHeader.startsWith("Bearer ")){
                token=authHeader.substring(7);
                username=jservice.extractUsername(token);
            }
            if (username !=null && SecurityContextHolder.getContext().getAuthentication()==null){
                UserDetails userDetails=userInfoDetailsService.loadUserByUsername(username);
                if (jservice.validateToken(token,userDetails)){
                    UsernamePasswordAuthenticationToken authToken=new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
                    authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                }
            }
            filterChain.doFilter(request,response);

        }
    }

