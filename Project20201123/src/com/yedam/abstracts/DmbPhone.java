package com.yedam.abstracts;

public class DmbPhone extends Phone {

	@Override//Override=다시쓰다, 재정의
	public void ring() {
		System.out.println("DMB폰 벨...");		
	}

	@Override
	public void turnOff() {
	
		
	}

}
