package com.yedam.db2;

import java.util.ArrayList;//배열 늘려주는 명령어, 유틸 넣어줘야함
import java.util.List;//배열 늘려주는 명령어, 유틸 넣어줘야함

public class EmpServiceMain {

	public static void main(String[] args) {
		List list = new ArrayList(); //배열 늘려주는 명령어, 유틸 넣어줘야함
		list.add("Hello");
		list.add("world");
		list.add("Nice");
		
		list.remove("world");
		list.remove(0);
		
		list.get(0);//이렇게 하면 출력은 안됨. 값만 얻음
		System.out.println(list);
		System.out.println("------");
		
		list.add("Good");
		System.out.println(list.get(1));
		
		
		
		
		

	}

}
