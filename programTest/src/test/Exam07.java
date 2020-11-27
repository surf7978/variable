package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Exam07 {

	public static Connection getConnection() {
		Connection conn = null;
		try {
			String user = "hr";
			String pw = "hr";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);

			System.out.println("Database에 연결되었습니다.\n");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("DB 드라이버 로딩 실패 :" + cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("DB 접속실패 : " + sqle.toString());
		} catch (Exception e) {
			System.out.println("Unkonwn error");
			e.printStackTrace();
		}
		return conn;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Connection conn = Exam07.getConnection();
		PreparedStatement psmt;
		String sql;

		while (true) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("| 1.등록 | 2.수정 | 3.삭제 | 4.전체목록 | 5.종료  |");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print(" 선택 >> ");
			int select = scn.nextInt();
			String enterX = scn.nextLine();

			if (select == 1) {
				System.out.print("글번호 입력: ");
				int boardNo = scn.nextInt();
				enterX = scn.nextLine();
				System.out.print("제목 입력: ");
				String title = scn.nextLine();
				System.out.print("내용 입력: ");
				String content = scn.nextLine();
				System.out.print("작성자 입력: ");
				String writer = scn.nextLine();

				sql = "insert into board (board_no, title, content, writer, creation_date)"//
						+ "values(?,?,?,?,sysdate)";
				try {
					psmt = conn.prepareStatement(sql);
					psmt.setInt(1, boardNo);
					psmt.setString(2, title);
					psmt.setString(3, content);
					psmt.setString(4, writer);
					int r = psmt.executeUpdate();
					System.out.println(sql);
					System.out.println(r + "건이 입력됨");
				} catch (SQLException e) {
					e.printStackTrace();
				}

			} else if (select == 2) {
				System.out.print("수정할 번호 : ");
				int boardNo = scn.nextInt();
				enterX = scn.nextLine();
				System.out.print("제목 입력: ");
				String title = scn.nextLine();
				System.out.print("내용 입력: ");
				String content = scn.nextLine();
				System.out.print("작성자 입력: ");
				String writer = scn.nextLine();

				sql = "     update board"//
						+ " set title = '" + title + "'"//
						+ ", content = '" + content + "'"//
						+ ", writer = '" + writer + "'"//
						+ ", creation_date = 'sysdate'"//
						+ " where board_no = " + boardNo;//
				try {
					psmt = conn.prepareStatement(sql);
					int r = psmt.executeUpdate();
					System.out.println(sql);
					System.out.println(r + "건 수정됨.");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else if (select == 3) {
				System.out.print("삭제할 번호 : ");
				int deleteNo = scn.nextInt();

				sql = "delete from board where board_no= " + deleteNo;

				try {
					psmt = conn.prepareStatement(sql);
					psmt.executeUpdate();
					System.out.println(sql);
					System.out.println(deleteNo + "번 삭제됨");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else if (select == 4) {
				sql = "select * from board";

				try {
					PreparedStatement psmt1 = conn.prepareStatement(sql);
					psmt1.executeUpdate();
					System.out.println(sql);
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			} else if (select == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}// main

}// class