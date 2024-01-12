package com.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody Map<String, String> credentials) {
        String loginId = credentials.get("login_id");
        String password = credentials.get("password");

        // Perform authentication (you should implement this logic)
        // For simplicity, we are assuming a service method authenticateUser
        // that returns a boolean indicating success or failure.
        if (authService.authenticateUser(loginId, password)) {
            // Generate JWT token
            String token = authService.generateToken(loginId);

            // Return the token in the response
            Map<String, String> response = new HashMap<>();
            response.put("token", token);

            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            // Authentication failed
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }
}

