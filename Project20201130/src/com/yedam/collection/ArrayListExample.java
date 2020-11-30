package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("Hello");
		list.add("World");
		list.add("Welcome");
		list.add(1, "nice"); //1번째 위치에 nice
		System.out.println("size: "+list.size());//배열은 length list는 size
		list.add(list.size(), "last");
		for (String str : list) {
			System.out.println(str);
		}
		list.remove(1);
		for (String str : list) {
			System.out.println(str);
		}
		for (int i = 0; i <list.size();i++) {
			System.out.println("index:" + i + "," +list.get(i));
		}
		List<Integer> listNum = new ArrayList<>();
		listNum.add(100);
		listNum.add(200);
		listNum.add(300);
		int sum = 0;
		for(Integer num : listNum) {
			sum += num;
		}
		System.out.println("listNum합계: " + sum);

	}
}
