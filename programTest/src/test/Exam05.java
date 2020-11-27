package test;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int[] asd = new int[10];
		int[] HOL = new int[10];
		int[] JJAK = new int[10];
		int sum = 0;

		System.out.print("첫번째 숫자 입력 : ");
		int no1 = scn.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int no2 = scn.nextInt();
		System.out.print("세번째 숫자 입력 : ");
		int no3 = scn.nextInt();
		System.out.print("네번째 숫자 입력 : ");
		int no4 = scn.nextInt();
		System.out.print("다섯번째 숫자 입력 : ");
		int no5 = scn.nextInt();
		System.out.print("여섯번째 숫자 입력 : ");
		int no6 = scn.nextInt();
		System.out.print("일곱번째 숫자 입력 : ");
		int no7 = scn.nextInt();
		System.out.print("여덟번째 숫자 입력 : ");
		int no8 = scn.nextInt();
		System.out.print("아홉번째 숫자 입력 : ");
		int no9 = scn.nextInt();
		System.out.print("열번째 숫자 입력 : ");
		int no10 = scn.nextInt();

		asd[0] += no1;
		asd[1] += no2;
		asd[2] += no3;
		asd[3] += no4;
		asd[4] += no5;
		asd[5] += no6;
		asd[6] += no7;
		asd[7] += no8;
		asd[8] += no9;
		asd[9] += no10;

		for (int i = 0; i < asd.length; i++) {
			if (asd[i] % 2 == 0) {
				JJAK[i] += asd[i];
			} else {
				HOL[i] += asd[i];
			}
		}
		
		for (int i = 0; i < JJAK.length; i++) {
			sum += JJAK[i];
		}
		System.out.println("짝수의 합 : "+sum);

		sum = 0;
		for (int i = 0; i < JJAK.length; i++) {
			sum += HOL[i];
		}
		System.out.println("홀수의 합 : "+sum);

	}
}
