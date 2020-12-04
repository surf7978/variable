package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class LambdaExample {

	static List<Student> list = Arrays.asList(//
			new Student("Hong", "MALE", 70), //
			new Student("Hwang", "FEMALE", 80), //
			new Student("Park", "MALE", 90), //
			new Student("Choi", "FEMALE", 85)//
	);

	public static void main(String[] args) {

		// 1.여학생 정보 : 이름 - 점수 출력
		System.out.println("여학생리스트");
		System.out.println("이름 - 점수");
		for (Student std : list) {
			if (std.getSex().equals("FEMALE")) {
				System.out.println(std.getName() + " - " + std.getScore());
			}
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		// 2.전체학생 중 점수 80점 초과하는 학생 : 출력
		System.out.println("80점 초과하는 학생리스트");
		for (Student std : list) {
			if (std.getScore() > 80) {
				System.out.println(std.getName() + " - " + std.getScore());
			}
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		// 3.남학생의 총점 : 출력 (정답 : 160점 나와야함)
		double sum = 0;
		for (Student std : list) {
			if (std.getSex().equals("MALE")) {
				sum += std.getScore();
			}
		}
		System.out.println("남학생들의 점수 합계 : " + sum);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		// 4.여학생의 평균 : 출력 (정답 : 82.5점 나와야함)
		sum = 0;
		int count = 0, avg = 0;
		for (Student std : list) {
			if (std.getSex().equals("FEMALE")) {
				count++;
				sum += std.getScore();
			}
		}
		System.out.println("여학생들의 평균 점수 : " + (sum / count));
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

//		System.out.println("<람다식으로 표현>");
//		// 1.여학생 정보 : 이름 - 점수 출력
//		Q1(t -> t.getSex().equals("FEMALE"));
//		// 2.전체학생 중 점수 80점 초과하는 학생 : 출력
//		Q2(null);
//		// 3.남학생의 총점 : 출력 (정답 : 160점 나와야함)
//		Q3(t -> t.getSex().equals("MALE"));
//		// 4.여학생의 평균 : 출력 (정답 : 82.5점 나와야함)

		// 반복문(반복자) : 스트림(반복자)
		// 스트림생성 >> 소진

		Stream<Student> stream = list.stream();
		stream.filter(new Predicate<Student>() { // forEach에서 조건 또 걸기(=filter)
			@Override
			public boolean test(Student t) {
				return t.getSex().equals("FEMALE");
			}
		}).forEach(new Consumer<Student>() {// 각각에대해서 forEach라는 메소드 실행
			@Override
			public void accept(Student t) {
				System.out.println(t.getName() + " - " + t.getScore());
			}
		});

		// 이렇게 람다식으로 표현 가능
//		stream = list.stream();
//		stream.filter((t) -> t.getSex().equals("FEMALE"))//
//		.forEach((t) -> System.out.println(t.getName()+" - "+t.getScore()));

		stream = list.stream();
		stream.filter(new Predicate<Student>() {
			@Override
			public boolean test(Student t) {
				return t.getScore() > 80;
			}
		}).forEach(new Consumer<Student>() {
			@Override
			public void accept(Student t) {
				System.out.println(t.getName() + " - " + t.getScore());
			}
		});

		// 이렇게 람다식으로 표현 가능
//		stream = list.stream();
//		stream.filter((t) -> t.getScore() > 80)
//		.forEach((t) ->	System.out.println(t.getName() + " - " + t.getScore()));

		// 스트림 선언 안하고 바로 점찍어주고 시작해도 됨
		int sum1 = list.stream().filter(t -> t.getSex().equals("MALE"))//
				.mapToInt(new ToIntFunction<Student>() {
					@Override
					public int applyAsInt(Student value) {// int 타입으로 맵핑해줌
						return value.getScore();
					}
				}).sum();

		// 이렇게 람다식으로 표현 가능
//		sum1 = list.stream().filter(t -> t.getSex().equals("MALE"))//
//				.mapToInt((value) -> value.getScore()).sum();
		
		double avg1 = list.stream().filter(t -> t.getSex().equals("FEMALE"))
				.mapToInt(s -> s.getScore())//
				.average()//
				.getAsDouble();
		System.out.println("평균: "+avg1);
		
		
	}

//	public static void Q1(Predicate<Student> prd) {
//		System.out.println("여학생리스트");
//		System.out.println("이름 - 점수");
//		for (Student std : list) {
//			if (prd.test(std)) {
//				System.out.println(std.getName() + " - " + std.getScore());
//			}
//		}
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//	}
//
//	public static void Q2(Predicate<LambdaExample> prd) {
//		System.out.println("80점 초과하는 학생리스트");
//		for (Student std : list) {
//			if (std.getScore() > 80) {
//				System.out.println(std.getName() + " - " + std.getScore());
//			}
//		}
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//	}
//
//	public static void Q3(Predicate<LambdaExample> prd) {
//		double sum = 0;
//		for (Student std : list) {
//			if (prd.test(std)) {
//				sum += std.getScore();
//			}
//		}
//		System.out.println("남학생들의 점수 합계 : " + sum);
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//	}
//	
//	public static void Q4(Predicate<LambdaExample> prd) {
//		int sum = 0;
//		int count = 0, avg = 0;
//		for (Student std : list) {
//			if (std.getSex().equals("FEMALE")) {
//				count++;
//				sum += std.getScore();
//			}
//		}
//		System.out.println("여학생들의 평균 점수 : " + (sum / count));
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//
//	}
}
