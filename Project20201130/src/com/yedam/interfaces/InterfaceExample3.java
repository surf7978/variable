package com.yedam.interfaces;

//함수적 인터페이스 = Functional Interface
interface MyFunctionInterface{
	public void run(int radius);
}

interface MyFunctionInterface1{
	public void run(int b, int h);
}

public class InterfaceExample3 {

	public static void main(String[] args) {
		//숙제 1.화면출력(원의 넓이 구하는 기능 구현)
		//2.화면출력(밑변으로 가지는 삼각형의 넓이를 구하는 기능 구현)
		//3.화면출력(정사각형 넓이를 구하는 기능 구현)
		
		//1.원의 넓이
		MyFunctionInterface a = (radius) -> System.out.println(radius*radius*3.14);
		a.run(5);
		//2.삼각형의 넓이
		MyFunctionInterface1 b = (c, h) -> System.out.println(0.5*c*h);
		b.run(5, 4);
		//3.정사각형 넓이
		a =(radius) -> System.out.println(radius*radius);
		a.run(3);
		System.out.println("------------------");
		
		//정답
		//1.
		MyFunctionInterface mfi = null;
		mfi = new MyFunctionInterface() {

			@Override
			public void run(int radius) {
				double result = Math.PI * radius * radius;
				System.out.println("원의 넓이는 : "+result);
			}
		};
		mfi.run(5);
		//2.
		mfi = new MyFunctionInterface() {

			@Override
			public void run(int radius) {
				double result = 1.73/4 * radius * radius;
				System.out.println("삼각형의 넓이는 : "+result);
			}
		};
		mfi.run(5);
		//3.
		mfi = new MyFunctionInterface() {

			@Override
			public void run(int radius) {
				double result = radius * radius;
				System.out.println("사각형의 넓이는 : "+result);
			}
		};
		mfi.run(5);
		System.out.println("------------------");
		
		
		
		
		
		
		
		
	}

}
