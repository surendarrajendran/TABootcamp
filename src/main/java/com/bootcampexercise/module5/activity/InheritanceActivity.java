package com.bootcampexercise.module5.activity;

/**
 * Class Name: InheritanceActivity
 *
 * Description:
 * This class demonstrates inheritance by using Person_I and Employee_I.
 */
public class InheritanceActivity {

    /**
     * Main method - entry point of the program
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Create Person object and set details
        Person_I myPerson = createPerson();

        // Print Person details
        printPersonDetails(myPerson);

        System.out.println("-----------------------------");

        // Create Employee object and set details
        Employee_I myEmployee = createEmployee();

        // Print Employee details
        printEmployeeDetails(myEmployee);

        System.out.println("-----------------------------");
    }

    /**
     * Method to create and initialize Person object
     */
    public static Person_I createPerson() {

        Person_I person = new Person_I();

        person.setName("Sarah Johnson");
        person.setAge(21);

        return person;
    }

    /**
     * Method to print Person details
     */
    public static void printPersonDetails(Person_I person) {

        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Age: " + person.getAge());
    }

    /**
     * Method to create and initialize Employee object
     */
    public static Employee_I createEmployee() {

        Employee_I employee = new Employee_I();

        employee.setName("Shawn Cun");
        employee.setAge(32);
        employee.setTitle("Developer");
        employee.setSalary(70000.00);

        return employee;
    }

    /**
     * Method to print Employee details
     */
    public static void printEmployeeDetails(Employee_I employee) {

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.getAge());
        System.out.println("Employee Title: " + employee.getTitle());
        System.out.println("Employee Salary: " + employee.getSalary());
    }
}