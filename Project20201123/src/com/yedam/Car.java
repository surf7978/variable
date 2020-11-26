package com.yedam;

public class Car {
	//field
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	//Constructor
	public Car() { //public 안 정해주면 동일한 패키지 내에서만 접근가능
		
	}
	public Car(String company){
		this.company = company;
	}
	public Car(String company, String model){
		this.company = company;
		this.model = model;
	}
	public Car(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	//Method
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void showInfo() {
		System.out.println(company);
		System.out.println(model);
		System.out.println(color);
		System.out.println(maxSpeed);
	}
	
}
