package com.example.helloworld.service;

import com.example.helloworld.exception.UserNotFoundException;
import com.example.helloworld.model.User;
import com.example.helloworld.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(String name, String password) {
        User user = new User();
        user.setUsername(name);
        user.setPassword(password);
        return userRepository.save(user);
    }

    public User getUser(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User ID " + id + " not found"));
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
