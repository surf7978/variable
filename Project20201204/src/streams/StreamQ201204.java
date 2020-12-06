package streams;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
				+ ", 이름: '" + lastName + " " + firstName//
				+ "', 급여: " + salary //
				+ ", 이메일: " + email + "@email.com");
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

	public static List<StreamQ201204> getDBList() {
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

			getDBList();

//			Arrays.asList(
//			new StreamQ201204(124, 50, 5800, "Kevin", "Mourgos", "KMOURGOS"), //
//			new StreamQ201204(141, 50, 3500, "Trenna", "Rajs", "TRAJS"), //
//			new StreamQ201204(142, 50, 3100, "Curtis", "Davies", "CDAVIES"), //
//			new StreamQ201204(143, 50, 12600, "Randall", "Matos", "RMATOS"), //
//			new StreamQ201204(144, 50, 12500, "Peter", "Vargas", "PVARGAS") //
//						);

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		boolean run = true;
		Stream<StreamQ201204> stream = list.stream();
		
		System.out.println("<현재 등록된 DB>");
		stream.forEach(new Consumer<StreamQ201204>() {
			@Override
			public void accept(StreamQ201204 a) {
				a.showInfo();
			}
		});
		System.out.println();

		while (run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("| 1.급여가 10000이상인 사원목록 | 2.선택한 부서에 근무하는 사원들의 급여 총합 | 3.급여가 5000~10000인 사원목록 |");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print(" 선택 >>> ");
			int select = scn.nextInt();
			String enterX = scn.nextLine();

			if (select == 1) {
				// 1.salary 10000이상인 사원 출력 (사원번호 이름 메일 급여)
				stream = list.stream();
				
				System.out.println();
				System.out.println("<급여가 10000 이상인 사원목록>");
				stream.filter(new Predicate<StreamQ201204>() {
					@Override
					public boolean test(StreamQ201204 t) {
						return t.getSalary() > 10000;
					}
				}).forEach(new Consumer<StreamQ201204>() {
					@Override
					public void accept(StreamQ201204 a) {
						a.showInfo();
					}
				});
				System.out.println();
				
				System.out.println("람다식으로 표현");
				stream = list.stream();
				
				System.out.println();
				stream.filter((t) -> t.getSalary() > 10000) //
				      .forEach((a) -> a.showInfo());
				System.out.println();
				
			} else if (select == 2) {
				// 2.선적부서(50번부서) 급여 합계(평균)
				System.out.print("조회할 부서번호 선택 >>> ");
				int selectDepartment = scn.nextInt();
				enterX = scn.nextLine();
				
				int sum = list.stream().filter(new Predicate<StreamQ201204>() {
					@Override
					public boolean test(StreamQ201204 t) {
						return //
//								(selectDepartment - 1) < t.getDepartmentId()
//								&& t.getDepartmentId() < (selectDepartment + 1)
								selectDepartment == t.getDepartmentId()
								;
					}
				}).mapToInt(new ToIntFunction<StreamQ201204>() {
					@Override
					public int applyAsInt(StreamQ201204 value) {
						return value.getSalary();
					}
				}).sum();
				
				System.out.println();
				System.out.println(selectDepartment + "번 부서에서 근무하는 사원의 급여 총합 : " + sum);
				System.out.println();
				
				System.out.println("람다식으로 표현");
				sum = list.stream().filter((t) -> selectDepartment == t.getDepartmentId()) //
								   .mapToInt((v) -> v.getSalary()) //
								   .sum(); 
				
				System.out.println();
				System.out.println(selectDepartment + "번 부서에서 근무하는 사원의 급여 총합 : " + sum);
				System.out.println();
				
			} else if (select == 3) {
				// 3.급여가 5000~10000인 사원번호 이름 메일 급여
				
				System.out.println();
				System.out.println("<급여가 5000~10000 사이인 사원목록>");
				
				stream = list.stream();
				stream.filter(new Predicate<StreamQ201204>() {
					@Override
					public boolean test(StreamQ201204 t) {
						return 5000 <= t.getSalary() && t.getSalary() <= 10000;
					}
				}).forEach(new Consumer<StreamQ201204>() {
					@Override
					public void accept(StreamQ201204 a) {
						a.showInfo();
					}
				});
				System.out.println();
				
				System.out.println();
				System.out.println("람다식으로 표현");
				
				stream = list.stream();
				stream.filter((t) -> 5000 <= t.getSalary() && t.getSalary() <= 10000) //
				      .forEach((a) -> a.showInfo());
				System.out.println();
				
			} else {
				System.out.println();
				System.out.println("<프로그램 종료>");
				break;
			}
		} //while
	}//main
}//class
