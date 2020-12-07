package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(//
				new Student("Hong", 80), //
				new Student("Hwang", 90), //
				new Student("Choi", 87) //
		);

		List<Student> student80s = list.stream().filter(s -> s.getScore() / 10 == 8) //
//		.forEach(s -> System.out.println(s.getName()+", "+s.getScore())); //이걸 밑에처럼
//		.forEach(System.out::println); //이렇게 요약가능 (출력 문구는 Student 클래스에 toString에 있음)
				.collect(Collectors.toList());
		System.out.println(student80s);
		for (Student std : student80s) {
			System.out.println("이름 : " + std.getName() + ", 점수 : " + std.getScore());
		}

		Set<Student> student80s1 = list.stream().filter(s -> s.getScore() / 10 == 8) //
				.collect(Collectors.toSet());
		for (Student std : student80s1) {
			System.out.println("이름 : " + std.getName() + ", 점수 : " + std.getScore());
		}

		List<Student> student80s2 = list.stream() //
				.filter(s -> s.getScore() / 10 == 8) //
				.sorted() // sorted쓰려면 Sudent클래스에 implements Comparable<Student> 해줘야함
				.collect(Collectors.toList());

		Map<String, Integer> map = list.stream() //
				.filter(s -> s.getScore() / 10 == 8) //
				.sorted().collect(Collectors.toMap //
				(new Function<Student, String>() {
					@Override
					public String apply(Student t) {
						return t.getName();
					} //
				}, new Function<Student, Integer>() {
					@Override
					public Integer apply(Student t) {
						return t.getScore();
					} //
				}));

		map = list.stream() //
				.filter(s -> s.getScore() / 10 == 8) //
				.sorted() //
				.collect( //
						Collectors.toMap( //
								(t) -> t.getName() //
								, (t) -> t.getScore()));
		Set<String> set = map.keySet();
		for (String key : set) {
			System.out.println("Key : " + key + ", Value : " + map.get(key));
		}
	}
}
