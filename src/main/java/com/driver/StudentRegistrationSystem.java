package com.driver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentRegistrationSystem {
	private List<Student> studentList;
	private Set<Integer> registeredStudentIds;

	public StudentRegistrationSystem() {
		studentList = new ArrayList<>();
		registeredStudentIds = new HashSet<>();
	}

	public void registerStudent(Student student) {
		if (!registeredStudentIds.contains(student.getStudentId())) {
			studentList.add(student);
			registeredStudentIds.add(student.getStudentId());
			System.out.println("Student registered successfully.");
		} else {
			System.out.println("Student with the same ID already exists.");
		}
	}

	public boolean isStudentRegistered(int studentId) {
		return registeredStudentIds.contains(studentId);
	}

	public List<Student> getAllRegisteredStudents() {
		return studentList;
	}
}