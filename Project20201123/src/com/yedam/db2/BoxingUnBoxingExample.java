package com.yedam.db2;

import java.awt.Window.Type;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");

		// Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

		int value = obj1;
		int result = obj1 + 100;
		System.out.println("rlt : " + result);

		int value4 = Integer.parseInt("10");
		double value5 = Double.parseDouble("3.14");
		boolean value6 = Boolean.parseBoolean("true");

		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);

		Integer obj4 = 300;
		Integer obj5 = 300;
		System.out.println(obj4);
		System.out.println(obj5);
		System.out.println(obj4 == obj5);
		System.out.println(obj4.intValue() == obj5.intValue());
		System.out.println(obj4.equals(obj5));

		int v1 = Math.abs(-5);// 절대값
		double v2 = Math.abs(-3.14);

		double v3 = Math.ceil(-3.14);
		double v4 = Math.ceil(3.14);// 올림

		double v5 = Math.floor(-3.14);
		double v6 = Math.floor(3.14);// 버림

		double v7 = Math.rint(-5.5);// 가까운 정수의 실수값
		double v8 = Math.rint(-5.4);
		double v9 = Math.rint(5.5);
		double v10 = Math.rint(5.4);

		double v11 = Math.round(-5.5);// 반올림
		double v12 = Math.round(-5.4);
		double v13 = Math.round(5.5);// 반올림
		double v14 = Math.round(5.4);

		System.out.println(v1);
		System.out.println(v2);
		System.out.println();
		System.out.println(v3);
		System.out.println(v4);
		System.out.println();
		System.out.println(v5);
		System.out.println(v6);
		System.out.println();
		System.out.println(v7);
		System.out.println(v8);
		System.out.println(v9);
		System.out.println(v10);
		System.out.println();
		System.out.println(v11);
		System.out.println(v12);
		System.out.println(v13);
		System.out.println(v14);
		System.out.println();

	}

}
