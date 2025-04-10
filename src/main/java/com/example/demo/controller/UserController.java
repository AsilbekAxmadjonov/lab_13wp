package com.example.demo.controller;

import com.example.demo.dto.ResponseDTO;
import com.example.demo.exception.User;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping()
    public User addUser(@Valid @RequestBody User newUser) {
        System.out.println("New User");
        System.out.println(newUser);
        return newUser;
    }

    @GetMapping()
    public ResponseDTO getResponse() {
        return new ResponseDTO("Hello", 200, LocalDateTime.now());
    }
}
