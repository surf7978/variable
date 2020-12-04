package com.yedam.functional;

//p717 문제 5번 풀기
import java.util.function.IntBinaryOperator;

//class IntBinaryOperatorClass implements IntBinaryOperator {
//	@Override
//	public int applyAsInt(int left, int right) {
//		int result = 0;
//		if (left > right) {
//			result = left;
//		} else
//			result = right;
//		return result;
//	}
//} 택2 이렇게 하나 만들어도 됨 

public class LambdaExample {

	private static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		
		//최대값 얻기
		int max = maxOrMin(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) {
				return left > right ? left : right;
			}
		});
		System.out.println("최대값 : "+max);
		
		//최소값 얻기
		int min = maxOrMin((left, right) -> {return left < right ? left : right;});
		System.out.println("최소값 : "+min);
		
		
		
		
//택2	IntBinaryOperatorClass max = new IntBinaryOperatorClass();
//		maxOrMin(new IntBinaryOperatorClass());

		
		
		
//택3	max = maxOrMin(new IntBinaryOperator() {
//			@Override
//			public int applyAsInt(int left, int right) {
//				int result = 0;
//				if(left > right) {
//					result = left;
//				}else result = right;
//				return result;
//			}
//		});
//		System.out.println("최대값 : "+max);
//		
//		
//		min = maxOrMin((left, right) -> {
//			int result = 0;
//			if(left > right) {
//				result = right;
//			}else result = left;
//			return result;
//			});
//		System.out.println("최소값 : "+min);
	}

}
