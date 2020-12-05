package com.yedam.board;
//DAO클래스

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	Connection conn =BoardDAO.getConnection();
	PreparedStatement psmt;
	ResultSet rltS;
	String sql;
	
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
	
	public List getBoardList() {
		sql = "select * from board";
		List list = new ArrayList();
		try {
			psmt = conn.prepareStatement(sql);
			rltS = psmt.executeQuery();
			while(rltS.next()) {
				BoardVO vo =  new BoardVO();
				vo.setBoardNo(rltS.getInt("board_no"));
				vo.setTitle(rltS.getString("title"));
				vo.setContent(rltS.getString("content"));
				vo.setWriter(rltS.getString("writer"));
				vo.setCreation_date(rltS.getString("creation_date"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} return list;
	}

	public BoardVO getBoard(int menu2) {
		sql = "select * from board where board_no = "+ menu2;
		BoardVO vo =  new BoardVO();
		try {
			psmt = conn.prepareStatement(sql);
			rltS = psmt.executeQuery();
			while(rltS.next()) {
				vo.setBoardNo(rltS.getInt("board_no"));
				vo.setTitle(rltS.getString("title"));
				vo.setContent(rltS.getString("content"));
				vo.setWriter(rltS.getString("writer"));
				vo.setCreation_date(rltS.getString("creation_date"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo; 
	}
	
	public void insertBoard(BoardVO vo) {
		sql = "insert into board (board_no, title, content, writer, creation_date)"//
				+"values(?,?,?,?,sysdate)";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getBoardNo());
			psmt.setString(2, vo.getTitle());
			psmt.setString(3, vo.getContent());
			psmt.setString(4, vo.getWriter());
//			psmt.setString(5, vo.getCreation_date());
			int r = psmt.executeUpdate();
			System.out.println(r+"건이 입력됨");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void deleteBoard(int menu4) {
		sql = "delete from board where board_no= "+menu4;
		
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.executeUpdate();//이거 없으면 업데이트 안됨
			System.out.println(menu4 + "번 삭제됨");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateBoard(BoardVO vo) {
		sql = "     update board"//
				+ " set title = '" + vo.getTitle() +"'"//
				+ ", content = '" + vo.getContent() + "'"//
				+ ", writer = '" +vo.getWriter()+"'"//
				+ ", creation_date = 'sysdate'"//
				+ " where board_no = " + vo.getBoardNo();//
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
