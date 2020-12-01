package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Hong", 15); // .add와 같음
		map.put("Hwang", 20); // 키 , 밸류 순으로 입력
		map.put("Park", 30);

		System.out.println(map.get("Hong")); // get하면 그 키에 맞는 밸류값 가져옴

		map.put("Hong", 25); // 덮어쓰기 됨

		Integer val = map.get("Hong");
		System.out.println(val);

		Set<String> set1 = map.keySet();
		for (String str : set1) {
			System.out.println("key: " + str + ", val: " + map.get(str));
		}
		System.out.println("---------");

		Set<Entry<String, Integer>> entrySet1 = map.entrySet();
		for (Entry<String, Integer> ent : entrySet1) {
			System.out.println("key: " + ent.getKey() + ", val: " + ent.getValue());
		}
		System.out.println("---------");

		Map<Integer, String> mapInt = new HashMap<>();
		mapInt.put(10, "김다현");
		mapInt.put(20, "이혜빈");
		mapInt.put(30, "이나경");

		String result = mapInt.get(10);
		System.out.println(result);
		System.out.println(mapInt.get(10));

		Set<Integer> set = mapInt.keySet(); // 키 값을 담아 둠
		for (Integer num : set) {
			System.out.println("key: " + num + ", val: " + mapInt.get(num));
		}
		System.out.println("---------");

		Set<Entry<Integer, String>> entrySet = mapInt.entrySet();
		System.out.println(entrySet);
		System.out.println(mapInt.entrySet());

		for (Entry<Integer, String> ent : entrySet) {
			System.out.println("key: " + ent.getKey() + ", val: " + ent.getValue());
		}
		System.out.println("---------");

		
		//교재 p.777 문제 9번
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("blue", 96);
		map1.put("hong", 86);
		map1.put("white", 92);
		
		String name = null; //최고 점수를 받은 아이디 저장
		int maxScore = 0; //최고 점수 저장
		int totalScore = 0; //점수 합계 저장
		
		Set<Entry<String, Integer>> set2 = map1.entrySet();
		for(Entry<String, Integer> ent : set2) {
			totalScore += ent.getValue();
		}
		int avg = totalScore/map1.size();
		System.out.println("평균점수: "+avg);

		for(Entry<String, Integer> ent : set2) {
			if(maxScore < ent.getValue()) {
				maxScore = ent.getValue();
				name = ent.getKey();
			}
		}
		System.out.println("최고점수: "+maxScore);
		System.out.println("최고점수를 받은 아이디: "+name);
	}

}
