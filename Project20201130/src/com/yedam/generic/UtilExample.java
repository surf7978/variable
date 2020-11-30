package com.yedam.generic;

public class UtilExample {
	public static void main(String[] args) {
		Box<String> box = Util.boxing("Orange");
		box.get();
		
		Util.boxing(100); //보기에는 int타입으로보이지만 사실은 Integer 클래스 타입임. 제네릭엔 클래스타입밖에안들어감
		//Util.boxing(new Integer(100)) =Util.boxing(100)
		Box<Integer> boxInt = Util.boxing(100);
		boxInt.get();
		
		Pair<String, Integer> p1 = new Pair<>();
		p1.setKind("Hong");
		p1.setModel(100);
		Pair<String, Integer> p2 = new Pair<>();
		p2.setKind("Hong");
		p2.setModel(100);
		if(Util.compare(p1, p2)) {
			System.out.println("논리적으로 동일한 객체입니다.");
		} else {System.out.println("논리적으로 다른 객체입니다.");}
	}

}
