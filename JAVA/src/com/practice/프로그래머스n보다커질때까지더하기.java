package com.practice;

public class 프로그래머스n보다커질때까지더하기 {

	public static void main(String[] args) {

		int[] numbers = {34,5,71,29,100,34};
		int n = 123;
		int sum = 0;
		
		for(int i=0; i<numbers.length; i++) {
			sum += numbers[i];
			if(sum > n) {
				break;
			}
		}
		System.out.println(sum);
		
		
	}

}
