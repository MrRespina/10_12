package com.ji.cap002;

import java.util.Calendar;

public class SMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTimeZone());

		Myself ms = Myself.getMyself();
		System.out.println(ms);
		ms.printInfo();
		System.out.println();
		
		ms.setName("병천");
		ms.setAge(28);
		ms.setAddress("강서");
		ms.printInfo();
		System.out.println();
		Myself ms1 = Myself.getMyself();
		ms1.printInfo();
		
	}

}
