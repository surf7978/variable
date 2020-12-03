package com.yedam.functional;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		//매개값은 없고 대신 반환값을 가지는 유형의 인터페이스다.
		Supplier<String> sup = null;
		sup = new Supplier<String>() {
			@Override
			public String get() {//Supplier은 get을 씀
				return "Hello";
			}
		};
		System.out.println(sup.get());
		
		Supplier<Integer> intSup = null;
		intSup = new Supplier<Integer>() {

			@Override
			public Integer get() {
				// TODO Auto-generated method stub
				int result = 35*20;
				return result;
			}
			
		};
		//System.out.println(intSup.get());//되긴되는데 오류남
		
		IntSupplier intSupp=new IntSupplier() {

			@Override
			public int getAsInt() {
				return (int)(Math.random()*6)+1;
			}
			
		};
		System.out.println(intSupp.getAsInt());
		
		
		
		
		
		
		
		
		
	}

}
