package com.practice.springbootproject.webservicespractice.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public void addUser(@RequestBody User user){
        userDao.addUser(user);
    }
}
