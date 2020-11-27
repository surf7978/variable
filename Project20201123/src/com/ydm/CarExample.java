package com.ydm;

import com.yedam.Car;

public class CarExample {

	public static void main(String[] args) {
		Car c1 =new Car();//com.yem에 Car class 안 만들면 접근안됨
				  		  //cam.yedam에 Car class를 public으로 해줘도 됨
		 				  //단 이때 import해줘야함
		Car c2 = new Car("현대");
		Car c3 = new Car("삼성", "SM5");
		
	}

}
