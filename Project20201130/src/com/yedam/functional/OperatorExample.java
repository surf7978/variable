package com.yedam.functional;

import java.util.function.IntBinaryOperator;

public class OperatorExample {

	static int[] scores = { 92, 95, 87, 87, 54 };
	
	static int maxOrMin(IntBinaryOperator oper){ //IntBinaryOperator하고 유틸설치
		int result = scores[0];					//IntBinaryOperator = 두 개의 int연산
		for(int number : scores) {
			result = oper.applyAsInt(result, number); //출력은 applyAsInt로 함
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int maxValue = maxOrMin(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) {
				System.out.println("left : "+left+", right : "+right);
				return left > right ? left : right; //수식값을 비교해서 참이면 left출력 거짓이면 right출력
			}
		});
		System.out.println("제일 큰 값 : "+maxValue);
		
		//문제 제일 작은 값 구하기
		maxValue = maxOrMin(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) {
				System.out.println("left : "+left+", right : "+right);
				return left < right ? left : right;
			}
		});
		System.out.println("제일 작은 값 : "+maxValue);
		
		//람다식으로 표현
		maxValue = maxOrMin((left, right) -> { //maxOrMin은 메소드라 생략못함
				System.out.println("left : "+left+", right : "+right);
				return left < right ? left : right;
		});
		System.out.println("제일 작은 값 : "+maxValue);
	}

}
