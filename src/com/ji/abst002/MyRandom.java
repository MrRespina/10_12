package com.ji.abst002;

import java.util.Random;

public abstract class MyRandom {

	static int count = 0;
	
	public MyRandom() {
		// TODO Auto-generated constructor stub
		
	}
	
	public static int pickNumber() {
		
		Random r = new Random();
		int i = r.nextInt(10)+1;
		System.out.println("뽑은 숫자 : "+i);
		count++;
		
		return i;
		
	}
	
	public static int[] calc(int number) {
		
		if(number%2 != 0) {
			
			int[] sum = new int[2];
			sum[0] = number;
			sum[1] = count;
			
			System.out.println("홀수입니다 !");
			return sum;
			
		}else {
			
			System.out.println("짝수네요 ?");
			return calc(pickNumber());
			
		}
		
	}

}
