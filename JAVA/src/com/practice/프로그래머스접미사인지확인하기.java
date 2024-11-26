package com.practice;

public class 프로그래머스접미사인지확인하기 {

	public static void main(String[] args) {
		String my_string = "banana";
		String is_suffix = "ana";

		int answer = (my_string.endsWith(is_suffix)) ? 1:0;
		System.out.println(answer);
		
		
		//endWith 접미사로 끝나는지 확인하는 메서드
	}

}
