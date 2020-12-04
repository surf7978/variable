package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

import lambda.Student;

public class StreamExample3 {

	public static void main(String[] args) {

		String[] strs = "Java8-lambda".split("-"); // "-"을 기준으로 문자열을 쪼개서 배열로 만들겠다는 뜻

		
		
		
		
		
		List<String> strList = Arrays.asList("Java8 lambda", "stream mapping");
			
		
		strList.stream().flatMap(new Function<String, Stream<String>>() {
			@Override
			public Stream<String> apply(String t) {
				return Arrays.stream(t.split(" "));// 문자열을 split으로 처리하면 배열로 됨
			}
		}).filter(s -> s.startsWith("s"))// s로시작하는 문자열만 필터
				.forEach(s -> System.out.println(s));

		// 람다식으로 표현하기
		strList.stream().flatMap((t) -> Arrays.stream(t.split(" ")))
		.filter(s -> s.startsWith("s")).forEach(s -> System.out.println(s));

		
		
		
		
		
		strList.stream()//
				.map(new Function<String, String>() {
					@Override
					public String apply(String t) {
						return t.toUpperCase();
					}
				}).forEach(s -> System.out.println(s));

		// 람다식으로 표현하기
		strList.stream()//
				.map((t) ->	t.toUpperCase()).forEach(s -> System.out.println(s));

		
		
		
		
		List<Student> students = Arrays.asList(//
				new Student("송다희", "F", 80), //
				new Student("윤태현", "M", 75), //
				new Student("이혜빈", "F", 85), //
				new Student("정병기", "M", 90) //
				);
		
		// 문자열 Map 숫자 MapToInt
		double avg = students.stream()//
				.mapToInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student s) {
				System.out.println("중간단계체크 "+s.getName()+"-"+s.getScore());
				return s.getScore();
			}
		}).average().getAsDouble();
		System.out.println(avg);
		
		//람다식표현
		avg = students.stream()//
				.mapToInt((s) -> {//
				System.out.println("중간단계체크 "+s.getName()+"-"+s.getScore());//
				return s.getScore();//
				}).average().getAsDouble();
		System.out.println(avg);
	}
}