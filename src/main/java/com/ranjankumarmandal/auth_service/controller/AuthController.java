package com.ranjankumarmandal.auth_service.controller;

import com.ranjankumarmandal.auth_service.dto.AuthResponse;
import com.ranjankumarmandal.auth_service.dto.LoginRequest;
import com.ranjankumarmandal.auth_service.dto.SignupRequest;
import com.ranjankumarmandal.auth_service.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public String signup(@RequestBody SignupRequest request) {
        authService.signup(request.getUsername(), request.getPassword());
        return "User registered successfully";
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest request) {
        return new AuthResponse(authService.login(request));
    }
}
