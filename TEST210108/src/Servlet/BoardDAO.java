package Servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	Connection conn = null;

	public BoardDAO() {
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
	} // end of 생성자
	
	public boolean insertBoard(BoardVO vo) {
		String sql = "insert into boards "//
				+ "(board_no, title, content, writer, creation_date) "//
				+"values((select nvl(max(board_no),0)+1 from boards),?,?,?,sysdate)";
		//nvl(max(board_no)+1)하는 이유 : 처음에는 null값이라 게속 null 나옴 nvl써서 null나오면 걍 1뜨게 하려고
		int cnt = 0;
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getTitle());
			psmt.setString(2, vo.getContent());
			psmt.setString(3, vo.getWriter());
			cnt = psmt.executeUpdate();
			System.out.println(cnt+"건 입력됨");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cnt == 1 ? true : false;
	}
	
	public List getBoardList() {
		String sql = "select * from boards";
		List list = new ArrayList();
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				BoardVO vo =  new BoardVO();
				vo.setBoardNo(rs.getInt("board_no"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				vo.setCreation_date(rs.getString("creation_date"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}return list;
	}
	
	public boolean updateBoard(BoardVO vo) {
		String sql = "UPDATE boards " //
				+ "SET title = ?," //
				+ "content = ?," //
				+ "writer = ?," //
				+ "creation_date = ?" //
				+ "WHERE board_no = ?";
		int r = 0;
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getTitle());
			psmt.setString(2, vo.getContent());
			psmt.setString(3, vo.getWriter());
			psmt.setString(4, vo.getCreation_date());
			psmt.setInt(5, vo.getBoardNo());
			r = psmt.executeUpdate();
			System.out.println(r + "건이 수정됨");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return r == 1 ? true : false;
	}
}
