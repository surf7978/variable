package com.yedam.functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {

	public static void main(String[] args) {

		Consumer<String> consumer = null;

		consumer = new Consumer<String>() { // <>안에 타입 안넣어주면 오류남
			@Override
			public void accept(String t) { // 이건 run이 아니라 accept임
				System.out.println(t);
			}
		};
		consumer.accept("Hello");

		consumer = t -> System.out.println("Hello " + t); // 이렇게 줄임 ()조차 줄일 수 있다.
		consumer.accept("Hallo");
		System.out.println("-------------------");

		BiConsumer<String, Integer> biCon = null;
		biCon = new BiConsumer<String, Integer>() {
			@Override
			public void accept(String t, Integer u) {
				System.out.println("이름은 " + t + ", 나이는 " + u);
			}
		};
		biCon.accept("Hong", 15);

		biCon = (a, b) -> System.out.println(a + b);
		biCon.accept("Hwang", 15);
		System.out.println("-------------------");

		ObjIntConsumer<String> objIntCon = null;
		objIntCon = new ObjIntConsumer<String>() {
			@Override
			public void accept(String t, int value) {
				System.out.println("이름은 " + t + ", 점수는 " + value);
			}
		};
		objIntCon.accept("Hwang", 88);
		
		
	}

}
