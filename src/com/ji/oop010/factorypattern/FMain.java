package com.ji.oop010.factorypattern;

import com.ji.oop010.register.Academy;
import com.ji.oop010.register.Student;

public class FMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Academy a = new Academy();
		
		Student s1 = a.consult("홍길동", 13);
		s1.printInfo();
		Student s2 = a.consult("김길동", 20);
		s2.printInfo();
		Student s3 = a.consult("박길동", 18);
		s3.printInfo();
		
		
		
	}

}
