package com.practice;

public class 프로그래머스이어붙인수 {

	public static void main(String[] args) {
		
		int[] numList = {3,4,5,2,1};
		
		//StringBuilder -> 객체선언
		StringBuilder oddNumbers = new StringBuilder(); //홀수
		StringBuilder evenNumbers = new StringBuilder(); //짝수
		
		//리스트를 순회하면서 홀 짝 구분
		for (int num : numList) { 
			if(num % 2 ==0) {
				evenNumbers.append(num); // append -> 문자열 추가
			}else {
				oddNumbers.append(num);
			}
		}
		// 문자열 -> 정수로 변환
		int oddSum = Integer.parseInt(oddNumbers.toString());
		int evenSum = Integer.parseInt(evenNumbers.toString());
		
		System.out.println(oddSum);
		System.out.println(evenSum);
		System.out.println(oddSum+evenSum);
			
		}
		
	}

