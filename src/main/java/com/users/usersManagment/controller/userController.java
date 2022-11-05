package com.users.usersManagment.controller;

import com.users.usersManagment.model.User;
import com.users.usersManagment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    public User addUser(@RequestBody User user){
       return userRepository.save(user);
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}