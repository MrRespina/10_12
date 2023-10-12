package com.ji.abst001;

class Animal{
	
	void Sound() {
		System.out.println("Animal class의 sound() : ");
	}
	
}

class Dog extends Animal{
	
	void Sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
	
}

class Cat extends Animal{
	
	void Sound() {
		// TODO Auto-generated method stub
		System.out.println("야옹");
	}
	
}

public class AMain1 {
	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.Sound();
		Dog d = new Dog();
		d.Sound();
		Cat c = new Cat();
		c.Sound();
		
	}

}
