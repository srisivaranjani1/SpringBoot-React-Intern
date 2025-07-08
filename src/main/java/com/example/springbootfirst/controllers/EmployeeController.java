package com.example.springbootfirst.controllers;


import com.example.springbootfirst.models.Employee;
import com.example.springbootfirst.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private HelloWorldService hws;

    @GetMapping("/")
    public String route(){
        return "Welcome to SpringBoot Security";
    }

    @GetMapping("/employee")
    public List<Employee> getMethod(){
        return hws.getMethod();
    }

    @GetMapping("/employee/{empID}")
    public Employee getEmployeeById(@PathVariable int empID){
        return hws.getEmployeeById(empID);
    }

    @GetMapping("/employee/job/{job}")
    public List<Employee> getEmployeeByJob(@PathVariable String job){
        return hws.getEmployeeByJob(job);
    }

    @PostMapping("/employee")
    public String postMethod(@RequestBody Employee employee){
//        Employee employee = new Employee(5,"Sivagami", "Business");
        return hws.addEmployee(employee);
    }
    @PutMapping("/employee")
    public String putMethod(@RequestBody Employee employee){
        return hws.updateEmployee(employee);
    }
    @DeleteMapping("/employee/{empID}")
    public String deleteMethod(@PathVariable int empID){
        return hws.deleteEmployeeById(empID);
    }
}
