package com.example.university_directory.model;

public class Student extends Person {
    private String year;
    private String credit;
    public Student(String name, String age, String phoneNumber, Integer id, String year, String credit) {
        super(name, age, phoneNumber, id);
        this.year = year;
        this.credit = credit;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }
}
