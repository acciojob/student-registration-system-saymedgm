package com.driver;

import java.util.List;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        StudentRegistrationSystem registrationSystem = new StudentRegistrationSystem();
	        Scanner scanner = new Scanner(System.in);

	        boolean exit = false;
	        while (!exit) {
	            System.out.println("1. Register Student");
	            System.out.println("2. Check Student Registration");
	            System.out.println("3. Display All Registered Students");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Student ID: ");
	                    int studentId = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline character
	                    System.out.print("Enter Student Name: ");
	                    String studentName = scanner.nextLine();
	                    Student student = new Student(studentId, studentName);
	                    registrationSystem.registerStudent(student);
	                    break;

	                case 2:
	                    System.out.print("Enter Student ID to check registration: ");
	                    int checkStudentId = scanner.nextInt();
	                    boolean isRegistered = registrationSystem.isStudentRegistered(checkStudentId);
	                    if (isRegistered) {
	                        System.out.println("Student is registered.");
	                    } else {
	                        System.out.println("Student is not registered.");
	                    }
	                    break;

	                case 3:
	                    List<Student> registeredStudents = registrationSystem.getAllRegisteredStudents();
	                    System.out.println("Registered Students:");
	                    for (Student s : registeredStudents) {
	                        System.out.println("Student ID: " + s.getStudentId() + ", Name: " + s.getName());
	                    }
	                    break;

	                case 4:
	                    exit = true;
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	        scanner.close();
	    }
}
