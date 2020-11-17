package interation;

import java.util.Scanner;//마우스대고 java import로 적용시킴

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int balance = 0;

		while (run) {
			System.out.println("------------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("------------------------");
			System.out.print("선택> ");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.print("예금액> ");
				balance += scn.nextInt();
			} else if (menu == 2) {
				System.out.print("출금액> ");
				balance -= scn.nextInt();
			} else if (menu == 3) {
				System.out.println("잔고> " + balance);
			} else if (menu == 4) {
				run = false;
			}
		}
		System.out.println("<프로그램 종료>");
	}
}