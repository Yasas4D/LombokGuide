package com.example.lombok.guide.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StudentLombok {
    private Integer studentId;
    private String name;
    private int age;
    private String email;
    private int mobileNo;
    private String pCodeNo;
}
