package com.ji.oop011;

public class Planet {

	private String name;
	private int size;
	private boolean visible;
	
	public Planet() {
		// TODO Auto-generated constructor stub
	}

	Planet(String name, int size, boolean visible) {
		super();
		this.name = name;
		this.size = size;
		this.visible = visible;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visiblity) {
		this.visible = visiblity;
	}
	
	public void addPeople(People p) {
		
		System.out.printf("%s에 %s(이)가 입주\n",name,p.getName());
		
	}
	
	
}
