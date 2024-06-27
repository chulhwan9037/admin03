package com.ict.admin03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.ict.admin03.jwt.JWTUtil;
import com.ict.admin03.jwt.JwtResponse;
import com.ict.admin03.vo.AdminVO;

@Service
public class AuthService {
    
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private JWTUtil jwtUtil;

    public ResponseEntity<?> authenticate(AdminVO avo){
        try {
            Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(avo.getId(), avo.getPw()));
            final UserDetails userDetails = userDetailsService.loadUserByUsername(avo.getId());
            final String jwt = jwtUtil.generateToken(userDetails);
            return ResponseEntity.ok(new JwtResponse(jwt));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(401).body("error");
        }
    }
}
