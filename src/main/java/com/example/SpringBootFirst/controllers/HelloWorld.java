package com.example.SpringBootFirst.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class HelloWorld {
    @GetMapping("/")
    public String hello(){
        System.out.println("Hello world");
        return "Hello world this is universe";
        //return "";// run here and rerun the server in localhost and refresh the host
    }
}