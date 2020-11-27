package com.yedam.board;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class asd201127 {
	public static void main(String[] args) {
		// 정수 3개를 입력받아 오름차순으로 정렬하는 프로그램 작성
		// ex) 1번째 34, 2번째 29, 3번때 67 >>> 29,34,67로 나오게 작성

		Scanner scn = new Scanner(System.in);

		int[] asd = new int[3];

		System.out.print("첫번째 숫자 입력 : ");
		int first = scn.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int second = scn.nextInt();
		System.out.print("세번째 숫자 입력 : ");
		int third = scn.nextInt();

		asd[0] += first;
		asd[1] += second;
		asd[2] += third;
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.print("입력한 숫자 :");
		for (int i = 0; i < asd.length; i++) {
			 System.out.print(asd[i]+" ");
		}
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		Arrays.sort(asd);
		
		System.out.print("오름차순으로 정렬한 결과 :");
		for (int i = 0; i < asd.length; i++) {
			 System.out.print(asd[i]+" ");
		}
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		System.out.println("<리스트를 사용해서 만들어보기>");
		
		List list= new ArrayList();
		System.out.print("첫번째 숫자 입력 : ");
		first = scn.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		second = scn.nextInt();
		System.out.print("세번째 숫자 입력 : ");
		third = scn.nextInt();
		
		list.add(first);
		list.add(second);
		list.add(third);
		
		Collections.sort(list);
		System.out.printf("오름차순으로 정렬한 결과 : %3s", list);
		System.out.println();
		
		System.out.print("오름차순으로 정렬한 결과 :");
		for(Object i : list) {
			System.out.printf("%3s", i);
		}
		
	}
}
