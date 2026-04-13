package com.bootcampexercise.module10;

// main class to test Employee and Student
public class AbstractActivity {

    public static void main(String[] args) {

        // Employee object
        Employee emp = new Employee("Surendar Rajendran", 24, "Intern", "Accenture", 500);
        emp.introduce();

        System.out.println("--------------------");

        // Student object
        Student stu = new Student("Surendar Rajendran", 24, "Riga Nordic University");
        stu.introduce();
    }
}

/*

Output:

My name is Surendar Rajendran and I am 24 years old
I am work as Intern in Accenture and my salary is 500.0
--------------------
My name is Surendar Rajendran and I am 24 years old
I am study in university Riga Nordic University

 */