package com.yedam.interfaces;

public class Audio implements RemoteControl {//implements RemoteControl=RemoteControl을 구현클래스

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
		
	} 

}
