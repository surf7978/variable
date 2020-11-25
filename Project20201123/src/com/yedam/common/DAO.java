package com.yedam.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yedam.db.Employee;

public class DAO {
	Connection conn = getConnection();

	public void insertEmployee(Employee emp) {
		String sql = "insert into emp1(last_name, email, job_id, hire_date) "//
				+ "values(?, ?, ?, ?)";// ?= 각 파라미터에 값 지정해줘야함
									   // insertEmployee(Employee emp)에 입력되어있음
		try {
			conn.prepareStatement(sql);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, emp.getLastName());// 여기에 ?,?,?,?넣음
			psmt.setString(2, emp.getEmail());
			psmt.setString(3, emp.getJobId());
			psmt.setString(4, emp.getHireDate());
			int r = psmt.executeUpdate();//insert, update, delete
			System.out.println(r+"건이 입력됨");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Employee[] getEmpList() {
		String sql = "select * from emp1";
		Employee[] emps = new Employee[100];
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_Date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				emps[i++] = emp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emps;
	}

	public Employee[] getDepartmentList() {
		String sql = "select * from departments";
		Employee[] depts = new Employee[100];
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				Employee dept = new Employee();
				dept.setDepartmentId(rs.getInt("department_id"));
				dept.setDepartmentName(rs.getString("department_name"));
				dept.setManagerId(rs.getString("manager_id"));
				dept.setLocationId(rs.getString("location_id"));
				depts[i++] = dept;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return depts;
	}

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
}
