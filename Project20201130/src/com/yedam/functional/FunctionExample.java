package com.yedam.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class FunctionExample {
	public static List<Student> list = Arrays.asList(new Student("Hong", 90, 96)//
													, new Student("Hwang", 95, 93));

	public static void printString(Function<Student, String> func) {
		for(Student student : list) {
			System.out.println(func.apply(student));
		}
	}
	
	//				 같은뜻   Function<Student, Integer> func
	public static void printInt(ToIntFunction<Student> func) {
		for(Student student : list) {
			System.out.println(func.applyAsInt(student));
		}
	}
	
	public static double avg(ToDoubleFunction<Student> func) {//펑션타입으로 받아서 더블타입으로 출력
		double result = 0, sum = 0;
		for(Student student : list) {
			result = func.applyAsDouble(student); //Student타입의 변수 넣으면 더블타입으로 출력됨
			sum += result;
		}
		return sum / list.size();
	}
	
	public static void main(String[] args) {
		Function<String, Integer> func = null;
		func = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) { // 입력은 String으로 출력은 Integer타입으로 나옴
				return t.length();
			}

		};
		//System.out.println(func.apply("Hello")); // apply로 출력

		BiFunction<String, String, Integer> biFunc = null;
		System.out.println("[학생이름]");
		printString(new Function<Student, String>() {
			@Override
			public String apply(Student t) {
				return t.getName();
			}
		});// ();안에 넣어야함
		
		System.out.println("[학생이름]요약");
		printString (t -> t.getName()); //이렇게 요약가능 ();안에 넣어야함
		
		System.out.println("[영어점수]");
		printInt(new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore();
			}
			
		});
		
		//이름 점수 둘다 나오게 하는 펑션 만들기
		System.out.println("[학생이름-영어점수]");
		printString(new Function<Student, String>() {
			@Override
			public String apply(Student t) {
				return t.getName()+"-"+t.getEngScore();
			}
		});
		
		//영어,수학점수,나오게하는 펑션만들기
		System.out.println("[영어점수-수학점수-합계점수]");
		printString(new Function<Student, String>(){
			@Override
			public String apply(Student t) {
				return t.getEngScore()+"-"+t.getMathScore()+"-"+(t.getEngScore()+t.getMathScore());
			}
		});
		//람다식으로 표현
		System.out.println("[영어점수-수학점수-합계점수] 람다식표현");
		printString(t -> t.getEngScore()+"-"+t.getMathScore()+"-"+(t.getEngScore()+t.getMathScore()));
		
		//영어평균
		System.out.println("[영어평균]");
		double avg = avg(new ToDoubleFunction<Student>() {
			@Override
			public double applyAsDouble(Student value) {
				return value.getEngScore(); //double 타입이라 int 타입을 자동적으로 프로모션해줌
											//int에서 double로 할경우 자동으로 안해줘서 캐스팅해줘야함 (double)~~~
			}
		});
		System.out.println(avg);
	}

}
