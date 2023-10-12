package com.ji.abst001.avengers;

import com.ji.abst001.driver.Driver;
import com.ji.abst001.smoker.Smoker;

public class Ironman extends Avengers implements Smoker,Driver{

		private String realName;
		
		public Ironman() {
			// TODO Auto-generated constructor stub
		}
		

		public Ironman(String name,int age,String realName) {
			super(name,age);
			this.realName = realName;
		}
		
		public void printInfo() {
			super.printInfo();
		}

		@Override
		public void smoke() {
			System.out.println("흡연");
			// TODO Auto-generated method stub
		}

		@Override
		public void attack() {
			// TODO Auto-generated method stub
			System.out.println("리펄서 빔");
		}

		@Override
		public void driver() {
			// TODO Auto-generated method stub
			System.out.println("운전");
			
		}
		
}
