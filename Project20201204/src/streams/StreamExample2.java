package streams;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class StreamExample2 {

	public static void main(String[] args) {
		// 문제 1~100까지 숫자를 가져와서 짝수만 결과를 출력
		IntStream is = IntStream.rangeClosed(1, 100); // range 와 rangeClosed 차이점 = range 미만 , rangeClosed 이하
		is.filter(t -> t % 2 == 0).forEach(s -> System.out.println(s));

		int sum = IntStream.rangeClosed(1, 100).filter(t -> t % 2 == 0).sum();
		System.out.println(sum);

		int[] intAry = { 2, 6, 4, 8, 1, 9 };
		is = Arrays.stream(intAry);
//		OptionalInt max = is.max();
//		System.out.println(max);
//		int iMax = max.getAsInt();
//		System.out.println(iMax);
		int max = is.max().getAsInt();
		is = Arrays.stream(intAry); // 휘발되서 다서 선언해줘야함
		int min = is.min().getAsInt();
		is = Arrays.stream(intAry);
		double avg = is.average().getAsDouble();
		System.out.println(max + "/" + min + "/" + avg);

		// 조건(filter)
		Arrays.stream(intAry).filter((a) -> 2 % a == 0).forEach((a) -> System.out.println(a));
		
	}
}