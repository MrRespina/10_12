package com.ji.oop012.avengers;

import com.chung.mar281.avengers.Avengers;

public class Ironman implements Avengers{
	
	private final String name="Iron Man";
	
	public String getName() {
		return name;
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("돈으로 사람을 때림.");
	}


}
