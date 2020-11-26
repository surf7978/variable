package com.yedam;

import java.io.IOException;

public class StringExample {

	public static void main(String[] args) {
		String str1 = new String();
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		String str2 = new String(bytes);
		System.out.println(str2.toString());//문자값을 입력한 것이었음...
		
		String str3 = new String(bytes, 6, 4); //6번째 위치부터 4개까지 출력
		System.out.println(str3.toString());
		
		byte[] bytes2 = new byte[100];
//		try {
//			int readByteNo = System.in.read(bytes2);//입력한 값을 읽어서 출력
//			String str4 = new String(bytes2,0,readByteNo);
//			System.out.println(str4);
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 
		
		char chr = str2.charAt(0);
		System.out.println(chr);
		
	}
}
