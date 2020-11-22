package item;

import java.util.Scanner;

public class item2 {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println();
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("| 1.제작 | 2.제련 | 3.판매 | 4.목록 | 5.종료 |");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("사용할 메뉴 선택 >> ");
			int selectMenu = scn.nextInt();
			
			if(selectMenu==1) {
				item1 menu1 = new item1();
				menu1.main(String[] args);
			}
			else if(selectMenu==2) {}
			else if(selectMenu==3) {}
			else if(selectMenu==4) {}
			else if(selectMenu==5) 
			{
				System.out.println("<<프로그램 종료>>");
				run = false;
			}
		}
	}
}
