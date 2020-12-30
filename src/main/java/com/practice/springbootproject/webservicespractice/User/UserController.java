package com.practice.springbootproject.webservicespractice.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    public UserDaoService userDao;

    @GetMapping(path="/users")
    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }

    @GetMapping(path="/users/{id}")
    public User getUser(@PathVariable int id){
        return userDao.getUser(id);
    }

    @PostMapping(path="/users")
    public ResponseEntity<Object> addUser(@RequestBody User user){
        User createdUser = userDao.addUser(user);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdUser.getId()).toUri();

        return ResponseEntity.created(location).build();
    }
}
