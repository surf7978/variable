package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Q201205 {
	private int employeeId;
	private int departmentId;
	private int salary;
	private String firstName;
	private String lastName;
	private String email;

	static Connection conn = getConnection();
	static PreparedStatement psmt;
	static ResultSet rs;
	static String sql;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Q201205() {

	}

	public Q201205(int employeeId, int departmentId, int salary, String firstName, String lastName, String email) {
		super();
		this.employeeId = employeeId;
		this.departmentId = departmentId;
		this.salary = salary;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
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

	public static List getEmployeeList() {
		conn = Q201205.getConnection();
		sql = "select * from employees";
		List list = new ArrayList();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Q201205 vo = new Q201205();
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setDepartmentId(rs.getInt("department_id"));
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

	public static void main(String[] args) {

	}

}
