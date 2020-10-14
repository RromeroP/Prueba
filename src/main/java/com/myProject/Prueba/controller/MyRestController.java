package com.myProject.Prueba.controller;

import com.myProject.Prueba.data.Student;

@RestController

public class MyRestController {

    @GetMapping("/getStudent")

    public Student getStudent(@RequestParam(value = "name", defaultValue = "Pepito") String name) {
        Student aux = new Student();
        aux.setName(name);
        aux.setMark(8);
        return aux;
    }
}
