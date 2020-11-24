package com.yedam.abstracts;

public class PhoneExample {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.owner = "Hong";
		phone.turnOn();
//		new Phone();//추상클래스에서는 못 받음
//		new Phone("Hong");

	}

}
