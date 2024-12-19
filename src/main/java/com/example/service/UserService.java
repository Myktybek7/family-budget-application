package com.example.service;

import com.example.repository.UserRepository;

public class UserService {
    private UserRepository userRepository = new UserRepository();

    public void registerUser(String username, String password) {
        User user = new User(username, password);
        userRepository.saveUser(user);
    }
}
