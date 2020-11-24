package com.yedam.abstracts;

public abstract class Phone { //abstract 추상클래스로 선언
	public String owner;
	public Phone() {}
	public Phone(String owner) {
		this.owner = owner;
	}
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public abstract void ring();//메소드 이름만 있는 추상메소드
	public abstract void turnOff();
}
