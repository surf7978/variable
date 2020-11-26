package com.yedam.adress;

import java.util.Scanner;

public class FriendAddress {

	static Friend[] friends = new Friend[100];
	static Scanner scn = new Scanner(System.in);

	// 주소록 생성 프로그램...
	public static void main(String[] args) {

		while (true) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("| 1.친구등록 | 2.학교친구 | 3.회사친구 | 4.전체리스트 | 5.종료 | 6.조회 |");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("선택 >> ");
			int selectNo = scn.nextInt();
			String enterX = scn.nextLine();

			if (selectNo == 1) {
				addFriend();
			} else if (selectNo == 2) {
				addUnivFriend();
			} else if (selectNo == 3) {
				addCompFriend();
			} else if (selectNo == 4) {
				showFriend();
			} else if (selectNo == 5) {
				System.out.println("프로그램 종료");
				break;
			} else if (selectNo == 6) {
				searchFriend();
			}
		}
//		Friend f1 = new Friend("친구1","11-1111");
//		CompFriend f2 = new CompFriend("친구2","22-2222");
//		f2.setCompany("네이버");
//		f2.setDepartment("개발부서");
//		UnivFriend f3 = new UnivFriend("친구3", "33-3333");
//		f3.setUniv("서울대학교");
//		f3.setMajor("컴퓨터정보");
//		
//		f1.showFriendInfo();
//		f2.showFriendInfo();
//		f3.showFriendInfo();

	}// end of main()
	//1.친구등록
	public static void addFriend() {
		System.out.print("친구이름: ");
		String name = scn.nextLine();
		System.out.print("전화번호: ");
		String phone = scn.nextLine();
		Friend frnd = new Friend(name, phone);
		insertFriend(frnd);
	}
	//2.학교친구
	public static void addUnivFriend() {
		System.out.print("친구이름: ");
		String name = scn.nextLine();
		System.out.print("전화번호: ");
		String phone = scn.nextLine();
		System.out.print("학교이름: ");
		String univ = scn.nextLine();
		System.out.print("전공명: ");
		String major = scn.nextLine();
		UnivFriend frnd = new UnivFriend(name, phone);
		frnd.setUniv(univ);
		frnd.setMajor(major);
		insertFriend(frnd);
	}
	//3.회사친구
	public static void addCompFriend() {
		System.out.print("친구이름: ");
		String name = scn.nextLine();
		System.out.print("전화번호: ");
		String phone = scn.nextLine();
		System.out.print("회사이름: ");
		String company = scn.nextLine();
		System.out.print("부서정보: ");
		String department = scn.nextLine();
		CompFriend frnd = new CompFriend(name, phone);
		frnd.setCompany(company);
		frnd.setDepartment(department);
		insertFriend(frnd);
	}
	//4.전체리스트
	public static void showFriend() {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				friends[i].showFriendInfo();
			}
		}
	}
	//6.조회
	public static void searchFriend() {
		System.out.println("<조회방법 선택>");
		System.out.println("1.번호로 조회");
		System.out.println("2.이름으로 조회");
		System.out.print("숫자선택 >> ");
		int whoHow = scn.nextInt();
		String enterX = scn.nextLine();
		if (whoHow == 1) {
			System.out.print("조회할 번호입력 : ");
			String whoNo = scn.nextLine();
			for (int i = 0; i < friends.length; i++) {
				if (friends[i] != null && whoNo.equals(friends[i].getPhone())) {
					friends[i].showFriendInfo();
				}
			}
		} else if (whoHow == 2) {
			System.out.print("조회할 이름입력 : ");
			String whoName = scn.nextLine();
			for (int i = 0; i < friends.length; i++) {
				if (friends[i] != null && whoName.equals(friends[i].getName())) {
					friends[i].showFriendInfo();
				}
			}
		}
	}
	//1~3메소드에 들어가는 1건 입력 메소드
	public static void insertFriend(Friend frnd) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = frnd;
				break;
			}
		}
	}
	

}// end of class.
