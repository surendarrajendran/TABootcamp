package com.bootcampexercise.module10;

// Student class extending Person
public class Student extends Person {

    // attribute
    private String schoolName;

    // default constructor
    public Student() {
    }

    // parameterized constructor
    public Student(String name, int age, String schoolName) {
        setName(name);
        setAge(age);
        this.schoolName = schoolName;
    }

    // getter
    public String getSchoolName() {
        return schoolName;
    }

    // setter
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    // override introduce method
    @Override
    public void introduce() {
        System.out.println("My name is " + getName() + " and I am " + getAge() + " years old");
        System.out.println("I am study in university " + schoolName);
    }
}