package com.practice;

public class 프로그래머스닉네임규칙 {

	public static void main(String[] args) {
		String nickname = "GO";
	    String answer = "";
	   
	    for(int i=0; i<nickname.length(); i++){
	      if(nickname.charAt(i) == 'l'){
	        answer += "I";
	      }
	      else if(nickname.charAt(i) == 'w'){
	        answer += "vv";
	      }
	      else if(nickname.charAt(i) == 'W'){
	        answer += "VV";
	      }
	      else if(nickname.charAt(i) == 'O'){
	        answer += "0";
	      }
	      else{
	        answer += nickname.charAt(i);
	      }
	    }
	    	System.out.println(answer);
}
}