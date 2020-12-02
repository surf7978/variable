package com.yedam.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(87, "홍길동");
		scores.put(98, "이동수");
		scores.put(75, "박길순");
		scores.put(95, "신용권");
		scores.put(80, "김자바");
		
		Map.Entry<Integer, String> entry =null;
		
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수 : "+entry.getKey()+" "+entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수 : "+entry.getKey()+" "+entry.getValue());
		
		entry = scores.lowerEntry(95);
		System.out.println("95점 미만 : "+entry.getKey()+" "+entry.getValue());
		
		entry = scores.higherEntry(95);
		System.out.println("95점 초과 : "+entry.getKey()+" "+entry.getValue());
		
		entry = scores.floorEntry(95);
		System.out.println("95점 or 바로 아래 점수 1개만 : "+entry.getKey()+" "+entry.getValue());
		
		entry = scores.ceilingEntry(85);
		System.out.println("85점 or 바로 위 점수 1개만 : "+entry.getKey()+entry.getValue());
		
		while(!scores.isEmpty()/*socres가 값이 있으면 true*/) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey()+" "+entry.getValue()+" /남은 객체 수 : "+scores.size());
		}
		
	}

}
