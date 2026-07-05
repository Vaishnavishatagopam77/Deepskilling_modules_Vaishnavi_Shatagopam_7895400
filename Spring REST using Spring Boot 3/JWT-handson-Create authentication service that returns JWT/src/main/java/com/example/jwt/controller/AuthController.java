package com.example.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.jwt.model.AuthRequest;
import com.example.jwt.model.AuthResponse;
import com.example.jwt.service.AuthService;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @GetMapping("/authenticate")
    public String authenticate() {
        return "JWT Authentication Service Running";
    }
    public AuthResponse authenticate(@RequestBody AuthRequest request) {

        String token = authService.authenticate(
                request.getUsername(),
                request.getPassword());

        if (token == null) {
            throw new RuntimeException("Invalid Username or Password");
        }

        return new AuthResponse(token);
    }
}