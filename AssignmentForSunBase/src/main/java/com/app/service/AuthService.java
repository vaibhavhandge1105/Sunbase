package com.app.service;

public interface AuthService {
    boolean authenticateUser(String loginId, String password);
    String generateToken(String loginId);
}
