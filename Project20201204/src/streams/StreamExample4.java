package streams;

//교수님꺼
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StreamExample4 {

	public static void main(String[] args) {
		Connection conn = StreamQ201204.getConnection();
		List<StreamQ201204> list = new ArrayList<>();
		try {
			PreparedStatement psmt //
					= conn.prepareStatement("select * from emp1");
			ResultSet rs = psmt.executeQuery();
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

		System.out.println("emp1에 등록된 DB목록");
		list.stream().forEach(s -> s.showInfo());

		// 1. salary 10,000이상인 사원.
		System.out.println("salary가 10,000 이상인 사원.>>>");
		list.stream() //
				.filter(t -> t.getSalary() >= 10000) //
				.forEach(s -> s.showInfo());

		// 2. 50번부서 근무사원 salary 총합
		System.out.print("50번부서 근무사원 salary 총합>>>");
		int sum = list.stream() //
				.filter(t -> t.getDepartmentId() == 50) //
				.mapToInt(s -> s.getSalary()).sum();
		System.out.println(sum);

		System.out.print("50번부서 근무사원 salary 평균>>>");
		long count = list.stream() //
				.filter(t -> t.getDepartmentId() == 50) //
				.mapToInt(s -> s.getSalary()).count();
		System.out.println(sum / count);// cast (int)로 해주면 int로 출력가능

		// 평균 내는 다른 방식
		System.out.print("평균을 구하는 다른 방식 >>>");
		double avg = list.stream() //
				.filter(t -> t.getDepartmentId() == 50) //
				.mapToInt(s -> s.getSalary()).average().getAsDouble();
		System.out.println(avg);// cast (int)로 해주면 int로 출력가능

		// 3. 급여가 5000~10000인 사원번호 이름 메일 급여
		System.out.println("salary가 5,000~10,000인 사원.>>>");
		list.stream() //
				.filter(t -> t.getSalary() >= 5000 //
						&& t.getSalary() <= 10000) //
				.forEach(s -> s.showInfo());
		
		//40번 부서가 없어서 에러가 남, 에러 안나게 값 없으면 다른 문구 출력되게 만들기 StreamExample5에서 할거임
		avg = list.stream() //
				.filter(t -> t.getDepartmentId() == 40) //
				.mapToInt(s -> s.getSalary()).average().getAsDouble();
		System.out.println(avg);

	}

}
