package com.example.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jwt.util.JwtUtil;

@Service
public class AuthService {

    @Autowired
    private JwtUtil jwtUtil;

    public String authenticate(String username, String password) {

        // Simple authentication
        if ("admin".equals(username) && "admin123".equals(password)) {
            return jwtUtil.generateToken(username);
        }

        return null;
    }
}