package com.bootcampexercise.module8;

import java.util.ArrayList;

// this class handles student operations
public class StudentActivity {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        // adding students
        addStudent(students, new Student(1, "Surendar", 85.5));
        addStudent(students, new Student(2, "Ilmars", 78.0));
        addStudent(students, new Student(3, "Jana", 92.3));
        addStudent(students, new Student(4, "Wajid", 88.8));
        addStudent(students, new Student(4, "Rajendran", 88.9)); // Duplicate entry for validation

        // print all students
        System.out.println("All Students:");
        printStudents(students);

        // remove student with id 3
        removeStudentById(students, 3);

        // print after removal
        System.out.println("After removing id 3:");
        printStudents(students);

        // find highest grade student
        findHighestGradeStudent(students);
    }

    // method to add student (prevent duplicate id)
    static void addStudent(ArrayList<Student> list, Student student) {

        for (Student s : list) {
            if (s.getId() == student.getId()) {
                System.out.println("Student with id " + student.getId() + " already exists");
                return;
            }
        }

        list.add(student);
    }

    // method to print all students
    static void printStudents(ArrayList<Student> list) {

        for (Student s : list) {
            s.printStudent();
        }
    }

    // method to remove student by id
    static void removeStudentById(ArrayList<Student> list, int id) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
                break;
            }
        }
    }

    // method to find highest grade student
    static void findHighestGradeStudent(ArrayList<Student> list) {

        if (list.isEmpty()) {
            System.out.println("No students available");
            return;
        }

        Student topStudent = list.get(0);

        for (Student s : list) {
            if (s.getGrade() > topStudent.getGrade()) {
                topStudent = s;
            }
        }

        System.out.println("Top Student:");
        topStudent.printStudent();
    }
}

/*

Output:

Student with id 4 already exists
All Students:
Id: 1, Name: Surendar, Grade: 85.5
Id: 2, Name: Ilmars, Grade: 78.0
Id: 3, Name: Jana, Grade: 92.3
Id: 4, Name: Wajid, Grade: 88.8
After removing id 3:
Id: 1, Name: Surendar, Grade: 85.5
Id: 2, Name: Ilmars, Grade: 78.0
Id: 4, Name: Wajid, Grade: 88.8
Top Student:
Id: 4, Name: Wajid, Grade: 88.8

*/