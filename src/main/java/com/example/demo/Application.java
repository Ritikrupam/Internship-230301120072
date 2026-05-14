package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Model.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(Application.class, args);

        StudentRepository studentRepository =
                context.getBean(StudentRepository.class);

        Student student = new Student();

        student.setName("Centurion");
        student.setEmail("cutm@ac.in");
        student.setAddress("Jatni");

        studentRepository.save(student);
    }
}