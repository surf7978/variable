package streams;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;


public class StreamQ201204 {
	private int employeeId;
	private int departmentId;
	private int salary;
	private String firstName;
	private String lastName;
	private String email;

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


	public StreamQ201204(int employeeId, int departmentId, int salary //
			, String firstName, String lastName, String email) { //
		super();
		this.employeeId = employeeId;
		this.departmentId = departmentId;
		this.salary = salary;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public StreamQ201204() {
		
	}

	public void showInfo() {
		System.out.println("사원번호: " + employeeId //
				+ ", 부서번호: " + departmentId //
				+ ", 이름: " + lastName + " " + firstName//
				+ ", 급여: " + salary //
				+ ", 이메일: " + email);
	}
	
	static Connection conn = null;
	static PreparedStatement psmt;
	static ResultSet rs;
	static String sql;

	public static Connection getConnection() {
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
	
	public static List<StreamQ201204> getEmployeeList() {
		conn = StreamQ201204.getConnection();
		sql = "select * from employees";
		List<StreamQ201204> list = new ArrayList<StreamQ201204>();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				StreamQ201204 a = new StreamQ201204();
				a.setEmployeeId(rs.getInt("employee_id"));
				a.setDepartmentId(rs.getInt("department_id"));
				a.setSalary(rs.getInt("salary"));
				a.setFirstName(rs.getString("first_name"));
				a.setLastName(rs.getString("last_name"));
				a.setEmail(rs.getString("email"));
				list.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	static List<StreamQ201204> list = 
			
			getEmployeeList();
	
//			Arrays.asList(
//			new StreamQ201204(124, 50, 5800, "Kevin", "Mourgos", "KMOURGOS"), //
//			new StreamQ201204(141, 50, 3500, "Trenna", "Rajs", "TRAJS"), //
//			new StreamQ201204(142, 50, 3100, "Curtis", "Davies", "CDAVIES"), //
//			new StreamQ201204(143, 50, 12600, "Randall", "Matos", "RMATOS"), //
//			new StreamQ201204(144, 50, 12500, "Peter", "Vargas", "PVARGAS") //
//						);

	public static void main(String[] args) {
		
		Stream<StreamQ201204> stream = list.stream();
		
		// 1.salary 10000이상인 사원 출력 (사원번호 이름 메일 급여)
		System.out.println("<50번 부서에 근무하는 사원 중 급여가 5000 이상인 사원목록>");
		
		stream.filter(new Predicate<StreamQ201204>() {
			@Override
			public boolean test(StreamQ201204 t) {
				return t.getSalary() > 5000 //
						&& t.getDepartmentId() > 49 && t.getDepartmentId() < 51;
			}
		}).forEach(new Consumer<StreamQ201204>() {
			@Override
			public void accept(StreamQ201204 a) {
				a.showInfo();
			}
		});
		
		System.out.println("-------------------------------------------------------------------------");
		
		
		
		
		// 2.선적부서(50번부서) 급여 합계(평균)
		int sum = 
		list.stream().filter(new Predicate<StreamQ201204>() {
			@Override
			public boolean test(StreamQ201204 t) {
				return 49 < t.getDepartmentId() && t.getDepartmentId() < 51;
			}
		}).mapToInt(new ToIntFunction<StreamQ201204>() {
			@Override
			public int applyAsInt(StreamQ201204 value) {
				return value.getSalary();
			}
		}).sum();
		
		System.out.println("50번 부서에서 근무하는 사원의 급여 총합 : "+sum);
		
		System.out.println("-------------------------------------------------------------------------");

		
		
		// 3.급여가 5000~10000인 사원번호 이름 메일 급여
		System.out.println("<급여가 5000~10000 사이인 사원목록>");
		
		stream = list.stream();
		stream.filter(new Predicate<StreamQ201204>() {
			@Override
			public boolean test(StreamQ201204 t) {
				return 5000 < t.getSalary() && t.getSalary() < 10000;
			}
		}).forEach(new Consumer<StreamQ201204>() {
			@Override
			public void accept(StreamQ201204 a) {
				a.showInfo();
			}
		});
		
	}

}
