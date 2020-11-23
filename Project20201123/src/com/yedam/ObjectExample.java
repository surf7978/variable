package com.yedam;

import java.util.Scanner;

public class ObjectExample {
	public static void main(String[] args) {
		System.out.println("Hello");
		Scanner scn;
		
		Object o1 = new Object();
		boolean sameOrDiff = o1.equals("Hello");
		System.out.println(sameOrDiff);
		
		System.out.println(o1.toString());
			
	}
}
