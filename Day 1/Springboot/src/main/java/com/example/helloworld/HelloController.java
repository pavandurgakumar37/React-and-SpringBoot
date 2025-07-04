package com.example.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")  // Allow frontend origin
public class HelloController {

    @GetMapping("/message")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }
}