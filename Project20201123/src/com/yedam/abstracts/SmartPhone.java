package com.yedam.abstracts;

public class SmartPhone extends Phone {//extends Phone 특정 클래스 상속받기

	@Override
	public void ring() { //부모클래스에 구현안되있으니까 자식클래스에서 구현해줘야함
		System.out.println("스마트폰 벨...");
	}

	@Override
	public void turnOff() {
		
	} 

}
