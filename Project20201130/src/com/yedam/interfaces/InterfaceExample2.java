package com.yedam.interfaces;
//함수적 인터페이스
interface Cal { /* 1 인터페이스 생성 +추가 인터페이스 하나에 하나의 기능만 넣어야 람다식 가능 */
	public void multi(int num);
}

interface Calculate {
	public void sum(int num1, int num2);
}

public class InterfaceExample2 {
	public static void main(String[] args) {
		
		/* 2 변수선언 */ Cal cal = (num) -> { /* 3 = 1에 걸쳐져서 반드시 작성해야됨 */
				int result = num * 2;
				System.out.println(result);
		};
		cal.multi(3); /* 4 출력 +입력값 넣어줘야함 */
		
		cal = (a) -> {
			int result = a *a;
			System.out.println(result);
		};
		cal.multi(4);
		
		Calculate calcu = (num1, num2) -> System.out.println(num1+num2);
		calcu.sum(3, 5); //오버라이드 1줄일 경우 {};까지 생략가능

		calcu = (num1, num2) -> System.out.println(num1*num2);
		calcu.sum(3, 5);
		
		
		
	}
}