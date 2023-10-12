package com.ji.cap002;

public class Myself {

	private String name;
	private String address;
	private int age;
	private static final Myself MYSELF = new Myself("soldesk","강남구",15);

	private Myself() {
		super();
	}
	
	private Myself(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static Myself getMyself() {
		return MYSELF;
	}
	
	public void printInfo() {
		
		System.out.println("name : "+name);
		System.out.println("address : "+address);
		System.out.println("age : "+age);
		
	}
	
	
	
}
