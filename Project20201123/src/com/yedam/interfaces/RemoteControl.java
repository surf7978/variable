package com.yedam.interfaces;

public interface RemoteControl {//인터페이스에는 추상메소드랑 상수만 만들 수 있음
	
	public abstract void turnOn();//추상 메소드
	
	public void turnOff();//굳이 abstract 안써도 인터페이스 안에서 만들어지는 퍼블릭은 추상메소드로 바뀜
}
