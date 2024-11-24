package com.practice;

public class 프로그래머스홀수vs짝수 {

	public static void main(String[] args) {
		int num_list[] = {4,2,6,1,7,6};
		int answer = 0;
		
		for(int i=0; i < num_list.length; i++) {
			if(i % 2 == 1) {
				answer += num_list[i];
			}
		}
		System.out.println(answer);
		
	}

}
