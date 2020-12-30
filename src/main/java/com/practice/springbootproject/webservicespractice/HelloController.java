package com.practice.springbootproject.webservicespractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path="/hello")
    public String sayHello(){
        return "Hello There!!";
    }
}