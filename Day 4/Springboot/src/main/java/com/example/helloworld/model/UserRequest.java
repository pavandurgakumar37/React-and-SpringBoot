package com.example.helloworld.model;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class UserRequest {
    private String name;
    private String email;
    private String message;
}