package com.myProject.Prueba.controller;

import com.myProject.Prueba.data.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class MyRestController {

    @GetMapping("/getStudent")

    public Student getStudent(@RequestParam(value = "name", defaultValue = "Pepito") String name) {
        Student aux = new Student();
        aux.setName(name);
        aux.setMark(8);
        return aux;
    }

    @GetMapping("/createStudent")
    public List<Student> createStudent(@RequestParam(value = "q", defaultValue = "1") Integer numStudents) {
        ArrayList<Student> arrData 
    }
}
