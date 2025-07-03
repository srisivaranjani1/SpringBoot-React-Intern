package com.example.SpringBootFirst.controllers;

import com.example.SpringBootFirst.models.Student;
import com.example.SpringBootFirst.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
//@Controller
//@ResponseBody
//@RestController
//public class HelloWorldController {
//    @GetMapping("/")
//    public String hello(){
//        System.out.println("Hello world");
//        return "Hello world this is universe";
//        //return "";// run here and rerun the server in localhost and refresh the host
//    }
//}


@RestController
public class HelloWorldController {
    @Autowired
    private HelloWorldService hws;

    @GetMapping("/")
    public List<Student> getmethod() {
        return hws.getmethod();
    }
    @PostMapping("/")
    public String postmethod(){
        return hws.postmethod();
    }
    @PutMapping("/")
    public String putmethod() {
        return hws.putmethod();
    }
    @DeleteMapping("/")
    public String deletemethod(){
        return hws.deletemethod();
    }
}