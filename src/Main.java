import service.StudentManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\n Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1 :
                    system.addStudent();
                    break;
                case 2 :
                    system.viewAllStudents();
                    break;
                case 3 :
                    system.updateStudent();
                    break;
                case 4 :
                    system.deleteStudent();
                    break;
                case 5 :
                    System.out.println("Exiting");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }

        }
    }
}