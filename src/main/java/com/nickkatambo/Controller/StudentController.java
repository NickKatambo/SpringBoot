package com.nickkatambo.Controller;

import com.nickkatambo.Entity.Student;
import com.nickkatambo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "getAllStudents",method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return  studentService.getAllStudents();
    }
}
