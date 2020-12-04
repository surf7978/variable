package streams;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;


//emp1에 50번 부서
//1. salary 10000이상인 사원 출력 (사원번호 이름 메일 급여)
//2. 선적부서 급여 합계(평균)
//3. 급여가 5000~10000인 사원번호 이름 메일 급여
public class StreamQ201204 {
	static int employee_id;
	static int department_id;
	static int salary;
	static String firstName;
	static String lastName;
	static String email;

	public StreamQ201204() {

	}

	public StreamQ201204(int employee_id, int department_id, int salary, String firstName, String lastName,
			String email) {
		this.employee_id = employee_id;
		this.department_id = department_id;
		this.salary = salary;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;

	}

	static Scanner scn = new Scanner(System.in);
	static Connection conn = StreamQ201204.getConnection();
	static PreparedStatement psmt;
	static ResultSet rs;
	static String sql;

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

	
	
	public static int getEmployee_id() {
		return employee_id;
	}

	public static void setEmployee_id(int employee_id) {
		StreamQ201204.employee_id = employee_id;
	}

	public static int getDepartment_id() {
		return department_id;
	}

	public static void setDepartment_id(int department_id) {
		StreamQ201204.department_id = department_id;
	}

	public static int getSalary() {
		return salary;
	}

	public static void setSalary(int salary) {
		StreamQ201204.salary = salary;
	}

	public static String getFirstName() {
		return firstName;
	}

	public static void setFirstName(String firstName) {
		StreamQ201204.firstName = firstName;
	}

	public static String getLastName() {
		return lastName;
	}

	public static void setLastName(String lastName) {
		StreamQ201204.lastName = lastName;
	}

	public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		StreamQ201204.email = email;
	}

	public static void main(String[] args) {
		
		while (true) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("| 1.급여 10000이상인 사원 | 2.선적부서 급여 합계 | 3.급여가 5000~10000인 사원 | 4.종료 |");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print(" 선택 >> ");
			int select = scn.nextInt();
			String enterX = scn.nextLine();

			// 1.급여 10000이상인 사원
			if (select == 1) {
				
			}
			// 2.선적부서 급여 합계
			else if (select == 2) {
				
			}
			// 3.급여가 5000~10000인 사원
			else if (select == 3) {
				
			}
			// 4.종료
			else if (select == 4) {
				break;
			}
		}
	}

	public static List getEmployeeList() {
		conn = StreamQ201204.getConnection();
		sql = "select * from board order by 1";
		List list = new ArrayList();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				StreamQ201204 vo = new StreamQ201204();
				vo.setEmployee_id(rs.getInt("employee_id"));
				vo.setDepartment_id(rs.getInt("department_id"));
				vo.setSalary(rs.getInt("salary"));
				vo.setFirstName(rs.getString("firstName"));
				vo.setLastName(rs.getString("lastName"));
				vo.setEmail(rs.getString("email"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void showInfo() {
		System.out.println("사원번호: " + employee_id //
				+ ", 부서번호: " + department_id //
				+ ", 급여: " + salary //
				+ ", 이름: " + lastName+" "+firstName//
				+ ", 이메일: " + email);
	}
	
}
