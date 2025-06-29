package com.example.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloworld.model.MessageResponse;
import com.example.helloworld.service.HelloService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")  // Allow frontend origin
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/message")
    public MessageResponse sayHello() {
        return helloService.getGreeting();
    }
}