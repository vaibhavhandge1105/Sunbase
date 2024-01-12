package com.app.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    // Implement the loadUserByUsername method to load user details by username
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Implement the logic to load user details from your data store (e.g., database)
        // You can use Spring Data JPA or any other data access method to retrieve user details
        // For demonstration purposes, let's create a simple UserDetails object
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(
                "username", // replace with the actual username
                "password", // replace with the actual password
                new ArrayList<>()
        );
        return userDetails;
    }
}
