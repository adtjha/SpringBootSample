package com.example.backendproject.controller;

import com.example.backendproject.entity.User;
import com.example.backendproject.repository.UserRepository;
import com.example.backendproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser( ) {
        User user = new User();
        user.setName("Aditya Jha");
        user.setEmail("aditya@gmail.com");
        user.setPassword("@123pass");
        System.out.println("User Created :"+ user);
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
