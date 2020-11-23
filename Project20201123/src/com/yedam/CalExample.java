package com.yedam;

public class CalExample {
	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		c1.setColor("white");
		c1.plus(3, 5);

		Calculator.plus(3, 5);// 인스턴스를 스태틱으로 만들어서 따로 변수선언 안 해도됨
		int result = Calculator.plus(4, 5);
		System.out.println(result);

		result = Calculator.minus(10, 5);
		System.out.println(result);

		System.out.println(Calculator.pi);
		System.out.println("---");

		CalExample ce1 = new CalExample();
		result = ce1.sum(3, 5); // 틀린건 아닌데 밑에 static으로 선언되서 이렇게 안해도됨

		result = sum(3, 5);// 밑에 인스턴스에 static선언 되있으면 위에처럼 안해도됨

	}

	public static int sum(int a, int b) {
		return a + b;
	}

}
