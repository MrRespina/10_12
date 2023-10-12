package com.ji.oop010.register;

public class Academy {
	
	private int studentCount=0;
	
	public Student consult(String name, int age) {
		studentCount++;
		Student s = new Student(studentCount,name,age);
		return s;
		
	}

}
