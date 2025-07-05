package com.example.helloworld.service;

import org.springframework.stereotype.Service;

import com.example.helloworld.exception.UserNotFoundException;
import com.example.helloworld.model.MessageResponse;
import com.example.helloworld.model.UserRequest;

@Service
public class HelloService {

    public MessageResponse getGreeting() {
        return new MessageResponse("service layer!");
    }

    // NEW: Greet by name
    public MessageResponse getPersonalGreeting(String name) {
        return new MessageResponse("Hello, " + name + "!");
    }

    public UserRequest getUserRequest(String name, String email, String message) {
        if (name == null) {
            throw new UserNotFoundException("User with name " + name + " not found");
        }

        UserRequest userRequest = new UserRequest();
        userRequest.setName(name);
        userRequest.setEmail(email);
        userRequest.setMessage(message);
        return userRequest;
    }
}
