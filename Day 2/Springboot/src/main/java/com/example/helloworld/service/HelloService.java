package com.example.helloworld.service;

import org.springframework.stereotype.Service;

import com.example.helloworld.model.MessageResponse;

@Service
public class HelloService {
    public MessageResponse getGreeting() {
        return new MessageResponse("Hello from the service layer!");
    }
}