package com.ydm;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample {

	public static void showCalME(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);//입력한 값의 월을 보여주려고 -1 시킴
							      //원래는 0이 1월임 
		// 1일 2월 3화 4수 5목 6금 7토
//		System.out.println("년도: " + cal.get(Calendar.YEAR)//
//				+ " 월: " + cal.get(Calendar.MONTH)//
//				+ " 날짜: " + cal.get(Calendar.DATE)//
//				+ " 요일: " + cal.get(Calendar.DAY_OF_WEEK)//
//				+ " 막날: " + cal.getActualMaximum(Calendar.DATE));//
//		System.out.println();

		System.out.println("       <" + year + "년 " + month + "월 달력>");
		String[] day = { "SUN", "MON", "TUE" //
				, "WED", "TUR", "FRI", "SAT" };
		for (int i = 0; i < day.length; i++) {
			System.out.printf("%4s", day[i]);
		}
		System.out.println();

		int[][] Cal = new int[6][7];
		int k = 1;
		for (int i = 0; i < Cal.length; i++) {
			for (int j = 0; j < Cal[i].length; j++) {
				if (k <= cal.getActualMaximum(Calendar.DATE) //
						+ cal.get(Calendar.DAY_OF_WEEK)) {
					Cal[i][j] += (-cal.get(Calendar.DAY_OF_WEEK))//
							+ 1 + k++;
				} else {
					break;
				}
				if (Cal[i][j] <= 0 || Cal[i][j] >= 32) {
					System.out.printf("%4s", " ");
				} else {
					System.out.printf("%4d", Cal[i][j]);
				}
			}
			System.out.println();
		}
	}
	
	public static void showCalYOU(int year, int month) {

		Calendar cal = Calendar.getInstance();
//		System.out.println(cal);
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DATE, 1);

		int md = cal.getActualMaximum(Calendar.DATE);
		int month1 = cal.get(Calendar.MONTH);
		int startYoil = cal.get(Calendar.DAY_OF_WEEK);

		System.out.print("    [ " + cal.get(Calendar.YEAR) + "년 ");
		System.out.print(month1 + 1 + "월 ]");
//		System.out.println("날짜: " + cal.get(Calendar.DATE));
		System.out.println("");
		System.out.printf("%2s %2s %2s %2s %2s %2s %2s ", "일", "월", "화", "수", "목", "금", "토");
		System.out.println();

		for (int i = 1; startYoil > i; i++) {
			System.out.printf("%3s", "");
		}
		for (int i = 1; i <= md; i++) {
			if ((startYoil + i - 2) % 7 == 0) {
				if (startYoil == 1 && i == 1) {
				} else {
					System.out.println("");
				}
			}
			System.out.printf("%3d", i);
		}

	}

	public static void showCal(int year, int month) {
		System.out.println("\t[" + year + "년 " + month + "월]");
		// 요일 정보 출력.
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		int tMonth = month - 1; // 입력월과 Calendar월 매칭.
		Calendar cal = Calendar.getInstance();
		cal.set(year, tMonth, 1);
		int lDate = cal.getActualMaximum(Calendar.DATE);// 마지막날
		int fDay = cal.get(Calendar.DAY_OF_WEEK);// 첫째날 요일정보

		// 1일의 위치지정
		for (int i = 1; i < fDay; i++) {
			System.out.printf("%4s", " ");
		}
		// 월의 마지막 날짜만큼 출력
		for (int i = 0; i < lDate; i++) {
			System.out.printf("%4d", (i + 1));
			if ((i + fDay) % 7 == 0)
				System.out.println();
		}

	}// end of showCal

	public static void main(String[] args) {
		// 1 2 3 4 5 6 7
		// 8 9 10 11 12 13 14
		// 22 23 24 25 26 27 28
		// 29 30

		int[][] Cal = new int[5][7];
		int k = 1;
		for (int i = 0; i < Cal.length; i++) {
			for (int j = 0; j < Cal[i].length; j++) {
				if (k < 31) {
					Cal[i][j] += k++;
				} else {
					break;
				}
				System.out.print(Cal[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		System.out.printf("%3d", 2); // printf = 3칸만큼 여백
		System.out.printf("%3d", 2);
		System.out.printf("%3d", 2);
		System.out.println();
		System.out.printf("%3d", 12);
		System.out.printf("%3d", 12);
		System.out.printf("%3d", 12);
		System.out.println();
		System.out.printf("%4d", 12); // 띄어진 칸 위치 잘 볼 것
		System.out.printf("%4d", 12);
		System.out.printf("%4d", 12);
		System.out.println();
		System.out.printf("%4d", 123); // 마지막 숫자 기준임(결론은 1칸 띄움)
		System.out.printf("%4d", 123);
		System.out.printf("%4d", 123);
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		for (int i = 1; i < 8; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		for (int i = 8; i < 15; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		for (int i = 15; i < 22; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		for (int i = 23; i < 30; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		System.out.printf("%3d", 30);
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		Calendar cal = Calendar.getInstance();
		System.out.println("년도: " + cal.get(Calendar.YEAR));
		System.out.println("월: " + cal.get(Calendar.MONTH));
		System.out.println("날짜: " + cal.get(Calendar.DATE));
		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK));
		// 1일 2월 3화 4수 5목 6금 7토
		System.out.println("이번달막날: " + cal.getActualMaximum(Calendar.DATE));
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		cal.set(2020, 4, 1);// 2020년 5월 1일(월은 0부터 시작함 MONTH 4 = 5월)
		System.out.println("년도: " + cal.get(Calendar.YEAR));
		System.out.println("월: " + cal.get(Calendar.MONTH));
		System.out.println("날짜: " + cal.get(Calendar.DATE));
		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("이번달막날: " + cal.getActualMaximum(Calendar.DATE));
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

//		for (int i = 0; i < 12; i++) {
//			showCalME(2020, i);
//			System.out.println("------------------------------");
//		}
		showCalME(2020, 1);// 2020년 6월달 달력 출력하기(0부터시작해서 1월임)
						   //근데 이것도 이 숫자에 맞게 월 고쳐줌
		System.out.println();
		System.out.println("------------------------------");
		showCalYOU(2020, 1);
		System.out.println();
		System.out.println("------------------------------");
		showCal(2020, 1);
		System.out.println();
		System.out.println("------------------------------");
//			Scanner scn = new Scanner(System.in);
//			while (true) {
//				System.out.println("☆★☆★☆★☆★☆★☆달력☆★☆★☆★☆★☆★☆");
//				System.out.println("보고싶은 달력의 년도와 월을 입력하세요");
//				System.out.print("년도 >");
//				int nyun = scn.nextInt();
//				scn.nextLine();
//				System.out.print("월 >");
//				int dal = scn.nextInt();
//				scn.nextLine();
//
//				showCalYOU(nyun, dal - 1); // 2020 6월달 달력보고싶다
//
//				System.out.println("");
//				System.out.println("");
//				System.out.println("다시 검색할까요? yes :1 | no :2");
//				System.out.print("입력 >");
//				int yesorno = scn.nextInt();
//				scn.nextLine();
//				if (yesorno == 1) {
//					System.out.println("--------------------------");
//				} else if (yesorno == 2) {
//					System.out.println("달력을 종료합니다.");
//					break;
//				}
//
//			}
	}// main

}// class
