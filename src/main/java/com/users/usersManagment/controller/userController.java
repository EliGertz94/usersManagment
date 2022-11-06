package com.users.usersManagment.controller;

import com.users.usersManagment.exception.UserNotFoundException;
import com.users.usersManagment.model.User;
import com.users.usersManagment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")

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

    @DeleteMapping("/clearuser/{id}")
    public void deleteUser(@PathVariable Long id){

       userRepository.deleteById(id);
    }

    @GetMapping("/user/{id}")
    public User getUserByUd(@PathVariable Long id){
        return userRepository.findById(id).orElseThrow(()-> new UserNotFoundException(id));
    }
}
