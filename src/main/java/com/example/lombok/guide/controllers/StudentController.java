package com.example.lombok.guide.controllers;

import com.example.lombok.guide.models.Student;
import com.example.lombok.guide.models.StudentLombok;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

    @EventListener(ApplicationReadyEvent.class)
    public void initStudent() {
        System.out.println("With vanilla Java");
        Student a = new Student();
        a.setStudentId(1);
        a.setName("Yasas");
        a.setAge(25);
        a.setEmail("yasassandeepa007@gmail.com");
        a.setMobileNo(000000);
        System.out.println(a);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void initLombokStudent() {
        System.out.println("With Lombok");
        StudentLombok b = new StudentLombok();
        b.setStudentId(1);
        b.setName("Yasas");
        b.setAge(25);
        b.setEmail("yasassandeepa007@gmail.com");
        b.setMobileNo(000000);
        System.out.println(b);
    }
}
