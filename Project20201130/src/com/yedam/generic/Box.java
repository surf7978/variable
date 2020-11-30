package com.yedam.generic;

//제네릭
public class Box<T> {
	// <T>(타입파라메타)는 클래스를 호출할때 타입이 정해진다
	T obj;

	void set(Object Obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}

}
