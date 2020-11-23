package com.yedam.inheritance;

public class Child extends Parent { // extends 적어주면 상속받음
	String field2;

	public Child() { // 부모 생성자에도 같이 있어야 선언가능
		super();// 이거 적어줘야함
	}

	public Child(String field1, String field2) {
		super(field1);// super = 부모 클래스에 있는 것 호출
		this.field2 = field2;
	}

	public void method2() {
		super.method1();
		System.out.println("method2() 호출.");
	}
}
