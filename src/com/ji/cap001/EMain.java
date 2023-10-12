package com.ji.cap001;

import java.util.Scanner;

import javax.swing.JFrame;

public class EMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h = new Human();
		Scanner s = new Scanner(System.in);
		System.out.print("이름 : ");
		String n = s.next();
		System.out.print("나이 : ");
		int a = s.nextInt();
		h.setName(n);
		h.setAge(a);
		h.printInfo();
		s.nextLine();
		System.out.println("====================");
		
		Coffee c = new Coffee();
		System.out.print("커피 이름 : ");
		n = s.nextLine();
		System.out.print("가격 : ");
		int price = s.nextInt();
		c.setName(n);
		c.setPrice(price);
		c.printInfo();
		s.nextLine();
		System.out.println("====================");
		
		Coffee c2 = new Coffee("LATTE",2500);
		c2.printInfo();
		
		JFrame j = new JFrame("???");
		j.setSize(300,300);
		j.setVisible(true);
		
	}

}
