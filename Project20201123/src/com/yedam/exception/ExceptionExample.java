package com.yedam.exception;

import java.sql.Connection;
import java.sql.SQLException;

import com.yedam.common.DAO;

public class ExceptionExample {
	public static void main(String[] args) {
		int num = 20;

		try {
			int[] numbers = new int[3];
			numbers[3] = 10; // 에러떴지만 빨간줄 안보여주는 예
		} catch (Exception e) {
			System.out.println("에러발생");
		} // 예외처리 하는 이유 : 에러떴지만 데이터 날리지 않고 정상종료 시키려고 사용함

		try {
			String str = null;
			System.out.println(str.toString());// 에러떴지만 안보여주는 예1
		} catch (NullPointerException e) { //이거 위에꺼랑 다름, 위에껄로해도됨
			System.out.println("출력값이 없습니다.");
		}

		Connection conn = DAO.getConnection();
		try {
			conn.close();  //이건 반드시 예외처리 해줘야함
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상종료");
	}
}
