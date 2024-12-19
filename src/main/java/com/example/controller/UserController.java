package com.example.controller;

import com.example.auth.AuthService;

public class UserController {
    private AuthService authService = new AuthService();

    public String login(String username, String password) {
        if (authService.authenticate(username, password)) {
            return "Login Successful";
        } else {
            return "Login Failed";
        }
    }
}
