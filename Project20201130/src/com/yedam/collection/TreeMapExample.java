package com.yedam.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(87, "Hong");
		scores.put(98, "Hwang");
		scores.put(75, "Choi");
		scores.put(95, "Park");
		scores.put(80, "Kim");
		
		Set<Integer> set = scores.keySet();
		
		for(Integer num : scores.keySet()) {
			System.out.println(num);//운좋게 오름차순 정렬된거임 원래는 랜덤임
		}
		for(Map.Entry<Integer, String> ent : scores.entrySet()) {
			System.out.println(ent.getKey()+" "+ent.getValue());	
		}
		
		Map.Entry<Integer, String> ent  = scores.firstEntry();
		ent.getKey();
		ent.getValue();
		
		ent = scores.lastEntry();
		ent.getKey();
		ent.getValue();
		
		
		
		
		
	}
}