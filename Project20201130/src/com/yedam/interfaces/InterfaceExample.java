package com.yedam.interfaces;

interface Runnable {
	public void run();
}

class AutoRun implements Runnable {

	@Override
	public void run() {
		System.out.println("자동실행");
		
	}

}

class NewRun implements Runnable{

	@Override
	public void run() {
		System.out.println("새로운 실행");
		
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		Runnable runnable = new AutoRun();
		runnable.run();
		runnable = new NewRun();
		runnable.run();
		
		runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("익명 실행");
			}
		};//메인메소드 안에 메소드 넣을경우 마침표; 해줘야함
		runnable.run();
		
		runnable = () -> System.out.println("또 다른 익명 실행"); //위의 run()메소드 줄임식 
															  //= 람다 표현식
		runnable.run();
		
		
		
		
	}

}
