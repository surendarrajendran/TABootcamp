package com.bootcampexercise.module10;

import java.util.ArrayList;
import java.util.List;

// class to handle employee list
public class EmployeeList {

    public static void main(String[] args) {

        // create 5 employee objects
        Employee e1 = new Employee("Surendar", 24, "Developer", "Accenture", 500);
        Employee e2 = new Employee("Ilmars", 30, "Manager", "Accenture", 700);
        Employee e3 = new Employee("Jana", 28, "Analyst", "Accenture", 600);
        Employee e4 = new Employee("Wajid", 35, "Lead", "TCS", 800);
        Employee e5 = new Employee("Disha", 30, "Architect", "TCS", 900);

        // create list and add employees
        List<Employee> empList = new ArrayList<>();

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

        // find highest paid employee
        String highestEmp = Employee.getHighestPaidEmp(empList);

        // print result
        System.out.println("The Employee whose salary is the highest is : " + highestEmp);
    }
}

/*

Output:

The Employee whose salary is the highest is : Disha

 */