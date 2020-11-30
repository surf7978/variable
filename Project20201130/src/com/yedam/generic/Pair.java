package com.yedam.generic;

public class Pair<T, M> {
	T kind;	  //타입 파라메타
	M model; // 얘네만 적용되는거지
	int price;   // 꼭 제네릭 타입만 쓸수있는건아님
	String name;// 다른필드값도 넣을 수 있음

	void setKind(T kind) {
		this.kind = kind;
	}

	T getKind() {
		return kind;
	}

	void setModel(M model) {
		this.model=model;
	}
	M getModel() {
		return model;
	}
}
