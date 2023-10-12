package com.ji.oop011;

import com.ji.oop012.avengers.Ironman;

// planet(name,size,visiblity)
// people(name)

public class OMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Planet p1 = new Planet("earth",400000,true);
		People p = new People("홍길동");
		p1.addPeople(p);
		
		Ironman i = new Ironman();
		p.pick(i);
		p.help(i);
		
	}

}
