package com.driver;

import java.util.List;
import java.util.Set;

public class StudentRegistrationSystem {
	 private List<Student> studentList;
	    private Set<Integer> registeredStudentIds;

	    public StudentRegistrationSystem() {
	       // your code goes here
	    }

	    public void registerStudent(Student student) {
	        // your code goes here
	    }

	    public boolean isStudentRegistered(int studentId) {
	    	//your code goes here
	        return registeredStudentIds.contains(studentId);
	    }

	    public List<Student> getAllRegisteredStudents() {
	    	// your code goes here
	        return studentList;
	    }
}
