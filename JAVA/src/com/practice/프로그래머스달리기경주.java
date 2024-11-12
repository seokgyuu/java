package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 프로그래머스달리기경주 {
	public String[] solution(String[] players , String[] callings) {
		
		Map<String, Integer> rankMap = new HashMap<>();
		for(int i =0; i<players.length; i++) {
			rankMap.put(players[i], i);
		}
		
		for (String call : callings) {
			int currentIndex = rankMap.get(call);
			if(currentIndex > 0) {
				
				String frontPlayer = players[currentIndex -1 ];
				players[currentIndex - 1] = call;
				players[currentIndex] = frontPlayer;
				
				rankMap.put(call, currentIndex -1 );
				rankMap.put(frontPlayer, currentIndex);
				
			}
		}
		
		return players;
	}
public static void main(String[] args) {
	프로그래머스달리기경주 race = new 프로그래머스달리기경주();
	String[] players = {"mumu" , "seo" , "peo" , "kai" , "mine"};
	String[] callings = {"kai" , "kai" , "mine", "mine"};
	String[] result = race.solution(players, callings);
	
	System.out.println(Arrays.toString(result));
	}
}
