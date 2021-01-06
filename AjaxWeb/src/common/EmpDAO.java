package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	Connection conn = null;

	public EmpDAO() {
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
	
	public boolean deleteEmp(EmployeeVO vo) {
		String sql = "delete from emp_temp where employee_id = ?"; 
		//employees 지우면 안되니까 임시로 디벨로퍼에서 emp_temp만듬 create table emp_temp as select * from employees;
		int r = 0;
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getEmployeeId());
			
			r = psmt.executeUpdate(); //쿼리한거 업데이트 시키는 명령문
			System.out.println(r + "건 삭제됨");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return r == 1 ? true : false;
	}// end of deleteEmp()
	
	public List<EmployeeVO> getEmpList() {
		String sql = "select * from emp_temp";
		List<EmployeeVO> list = new ArrayList<>();
		try {
			PreparedStatement psmt =  conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
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
		} finally {
			try {
				conn.close(); //이거 계속 켜두면 가끔 접속에러뜸 할때마다 접속꺼줘야 함
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}// end of getEmpList()
	
	public boolean insertEmp(EmployeeVO vo) {
		String sql = "insert into emp_temp"//
				+ " (employee_id, first_name, last_name, email, phone_number,salary, hire_date, job_id)"//
				+ " values(employees_seq.nextval,?,?,?,?,?,sysdate,?)";
		//employees_seq.nextval 기존에 있는 번호의 다음번호
		int r = 0;
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getFirstName());
			psmt.setString(2, vo.getLastName());
			psmt.setString(3, vo.getEmail());
			psmt.setString(4, vo.getPhoneNumber());
			psmt.setInt(5, vo.getSalary());
			psmt.setString(6, vo.getJobId()); //5아님 걍 ???? 순서대로 1234임
			r = psmt.executeUpdate();
			System.out.println(r+"건이 입력됨");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return r == 1 ? true : false;
	}
	
} //end of class
