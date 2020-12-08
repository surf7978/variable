package programTest1208;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exam04 {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(//
				new Student("김", 10, 50), //
				new Student("이", 20, 40), //
				new Student("박", 90, 10), // 총합 100점 넘기므로 출력 안 됨
				new Student("최", 50, 50)); // 총합 100점 넘기므로 출력 안 됨

		List<Student> students = list.stream() //
				.filter(s -> s.getEscore() + s.getMscore() < 100) //
				.collect(Collectors.toList());

		for (Student std : students) {
			System.out.println("이름 : " + std.getName() //
					+ ", 영어점수 : " + std.getEscore() //
					+ ", 수학점수 : " + std.getEscore());
		}
	}
}
