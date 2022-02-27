package com.example.lombok.guide.models;

public class Student {
    private Integer studentId;
    private String name;
    private int age;
    private String email;
    private int mobileNo;
    private String pCodeNo;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getpCodeNo() {
        return pCodeNo;
    }

    public void setpCodeNo(String pCodeNo) {
        this.pCodeNo = pCodeNo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("studentId=").append(studentId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", email='").append(email).append('\'');
        sb.append(", mobileNo=").append(mobileNo);
        sb.append('}');
        return sb.toString();
    }
}
