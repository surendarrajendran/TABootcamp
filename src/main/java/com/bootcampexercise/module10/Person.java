package com.bootcampexercise.module10;

// abstract class Person
public abstract class Person {

    // attributes
    private String name;
    private int age;

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // method to introduce person
    public void introduce() {
        System.out.println("Good day, my name is " + name + " and I am " + age + " years old.");
    }
}