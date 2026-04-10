package com.bootcampexercise.module9;

import junit.framework.TestCase;
import java.util.ArrayList;

import com.bootcampexercise.module8.Student;

// test class for Student
public class StudentTest extends TestCase {

    private ArrayList<Student> students;

    // setup
    protected void setUp() {
        students = new ArrayList<>();

        students.add(new Student(1, "Surendar", 85.5));
        students.add(new Student(2, "Ilmars", 78.0));
        students.add(new Student(3, "Jana", 92.3));
        students.add(new Student(4, "Wajid", 88.8));
    }

    // teardown
    protected void tearDown() {
        students = null;
    }

    // 1. test getters
    public void testGetters() {
        Student s = students.get(0);

        assertEquals(1, s.getId());
        assertEquals("Surendar", s.getName());
        assertEquals(85.5, s.getGrade());
    }

    // 2. test setters
    public void testSetters() {
        Student s = new Student(5, "Test", 60.0);

        s.setName("Updated");
        s.setGrade(75.0);

        assertEquals("Updated", s.getName());
        assertEquals(75.0, s.getGrade());
    }

    // 3. test list size
    public void testListSize() {
        assertEquals(4, students.size());
    }

    // 4. test remove manually
    public void testRemoveStudent() {
        students.remove(2); // remove Jana
        assertEquals(3, students.size());
    }

    // 5. test highest grade logic
    public void testHighestGrade() {

        Student topStudent = students.get(0);

        for (Student s : students) {
            if (s.getGrade() > topStudent.getGrade()) {
                topStudent = s;
            }
        }

        assertEquals(92.3, topStudent.getGrade());
    }

    // 6. test empty list
    public void testEmptyList() {
        students.clear();
        assertTrue(students.isEmpty());
    }

    // 7. test single student case
    public void testSingleStudent() {
        students.clear();
        students.add(new Student(1, "Only", 70.0));

        Student s = students.get(0);
        assertEquals(70.0, s.getGrade());
    }
}

/*
Output:

7 tests passed
testEmptyList
testGetters
testRemoveStudent
testSetters
testListSize
testSingleStudent
testHighestGrade
 */