package com.example.SpringBootFirst.service;

import com.example.SpringBootFirst.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

@Service
public class HelloWorldService {
    List<Student> stu= new ArrayList<>(
            Arrays.asList(
                    new Student(1,"sri"),
                    new Student(2,"karthika"))
    );
//    public String getmethod(){
//        return "THis is Get method";
//    }
//    public String postmethod(){
//        return "THis is post method";
//    }
//    public String putmethod(){
//        return "THis is put method";
//    }
//    public String deletemethod(){
//        return "THis is delete method";
//    }

    public List<Student> getmethod(){
        return stu;
    }
    public String postmethod(){
        return "THis is post method";
    }
    public String putmethod(){
        return "THis is put method";
    }
    public String deletemethod(){
        return "THis is delete method";
    }
}
