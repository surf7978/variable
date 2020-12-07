package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntFunction;

public class ReduceExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(//
				new Student("Hong", 80), //
				new Student("Hong", 90), //
				new Student("Hong", 87)//
		);
		int sum = list.stream().mapToInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student a) {
				return a.getScore();
			}
		}).sum();
		System.out.println(sum);
		System.out.println();

		// reduce 사용해서 커스터마이징 해볼거임
		int result = list.stream()//
				.mapToInt(t -> t.getScore())//
				.reduce(new IntBinaryOperator() {
					@Override
					public int applyAsInt(int left, int right) {
						System.out.println("left : " + left + ", right : " + right);
						return left + right; // 더한값이 왼쪽으로 감
					}
				}).getAsInt();
		System.out.println("결과값 : " + result);
		System.out.println();

		result = list.stream()//
				.mapToInt(t -> t.getScore())//
				.reduce(0, new IntBinaryOperator() {// 위랑 달리 left에 0을 초기값으로 사용
					@Override
					public int applyAsInt(int left, int right) {
						System.out.println("left : " + left + ", right : " + right);
						return left + right;
					}
				});
		System.out.println("결과값 : " + result);
		System.out.println();

		result = list.stream()//
				.mapToInt(t -> t.getScore())//
				.reduce(0, (left, right) -> {
					System.out.println("left : " + left + ", right : " + right);
					return left < right ? left : right; // 초기값이 0이라 전부 left로 선택됨
				});
		System.out.println("결과값 : " + result);
		System.out.println();

		result = list.stream()//
				.mapToInt(t -> t.getScore())//
				.reduce((left, right) -> {
					System.out.println("left : " + left + ", right : " + right);
					return left < right ? left : right;
				}).getAsInt(); // 초기값을 설정 안해줬기 때문에 getAsInt로 cast해줘야함
								// cast안해주면 result변수를 OptinalInt로 바꿔야함
		System.out.println("결과값 : " + result);
		System.out.println();

		result = list.stream()//
				.mapToInt(t -> t.getScore())//
				.reduce((left, right) -> {
					System.out.println("left : " + left + ", right : " + right);
					return (left + right)/2; //평균값 구하기
				}).getAsInt();
		System.out.println("결과값 : " + result);
		System.out.println();

	}
}