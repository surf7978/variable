package streams;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.DoubleConsumer;

public class StreamExample5 {

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
		
		//40번 부서가 없어서 에러가 남, 에러 안나게 값 없으면 다른 문구 출력되게 만들기 StreamExample5에서 할거임
		OptionalDouble avg = list.stream() // .average는 OptionalDouble 타입이다.
				.filter(t -> t.getDepartmentId() == 50) //
				.mapToInt(s -> s.getSalary()) //
				.average();// .average는 OptionalDouble 타입이다.
		
		System.out.println(avg.orElse(0.0)); //값이 없으면 0.0으로 출력
		
		avg.ifPresent(new DoubleConsumer() { //ifPresent = 값이 있으면 이걸로 출력
			@Override
			public void accept(double value) {
				System.out.println("급여평균 : "+avg.getAsDouble()); //getAsDouble 안 붙여주면 optional
			}
		});;

	}

}
