package com.example.lombok.guide.models;

import java.util.Date;

public class Employee {

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

    public Employee(String firstName, String lastName, int age, double salary, String address, Date dob, Date dateJoined, int availableLeaves, String[] hobbies, String taxProfileID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.address = address;
        this.dob = dob;
        this.dateJoined = dateJoined;
        this.availableLeaves = availableLeaves;
        this.hobbies = hobbies;
        this.taxProfileID = taxProfileID;
    }
}