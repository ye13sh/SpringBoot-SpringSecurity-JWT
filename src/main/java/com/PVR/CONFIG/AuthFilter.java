package com.PVR.CONFIG;

import com.PVR.SERVICE.jwtService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

    public class AuthFilter extends OncePerRequestFilter {
        @Autowired
        private jwtService service;
        @Autowired
        private UserInfoDetailsService userInfoDetailsService;
        @Override
        protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
            String authHeader=request.getHeader("Authorized");
            String token=null;
            String username=null;
            if (authHeader !=null && authHeader.startsWith("Bearer ")){
                token=authHeader.substring(7);
                username=service.extractUsername(token);
            }
            if (username !=null && SecurityContextHolder.getContext().getAuthentication()==null){
                UserDetails userDetails=userInfoDetailsService.loadUserByUsername(username);
                if (service.validateToken(token,userDetails)){
                    UsernamePasswordAuthenticationToken authToken=new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
                    authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                }
            }
            filterChain.doFilter(request,response);

        }
    }

