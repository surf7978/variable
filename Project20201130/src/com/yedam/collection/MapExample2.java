package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample2 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(101, "윤태현"), 80);
		map.put(new Student(102, "정병기"), 90);
		map.put(new Student(201, "김종인"), 70);
		map.put(new Student(201, "김종인"), 80); // 해쉬코드랑 이퀄즈 설정해줘야 덮어쓰기됨
		map.put(new Student(103, "정병기"), 88);
		
		Set<Student> set = map.keySet();
		for (Student student : set) {
			System.out.println("학번: " + student.getStudentNo()//
					+ ", 이름: " + student.getStudentName()//
					+ ", 점수: " + map.get(student));
		}
		System.out.println("---------------");
		
		//1.key값 사용해서 평균구하기
		int sum = 0;
		for(Student student : set) {
			sum += map.get(student);
		}
		int avg = sum/map.size();
		System.out.println("평균: "+avg);
		
		//2.entrySet() 사용해서 평균구하기
		int sum1 = 0;
		Set<Entry<Student, Integer>> set1 = map.entrySet();
		for(Entry<Student, Integer> ent : set1) {
			sum1 += ent.getValue();
		}
		int avg1 = sum/map.size();
		System.out.println("평균: "+avg);
		System.out.println("---------------");
		
		
		
	}

}
