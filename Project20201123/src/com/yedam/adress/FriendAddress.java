package com.yedam.adress;

import java.util.Scanner;

public class FriendAddress {
	// 주소록 생성 프로그램...
	public static void main(String[] args) {
		Friend[] friends = new Friend[100];
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("| 1.친구등록 | 2.학교친구 | 3.회사친구 | 4.전체리스트 | 5.종료 | 6.입력번호조회 |");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("선택 >> ");
			int selectNo = scn.nextInt();
			String select = scn.nextLine();

			if (selectNo == 1) {
				System.out.print("친구이름: ");
				String name = scn.nextLine();
				System.out.print("전화번호: ");
				String phone = scn.nextLine();
				Friend frnd = new Friend(name, phone);
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = frnd;
						break;
					}
				}
			} else if (selectNo == 2) {
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
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = frnd;
						break;
					}
				}
			} else if (selectNo == 3) {
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
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = frnd;
						break;
					}
				}
			} else if (selectNo == 4) {
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null) {
						friends[i].showFriendInfo();
					}
				}

			} else if (selectNo == 5) {
				break;
			} else if (selectNo == 6) {
				System.out.print("조회할 번호입력 : ");
				String whoNo = scn.nextLine();
				for(int i=0; i<friends.length; i++) {
					if(friends[i] != null && whoNo.equals(friends[i].getPhone())) {
						friends[i].showFriendInfo();
					}
				}
			}
		}
		System.out.println("프로그램 종료");

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

}// endof class.
