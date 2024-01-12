package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.security.JwtTokenProvider;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Override
    public boolean authenticateUser(String loginId, String password) {
        // Implement your authentication logic
        return loginId != null && !loginId.isEmpty() && password != null && !password.isEmpty();
    }

    @Override
    public String generateToken(String loginId) {
        return jwtTokenProvider.generateToken(loginId);
    }
}

