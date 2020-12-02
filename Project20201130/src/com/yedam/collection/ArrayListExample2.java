package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListExample2 {

	public static void main(String[] args) {
		
		System.out.println("Hello".hashCode());
		System.out.println("Hello".hashCode());
		System.out.println("Hello".length());
		System.out.println("olleH".length());
		System.out.println("-------");
		
		List<String> olist = new ArrayList();
		//제네릭을 선언해주면 못 넣음olist.add(10);
		olist.add("Hello");
		for(Object str : olist) {
			String s = (String) str;
			System.out.println(str);
		}
		System.out.println("-------");
		
		List<String> list = new ArrayList<>();
		list.add(new String("Hello"));
		list.add(new String("World"));
		list.add("Welcome");
		list.add(new String("Hello"));

		list.get(1);
		
		System.out.println(list);
		System.out.println("-------");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-------");
		
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("-------");
		
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("Hello");

		System.out.println(set);
		System.out.println("-------");
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next()); //next()로 요소 안꺼내면 무한반복 됨
		}
		System.out.println("-------");
		
		for(String str : set) {
			System.out.println(str);
		}
		System.out.println("-------");
		
		Set<Fruit> fruits = new HashSet<>();
		fruits.add(new Fruit("Apple", 1000));
		fruits.add(new Fruit("Banana", 1500));
		fruits.add(new Fruit("Orange", 2000));
		fruits.add(new Fruit("Apple", 1000)); 
		fruits.add(new Fruit("ABABAB", 1500));

		Iterator<Fruit> fiter = fruits.iterator(); //반복자 획득 메소드
		while(fiter.hasNext()) {
			Fruit fruit = fiter.next();
			System.out.println(fruit.getName()+"가격 : "+fruit.getPrice());
		}
		
	}

}
