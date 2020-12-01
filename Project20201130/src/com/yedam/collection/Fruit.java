package com.yedam.collection;

public class Fruit {
	private String name;
	private int price;

	public Fruit() {

	}

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public int hashCode() {
//기존	return super.hashCode();
//		return this.name.hashCode()+this.price;
		
		
		//이름의 문자열 길이가 같을 때 중복으로 쳐서 제거용 해쉬코드
		return this.name.length()+this.price;
	}

//	@Override
//	public boolean equals(Object obj) {
////기존	return super.equals(obj);
//		
//		Fruit fruit = (Fruit) obj; //Object obj >> Fruit 클래스로 Casting 해야됨
//		
//		//이름이랑 가격이 같을 경우 중복제거
//		return this.name.equals(fruit.name) && this.price == fruit.price;
	
//택2 	Fruit fruit = (Fruit) obj;
//		boolean b1 = this.name.equals(fruit.name);
//	  	boolean b2 = this.price == fruit.price;
//		return b1 && b2;
	
//	}
	
	@Override
	public boolean equals(Object obj) {
		
		//이름의 문자열 길이가 같을 때 중복으로 쳐서 제거
		Fruit fruit = (Fruit) obj;
		return this.name.length() == fruit.name.length() && this.price == fruit.price;
		
//		boolean b1 = this.name.length() == fruit.name.length();
//		boolean b2 = this.price == fruit.price;
		//위에 public int hashCode() 도 바꿔줘야함
//		return b1 && b2;
		
	}

	
}
