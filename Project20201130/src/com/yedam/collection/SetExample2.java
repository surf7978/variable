package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample2 {
	public static void main(String[] args) {
		Set<Person> persons = new HashSet<>();
		persons.add(new Person("Hong"));
		persons.add(new Person("Hwang"));
		persons.add(new Person("Park"));
		persons.add(new Person("Hong"));
		

		Iterator<Person> iter = persons.iterator();
		while(iter.hasNext()) {
			Person person = iter.next();
			System.out.println(iter); //출력하면 주소값이 4개 나옴
			System.out.println(person);
			System.out.println(person.toString());
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			//들어가있는 값은 "Hong"으로 같지만 인스턴스 (주소값?) 은 다르다.
			
			//Person에 hashcode 랑 equals 추가
			//equals에서 값을 비교해서 Hong 값이 같으므로 3개만 나옴
			
		}
	}
}
