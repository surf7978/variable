package com.yedam.interfaces;

public class RemoteControlExample {

	public static void main(String[] args) {
		Audio audio = new Audio();
		Television tv = new Television();
		
		audio.turnOn();
		audio.turnOff();
		
		tv.turnOn();
		tv.turnOff();
		System.out.println("---------");
				
		RemoteControl rc = audio;
		rc.turnOn();
		rc.turnOff();
		
		rc = tv;//인터페이스도 부모 자식클래스처럼 객체 담을 수 있음
		rc.turnOn();
		rc.turnOff();
		
		
		
	}

}
