package com.yedam.db2;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class EmpDAO {
	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	// 전체조회
	public List getEmpList() {
		conn = DAO.getConnection();
		sql = "select * from emp1 order by 1";
		List list = new ArrayList();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));
				vo.setEmail(rs.getString("email"));
				vo.setPhoneNumber(rs.getString("phone_number"));
				vo.setHireDate(rs.getString("hire_date"));
				vo.setJobId(rs.getString("job_id"));
				vo.setSalary(rs.getInt("salary"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	// 한건조회
	public EmployeeVO getEmp(int empId) {
		conn = DAO.getConnection();
		sql = "select * from emp1 Where employee_id =" + empId;
		EmployeeVO vo = new EmployeeVO();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));
				vo.setEmail(rs.getString("email"));
				vo.setPhoneNumber(rs.getString("phone_number"));
				vo.setHireDate(rs.getString("hire_date"));
				vo.setJobId(rs.getString("job_id"));
				vo.setSalary(rs.getInt("salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	// 한건입력
	public void insertEmp(EmployeeVO vo) {
		conn = DAO.getConnection();
		sql = "insert into emp1 (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary) "
				+ "values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getEmployeeId());
			psmt.setString(2, vo.getFirstName());
			psmt.setString(3, vo.getLastName());
			psmt.setString(4, vo.getEmail());
			psmt.setString(5, vo.getPhoneNumber());
			psmt.setString(6, vo.getHireDate());
			psmt.setString(7, vo.getJobId());
			psmt.setInt(8, vo.getSalary());
			int r = psmt.executeUpdate();
			System.out.println(sql);
			System.out.println(r + "건이 입력됨");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 한건수정
	public void updateEmp(EmployeeVO vo) {
		conn = DAO.getConnection();
		if (vo.getSalary() != 0) {
			sql = "     update emp1"//
					+ " set email = nvl('" + vo.getEmail() + "',email)" //
					+ ", phone_number = nvl('" + vo.getPhoneNumber() + "',phone_number)"//
					+ ", salary = nvl(" + vo.getSalary() + ", salary)"//
					+ " where employee_id = " + vo.getEmployeeId();//
		} else {
			sql = "     update emp1"//
					+ " set email = nvl('" + vo.getEmail() + "',email)" //
					+ ", phone_number = nvl('" + vo.getPhoneNumber() + "',phone_number)"//
					+ " where employee_id = " + vo.getEmployeeId();//
		}
		System.out.println(sql);// 입력잘됬는지 확인용(없어도됨)
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 수정됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 한건삭제
	public void deleteEmp(int empId) {
		conn = DAO.getConnection();
		sql = "DELETE FROM emp1 WHERE employee_id = " + empId;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();// 이거 없으면 업데이트 안됨
			System.out.println(sql);
			System.out.println(empId + "번 사원 삭제됨");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<EmployeeVO> getDeptList(String dept) {
		conn = DAO.getConnection();
		sql = "select * from emp1 where department_id = "//
				+ "(select department_id from departments where department_name = '" //
				+ dept + "')";
		List<EmployeeVO> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println(sql);
			while (rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));
				vo.setEmail(rs.getString("email"));
				vo.setPhoneNumber(rs.getString("phone_number"));
				vo.setHireDate(rs.getString("hire_date"));
				vo.setJobId(rs.getString("job_id"));
				vo.setSalary(rs.getInt("salary"));

				vo.setDepartmentId(rs.getInt("department_id"));
				vo.setManagerId(rs.getString("manager_id"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
