package com.yedam.interfaces;

public class InterfaceExample4 {
	public static void main(String[] args) {
		MyInterface mi = null;
		// 매개값의 합
		mi = (num1, num2) -> num1 + num2; // return도 생략가능, 안해주면 오히려 오류남

		int result = mi.run(10, 20);
		System.out.println(result);

		mi = (num1, num2) -> num1 * num2;
		result = mi.run(5, 10);
		System.out.println(result);

		// 문제 두개의 변수(직사각형의 가로, 세로) -> 넓이를 구하는 기능 구현
		//택1
		mi = (a, b) -> a * b;
		result = mi.run(5, 10);
		System.out.println(result);
		//택2
		mi = new MyInterface() {
			@Override
			public int run(int c, int d) {
				return c * d;
			}
		};
		result = mi.run(5,10);
		System.out.println(result);
		
		
		
		
		
		
	}
}