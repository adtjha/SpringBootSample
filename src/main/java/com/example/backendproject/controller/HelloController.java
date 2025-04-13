package com.example.backendproject.controller;

import com.example.backendproject.dto.BodyContent;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World from Spring Boot!";
    }

    @PostMapping("/greet")
    public String greet(@RequestBody BodyContent content) {
        return "Hello " + content.getName() + " from Spring Boot!";
    }
}
