package com.yedam.board;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//실행클래스
public class BoardMain {

	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		
		BoardService service = new BoardVO();

		while (true) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("| 1.리스트 | 2.상세화면 | 3.등록 | 4.삭제 | 5.수정 | 6.종료 |");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println(" 선택 >> ");
			int select = scn.nextInt();
			String enterX = scn.nextLine();

			if (select == 1) { 
				List list = service.getBoardList();
				for (Object vo : list) { 
					BoardVO brd = (BoardVO) vo;
					brd.showInfo();
				}

			} else if (select == 2) {
				System.out.print("조회할 번호 입력: ");
				int selectmenu2 = scn.nextInt();

				BoardVO vo = service.getBoard(selectmenu2);
				vo.showInfo();
			} 
			
			else if (select == 3) {
				System.out.print("글번호 입력: ");
				int boardNo = scn.nextInt();
				enterX = scn.nextLine();
				System.out.print("제목 입력: ");
				String title = scn.nextLine();
				System.out.print("내용 입력: ");
				String content = scn.nextLine();
				System.out.print("작성자 입력: ");
				String writer = scn.nextLine();
//				System.out.print("작성일 입력: ");
//				String creation_date = scn.nextLine();
				
				BoardVO vo = new BoardVO(boardNo, title, content, writer);
				service.insertBoard(vo);
			} 
			
			else if (select == 4) {
				System.out.print("삭제할 번호 : ");
				int delete = scn.nextInt();
				
				service.deleteBoard(delete);
			} 
			
			else if (select == 5) {
				System.out.print("수정할 번호 : ");
				int boardNo = scn.nextInt();
				enterX = scn.nextLine();
				System.out.print("제목 입력: ");
				String title = scn.nextLine();
				System.out.print("내용 입력: ");
				String content = scn.nextLine();
				System.out.print("작성자 입력: ");
				String writer = scn.nextLine();
				
				BoardVO vo = new BoardVO(boardNo, title, content, writer);
				service.updateBoard(vo);
			} 
			
			else if (select == 6) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}// main

}// class
