package com.ji.abst002;

public class AMain4 extends MyRandom{
	
	public static void main(String[] args) {		
		
		start();
	
	}
	
	public static void start() {
		
		int[] sum = calc(pickNumber());
		System.out.println("뽑은 숫자는 "+sum[0]+"이고 시도 횟수는 "+sum[1]+"번 이네요!");
		
	}
	

}
