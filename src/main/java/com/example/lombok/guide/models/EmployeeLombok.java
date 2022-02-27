package com.example.lombok.guide.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
public class EmployeeLombok {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private String address;
    private Date dob;
    private Date dateJoined;
    private int availableLeaves;
    private String[] hobbies;
    private String taxProfileID;
}
