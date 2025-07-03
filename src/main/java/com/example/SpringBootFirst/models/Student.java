package com.example.SpringBootFirst.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private int studentID;
    private String studentName;


//    public Student(int studentID, String studentName) {
//        this.studentID=studentID;
//        this.studentName=studentName;
//    }

}
