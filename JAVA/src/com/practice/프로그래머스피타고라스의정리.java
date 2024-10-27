package com.practice;

import java.util.Scanner;

public class 프로그래머스피타고라스의정리 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);		
		int a = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);		
		int c = sc2.nextInt();
		
		int b_square = (c*c) - (a*a);
		
		System.out.println(b_square);
		
	}

}
