package com.example.easyapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello() {
        return "Welcome to the DevOps class of 2025!";
    }
}
