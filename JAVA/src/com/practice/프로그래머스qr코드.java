package com.practice;

public class 프로그래머스qr코드 {
// StringBuilder를 사용하는 이유 String은 수정 불가능하지만 반면 StringBuilder은 동일한 객체 수정가능
	public static void main(String[] args) {
		int q = 3;
		int r = 1;
		String code = "qjnwezgrpirldywt";
		StringBuilder answer = new StringBuilder();
		
		for(int i = 0; i< code.length(); i++){
			if(i % q == r) {
				answer.append(code.charAt(i));
			}
		}
		System.out.println(answer.toString());
	}

}
