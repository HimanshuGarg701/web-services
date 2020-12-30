package com.practice.springbootproject.webservicespractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path="/hello")
    public String sayHello(){
        return "Hello There!!";
    }

    @GetMapping(path="hello-bean")
    public HelloBean sayHelloBean(){
        return new HelloBean("Hello Bean");
    }

    @GetMapping(path="hello-bean/{name}")
    public HelloBean sayHelloWithPath(@PathVariable String name){
        return new HelloBean("Hello There " + name);
    }
}
