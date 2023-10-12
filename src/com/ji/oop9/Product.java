package com.ji.oop9;

public class Product {

	String name;
	int price;
	
	public Product() {
		super();
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("제품명 : "+name);
		System.out.println("가격 : "+price);
	}	
	
}
