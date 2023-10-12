package com.ji.oop010.register;

//library class name
//JavaBean , POJO(Plain Old Java Object) , DTO(Data Temporary Object), DTO(Data Transfer Object)

public class Student {
	
	private int num,age;
	private String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int num, String name, int age) {
		super();
		this.num = num;
		this.age = age;
		this.name = name;
	}
	

	public void printInfo() {
		System.out.println(num);
		System.out.println(age);
		System.out.println(name);
	}
	
	

}
