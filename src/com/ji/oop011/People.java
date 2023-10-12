package com.ji.oop011;

import com.chung.mar281.avengers.Avengers;
import com.ji.oop012.avengers.Ironman;

public class People {
	
	private String name;
	private Avengers hero;

	public People() {
		// TODO Auto-generated constructor stub
	}
	
	People(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void pick(Avengers a) {
		hero = a;
		System.out.println(hero+"등장!");
	}
	
	public void pick(Ironman i) {
		String name = i.getName();
		System.out.println(name+"등장!");
	}
	
	public void help(Avengers a) {
		hero.attack();
	}
	
	public void help(Ironman i) {
		i.attack();
	}

}
