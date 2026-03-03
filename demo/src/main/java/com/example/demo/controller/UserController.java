package com.example.demo.controller;


import com.example.demo.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class UserController {




    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        return repo.getAllUsers();
    }

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User userData) {
        return repo.createUser(userData);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        return repo.deleteUser(id);
    }


}
