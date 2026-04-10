package com.bootcampexercise.module8;

// class to store student details
public class Student {

    // student attributes
    private int id;
    private String name;
    private double grade;

    // constructor
    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // method to print student details
    public void printStudent() {
        System.out.println("Id: " + id + ", Name: " + name + ", Grade: " + grade);
    }
}