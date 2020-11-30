package com.yedam.generic;

import java.util.ArrayList;
import java.util.List;

//제네릭
class Apple {

}

public class BoxExample {

	public static void main(String[] args) {

		Box<String> box = new Box<String>();
		// 박스를 스트링타입으로 선언해서 쓰고싶음
		String str = box.get();

		Box<Apple> apple = new Box<Apple>();
		// 박스를 애플타입으로 선언해서 쓰고싶음
		Apple app = apple.get();
		System.out.println("end");

		List list = new ArrayList();
		list.add("Hello");
		list.add(10); // 여러종류 값을 담으면 실행할때 에러남

		List<Integer> list1 = new ArrayList<>();// 뒤에는 생략하고 <>만 쓰기o
//		list1.add("Hello"); // <Integer>값이 아닌걸 넣으면 오류내줌
		list1.add(10); // 한가지 종류의 값만 담고 싶을때 선언

		List<Apple> appList = new ArrayList<>();
		appList.add(new Apple());

	}
}