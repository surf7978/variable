package programTest1208;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Employee {
	private int employeeId;
	private int departmentId;
	private int salary;
	private String firstName;
	private String lastName;
	private String jobId;
	private String hireDate;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	
	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public Employee(int employeeId, int departmentId, int salary //
			, String firstName, String lastName, String jobId, String hireDate) { //
		super();
		this.employeeId = employeeId;
		this.departmentId = departmentId;
		this.salary = salary;
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobId = jobId;
		this.hireDate = hireDate;
	}

	public Employee() {

	}

	public void showInfo() {
		System.out.println("사원번호: " + employeeId //
				+ ", 이름: '" + lastName + " " + firstName//
				+ ", 입사일: "+hireDate
				+ ", 부서번호: " + departmentId //
				+ ", 급여: " + salary //
				+ ", 직무: " + jobId); //
	}

	static Connection conn = null;
	static PreparedStatement psmt;
	static ResultSet rs;
	static String sql;

	public static Connection getConnection() {
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

	public static List<Employee> getDBList() {
		conn = Employee.getConnection();
		sql = "select * from employees";
		List<Employee> list = new ArrayList<Employee>();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Employee a = new Employee();
				a.setEmployeeId(rs.getInt("employee_id"));
				a.setDepartmentId(rs.getInt("department_id"));
				a.setSalary(rs.getInt("salary"));
				a.setFirstName(rs.getString("first_name"));
				a.setLastName(rs.getString("last_name"));
				a.setJobId(rs.getString("job_id"));
				a.setHireDate(rs.getString("hire_date"));
				list.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
}// class
