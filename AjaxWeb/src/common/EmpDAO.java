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
		String sql = "select * from emp_temp order by 1";
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
	
	public EmployeeVO insertEmp(EmployeeVO vo) {
		String sql1 = "select employees_seq.nextval from dual";
		String sql2 = "select * from emp_temp where employee_id = ?";
		String sql3 = "insert into emp_temp"//
				+ " (employee_id, first_name, last_name, email, phone_number,salary, hire_date, job_id)"//
				+ " values(?,?,?,?,?,?,sysdate,?)";
		System.out.println(vo);
		//employees_seq.nextval 기존에 있는 번호의 다음번호 근데 이걸 1번콜름에 넣으면 밖으로 가져올 방법이 없음
		//그래서 쿼리 3번함
		int r = 0;
		String newSeq = null;
		EmployeeVO newVO = new EmployeeVO();
		try {
			PreparedStatement psmt = conn.prepareStatement(sql1);
			ResultSet rs = psmt.executeQuery();
			if(rs.next()) {
				newSeq = rs.getString(1);//1=첫번째 콜름=employee_id 이걸로 employees_seq.nextval된 숫자 가져옴
			}
			psmt = conn.prepareStatement(sql3);
			psmt.setString(1, newSeq);
			psmt.setString(2, vo.getFirstName());
			psmt.setString(3, vo.getLastName());
			psmt.setString(4, vo.getEmail());
			psmt.setString(5, vo.getPhoneNumber());
			psmt.setInt(6, vo.getSalary()); //sysdate자리 6번아님 = 걍 ???????순서대로 1234567임
			psmt.setString(7, vo.getJobId()); 
			r = psmt.executeUpdate();
			System.out.println(r+"건이 입력됨");
			
			psmt = conn.prepareStatement(sql2);
			psmt.setString(1, newSeq);
			rs=psmt.executeQuery();
			if(rs.next()) {
				newVO.setEmployeeId(rs.getInt("employee_id"));
				newVO.setFirstName(rs.getString("first_name"));
				newVO.setLastName(rs.getString("last_name"));
				newVO.setEmail(rs.getString("email"));
				newVO.setPhoneNumber(rs.getString("phone_number"));
				newVO.setHireDate(rs.getString("hire_date"));
				newVO.setJobId(rs.getString("job_id"));
				newVO.setSalary(rs.getInt("salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return newVO;
	}
	
} //end of class
