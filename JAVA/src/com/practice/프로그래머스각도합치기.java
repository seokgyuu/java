package com.practice;

import java.util.Scanner;

public class 프로그래머스각도합치기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int angle1 = sc.nextInt();
		Scanner sc2 = new Scanner(System.in); 
		int angle2 = sc.nextInt();
		
		int result = angle1 + angle2;
		
		if( result > 360) {
			System.out.println(result % 360);
		}else {
			System.out.println(result);
		}
		
		
		
	}

}
