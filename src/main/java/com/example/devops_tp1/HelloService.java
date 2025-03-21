package com.example.devops_tp1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

    @GetMapping("/hello")
    public String hello() {
         return "Hello !";
     }
}
