package com.ji.abst001.avengers;

public class AMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//anonymous inner class(익명 내부 클래스)
		Avengers a = new Avengers() {

			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("Assamble!");
			}
			
		};
		a.printInfo();
		a.attack();
		
		Ironman i = new Ironman("아이언맨",50,"토니스타크");
		i.printInfo();
		i.attack();
		i.driver();
		i.smoke();
		System.out.println("==========");
		
		Hulk h = new Hulk("헐크",40,1000000);
		h.printInfo();
		h.attack();

	}

}
