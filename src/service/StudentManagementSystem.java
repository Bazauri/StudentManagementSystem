package service;

import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);


    // Add a new student
    public void addStudent() {
        System.out.println("Enter Student ID:");
        String id = scanner.nextLine();

        System.out.println("Enter Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Age:");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Grade:");
        String grade = scanner.nextLine();

        Student student = new Student(id, name, age, grade);
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // View all students
    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Update a student
    public void updateStudent() {
        System.out.println("Enter Student ID to update:");
        String id = scanner.nextLine();

        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Enter new Name (leave blank to skip):");
                String name = scanner.nextLine();
                if (!name.isEmpty()) student.setName(name);

                System.out.println("Enter new Age (0 to skip):");
                int age = Integer.parseInt(scanner.nextLine());
                if (age != 0) student.setAge(age);

                System.out.println("Enter new Grade (leave blank to skip):");
                String grade = scanner.nextLine();
                if (!grade.isEmpty()) student.setGrade(grade);

                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // Delete a student
    public void deleteStudent() {
        System.out.println("Enter Student ID to delete:");
        String id = scanner.nextLine();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                students.remove(i);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
}