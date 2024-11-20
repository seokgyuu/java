package com.practice;

public class 프로그래머스문자열곱하기 {

	public static void main(String[] args) {

		String my_string = "String";
		int k =3;
		String answer ="";
		
		for(int i=0; i < k; i++) {
			answer += my_string;
		}
		System.out.println(answer);
	}

}
