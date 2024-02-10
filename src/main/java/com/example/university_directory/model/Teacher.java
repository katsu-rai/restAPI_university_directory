package com.example.university_directory.model;

public class Teacher extends Person{
    private String major;
    public Teacher(String name, String age, String phoneNumber, Integer id, String major) {
        super(name, age, phoneNumber, id);
        this.major = major;
    }
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
