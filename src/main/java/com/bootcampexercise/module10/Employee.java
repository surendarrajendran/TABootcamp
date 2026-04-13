package com.bootcampexercise.module10;

// Employee class extending Person
public class Employee extends Person {

    // attributes
    private String jobTitle;
    private String company;
    private double salary;

    // default constructor
    public Employee() {
    }

    // parameterized constructor
    public Employee(String name, int age, String jobTitle, String company, double salary) {
        setName(name);
        setAge(age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    // getters
    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }

    // setters
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // override introduce method
    @Override
    public void introduce() {

        System.out.println("My name is " + getName() + " and I am " + getAge() + " years old");
        System.out.println("I am work as " + jobTitle + " in " + company + " and my salary is " + salary);
    }

    // static method to find highest paid employee
    public static String getHighestPaidEmp(java.util.List<Employee> list) {

        if (list == null || list.isEmpty()) {
            return "No employees";
        }

        Employee highest = list.get(0);

        for (Employee e : list) {
            if (e.getSalary() > highest.getSalary()) {
                highest = e;
            }
        }

        return highest.getName();
    }
}