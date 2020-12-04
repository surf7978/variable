package com.yedam.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Students {
	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getSex().equals("남자"));
		System.out.println(">>> 남자 평균점수 : " + maleAvg+"점");
		
		double femaleAvg = avg(t -> t.getSex().equals("여자"));
		System.out.println(">>> 여자 평균점수 : " + femaleAvg+"점");
	}
	
	private static List<Studentss> list = Arrays.asList( //
			new Studentss("홍길동", "남자", 90), //
			new Studentss("김순희", "여자", 90), //
			new Studentss("감자바", "남자", 95), //
			new Studentss("박한나", "여자", 92) //
														);
	
	public static double avg(Predicate<Studentss> predicate) {
		int count = 0, sum = 0;
		for (Studentss student : list) {
			if (predicate.test(student)) {
				System.out.print(student.getName()+": "+student.getScore()+"점 ");
				count++;//인원수 체크용(평균의 분모용)
				sum += student.getScore();
			}
		}
		return (double) sum / count;
	}
}

class Studentss {
	private String name;
	private String sex;
	private int score;

	public Studentss(String name, String sex, int score) {
		this.name = name;
		this.sex = sex;
		this.score = score;
	}

	
	public String getName() {
		return name;
	}


	public String getSex() {
		return sex;
	}

	public int getScore() {
		return score;
	}
}
