package Assigments02;

import java.util.Arrays;

class Course {

    private String courseName;
    private String[] students;
    private int numberOfStudents;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new String[4];
        this.numberOfStudents = 0;
    }

    // Get course name
    public String getCourseName() {
        return courseName;
    }

    // Add a student
    public void addStudent(String student) {

        // If array is full, create a larger array
        if (numberOfStudents >= students.length) {

            String[] newStudents = new String[students.length * 2];

            for (int i = 0; i < students.length; i++) {
                newStudents[i] = students[i];
            }

            students = newStudents;
        }

        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    // Drop a student
    public void dropStudent(String student) {

        for (int i = 0; i < numberOfStudents; i++) {

            if (students[i].equals(student)) {

                // Move the remaining students one position left
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }

                students[numberOfStudents - 1] = null;
                numberOfStudents--;

                break;
            }
        }
    }

    // Get students
    public String[] getStudents() {

        return Arrays.copyOf(students, numberOfStudents);
    }

    // Get number of students
    public int getNumberOfStudents() {

        return numberOfStudents;
    }
}


public class CourseProgram {

    public static void main(String[] args) {

        Course course = new Course("Java Programming");

        course.addStudent("Mohamed Amiin");
        course.addStudent("Ahmed");
        course.addStudent("Ali");
        course.addStudent("Hassan");
        course.addStudent("Omar");

        System.out.println("Course Name: " + course.getCourseName());

        System.out.println("Number of Students: "
                + course.getNumberOfStudents());

        System.out.println("Students:");

        for (String student : course.getStudents()) {
            System.out.println(student);
        }

        // Drop a student
        course.dropStudent("Ali");

        System.out.println("\nAfter dropping Ali:");

        System.out.println("Number of Students: "
                + course.getNumberOfStudents());

        System.out.println("Students:");

        for (String student : course.getStudents()) {
            System.out.println(student);
        }
    }
}