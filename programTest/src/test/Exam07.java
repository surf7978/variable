package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam07 {
	static int board_no;
	static String title;
	static String content;
	static String writer;
	static String creation_date;

	static Scanner scn = new Scanner(System.in);
	static Connection conn = Exam07.getConnection();
	static PreparedStatement psmt;
	static ResultSet rs;
	static String sql;

	public Exam07() {

	}

	public Exam07(int board_no, String title, String content, String writer, String creation_date) {
		this.board_no = board_no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.creation_date = creation_date;
	}

	public static int getBoard_no() {
		return board_no;
	}

	public static void setBoard_no(int board_no) {
		Exam07.board_no = board_no;
	}

	public static String getTitle() {
		return title;
	}

	public static void setTitle(String title) {
		Exam07.title = title;
	}

	public static String getContent() {
		return content;
	}

	public static void setContent(String content) {
		Exam07.content = content;
	}

	public static String getWriter() {
		return writer;
	}

	public static void setWriter(String writer) {
		Exam07.writer = writer;
	}

	public static String getCreation_date() {
		return creation_date;
	}

	public static void setCreation_date(String creation_date) {
		Exam07.creation_date = creation_date;
	}

	public void showInfo() {
		System.out.println("글번호: " + board_no //
				+ ", 글제목: " + title //
				+ ", 글내용: " + content //
				+ ", 작성자: " + writer//
				+ ", 작성일: " + creation_date);
	}

	public static List getBoardList() {
		conn = Exam07.getConnection();
		sql = "select * from board order by 1";
		List list = new ArrayList();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Exam07 vo = new Exam07();
				vo.setBoard_no(rs.getInt("board_no"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				vo.setCreation_date(rs.getString("creation_date"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public static Connection getConnection() {
		Connection conn = null;
		try {
			String user = "oracle";
			String pw = "oracle";
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

		Exam07 service = new Exam07();
		
		while (true) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("| 1.등록 | 2.수정 | 3.삭제 | 4.전체목록 | 5.종료  |");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print(" 선택 >> ");
			int select = scn.nextInt();
			String enterX = scn.nextLine();

			//1.등록
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
			} 
			//2.수정
			else if (select == 2) {
				System.out.print("수정할 글번호 : ");
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
			} 
			//3.삭제
			else if (select == 3) {
				System.out.print("삭제할 글번호 : ");
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
			} 
			//4.전체목록
			else if (select == 4) {
				List list = service.getBoardList();
				for (Object vo : list) {
					Exam07 brd = (Exam07) vo;
					brd.showInfo();
				}
			} 
			//5.종료
			else if (select == 5) {
				break;
			}
		}// while
		System.out.println("프로그램 종료");
	}// main

}// class