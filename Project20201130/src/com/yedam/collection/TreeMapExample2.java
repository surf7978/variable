package com.yedam.collection;

import java.util.Arrays;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapExample2 {

	public static void main(String[] args) {

		TreeMap<Integer, String> scores = new TreeMap<>();

		scores.put(87, "Hong");
		scores.put(98, "Hwang");
		scores.put(75, "Choi");
		scores.put(95, "Park");
		scores.put(80, "Kim");
		System.out.println("scores의 첫번째 값 : " + scores.firstEntry().getKey());

		NavigableMap<Integer, String> navigableMap = scores.descendingMap();// descendingMap() 내림차순으로 바꿔줌
		System.out.println("navigableMap의 첫번째 값 : " + navigableMap.firstEntry().getKey());

		NavigableSet<Integer> nSet = scores.descendingKeySet();
		System.out.println("nSet의 첫번째 키 값 : " + nSet.first());
		// 문제 {34, 55, 26, 48, 77} 이 배열을 오름차순으로 정렬 +arraysort 쓰지 말고
		int[] b = new int[] {34,55,26,48,77};
		int c = 0;
		for(int i=1; i<b.length+1; i++) {
			if(b[i]<b[i-1]) {
				c = b[i];
				b[i-1] = b[i];
				b[i]= c;
			}
		}
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		
		
		
		
		//TreeSet 활용한 정답
		int[] intAry = new int[] {34,55,26,48,77};
		TreeSet<Integer> tSet = new TreeSet<>();
		for(int i =0; i<intAry.length; i++) {
			tSet.add(intAry[i]);
		}
		for(int i =0; i<intAry.length; i++) {
			intAry[i] = tSet.pollFirst(); //pollFirst()= 제일 낮은 값을 꺼내오고 컬렉션에서 제거
		}
		for(int i=0; i<intAry.length; i++) {
			System.out.println(intAry[i]);
		}
		
		//쉽게 Array.sort();로 표현
		int[] a = new int[] {34,55,26,48,77};
		Arrays.sort(a);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
