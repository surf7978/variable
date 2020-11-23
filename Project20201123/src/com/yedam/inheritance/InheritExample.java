package com.yedam.inheritance;

public class InheritExample {

	public static void main(String[] args) {
		Parent p1 = new Parent("필드값1");
		System.out.println(p1.field1);
		p1.method1();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ");

		Child c1 = new Child("자식필드1", "자식필드2");
		System.out.println(c1.field2);
		System.out.println(c1.field1);// 부모 클래스에 있는걸 상속받아 쓸 수 있음
		c1.method1();// 역시나 부모 클래스에 있는거 상속받아 쓸 수 있음
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ");

		c1.method2();// super쓰면 부모꺼도 같이 나옴
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ");

		NewChild nc1 = new NewChild("또다른자식1", "또다른자식2");
		System.out.println(nc1.field1);
		System.out.println(nc1.field3);
		nc1.method1();
		nc1.method3();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ");

		GrandChild gc1 = new GrandChild();
		System.out.println(gc1.field1);
		System.out.println(gc1.field2);
		gc1.method1();
		gc1.method2();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ");

		Parent p = new Parent();
		p = new Child();
		p = new GrandChild();// 자식의 자식까지 변수 받을 수 있음

//에러뜸	Child c = new Parent();
		// 자식은 상속받는 거라 추가적인 기능은 많이 넣을 수 있지만
		// 자식은 부모꺼로 변수선언 못해서 변수를 많이 받지 못한다.

	}

}
