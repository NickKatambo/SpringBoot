package com.nickkatambo.Dao;

import com.nickkatambo.Entity.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StudentDao {

    private static Map<Integer, Student> students;
    static {
        students = new HashMap<Integer, Student>(){
            {
                // To copy lines downward use CTRL + D
                put(1, new Student(1, "Pharez","Katambo","Medicine"));
                put(2, new Student(2, "Pearl","Katambo","Electrical Engineer"));
                put(3, new Student(3, "Johan","Katambo","Computer Science"));
                put(4, new Student(4, "Nick","Katambo","Lawyer"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        return students.values();
    }
}
