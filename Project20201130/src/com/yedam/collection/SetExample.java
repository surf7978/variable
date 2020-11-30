package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		// 중 복 된 값 은 안 받 아 줌
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("World");
		set.add("Welcome");

//		for (int i=0;i<set.size();i++) {} set은 이렇게 못불러옴
//		for (String str:set) {
//			System.out.println(str); //순서대로 안나옴. 걍 막가지고나옴 
//			// 중복된 값은 제외함. World는 2번 넣었지만 한번만출력
//		}

		Iterator<String> iter = set.iterator(); // 반복자를 통해 요소 가져오기
		while (iter.hasNext()/* 가져올 요소가 있는가 여부 체크. 참거짓 */) {
			String str = iter.next(); // 요소를 하나 가져오겠다.
//			System.out.println(iter.next()); 
//iter.next를 한번체크할때마다 요소를 하나씩 가져옴,실행하면 str, sysout, 그다음루트에서 str에 써서 sysout엔 남은게 없어서 오류발생
			System.out.println(str);
		}
		Set<Integer> numbers = new HashSet<>();
		numbers.add(13);
		numbers.add(26);
		numbers.add(26);
		numbers.add(38);

		numbers.remove(26); // 삭제를 하나만 해도 26 둘 다 사라짐
		int sum = 0;
		for (Integer i : numbers) {
			sum += i;
		}
		System.out.println("numbers: " + sum);

		int[] a = { 10, 15, 20, 25, 30, 35, 40, 20, 25 };

		List<Integer> sumList = new ArrayList<>();
		for (int i : a) {
			sumList.add(i);
		}
		int suml = 0;
//		sumList.add(10);
//		sumList.add(15);
//		sumList.add(20);
//		sumList.add(25);
//		sumList.add(30);
//		sumList.add(35);
//		sumList.add(40);
//		sumList.add(20);
//		sumList.add(25);
		for (Integer i : sumList) {
			suml += i;
			System.out.print(i + ",");
		}
		System.out.println();
		System.out.println("총 합계는: " + suml);

		Set<Integer> sumSet = new HashSet<>();
		for (int i : a) {
			sumSet.add(i);
		}
		int sums = 0;

		for (Integer i : sumSet) {
			sums += i;
		}
		System.out.println("중복된 값을 제외한 합계는: " + sums);

	}
}
