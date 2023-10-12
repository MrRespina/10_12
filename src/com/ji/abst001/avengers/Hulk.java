package com.ji.abst001.avengers;

public class Hulk extends Avengers{

	private int pantsPrice;
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Hulk Smash!");
		
	}
	
	public Hulk() {
		// TODO Auto-generated constructor stub
	}

	public Hulk(int pantsPrice) {
		super();
		this.pantsPrice = pantsPrice;
	}
	
	Hulk(String name, int age, int pantsPrice) {
		super(name, age);
		this.pantsPrice = pantsPrice;
	}

	public int getPantsPrice() {
		return pantsPrice;
	}

	public void setPantsPrice(int pantsPrice) {
		this.pantsPrice = pantsPrice;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Price : "+pantsPrice+"??");
	}
	

}
