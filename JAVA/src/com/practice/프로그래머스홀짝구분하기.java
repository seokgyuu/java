package com.practice;

import java.util.Scanner;

public class 프로그래머스홀짝구분하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.printf("%d is odd",a);
		}
		else {
			System.out.printf("%d is even" ,a);
		}
	}

}
