package com.yedam.collection;

public class Person extends Object/*디폴트라 생략되어보이는 extends Object*/{
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	//우클+Source+overide
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		boolean result = this.name.equals(p.name);
		return result;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
