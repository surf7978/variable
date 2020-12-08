package programTest1208;

import java.util.List;
import java.util.OptionalDouble;

public class Exam06 {
	public static void main(String[] args) {

		List<Employee> list = Employee.getDBList();

		System.out.println("<Employee에 저장된 IT_PROG 직무를 가진 사원목록>");
		list.stream().filter(t -> t.getJobId().equals("IT_PROG")).forEach(s -> s.showInfo());
		System.out.println();
		OptionalDouble avg = list.stream() //
				.filter(t -> t.getJobId().equals("IT_PROG")) //
				.mapToInt(s -> s.getSalary()) //
				.average();
		
		System.out.println("IT_PROG 직무를 가진 사원 평균급여 : "+avg.orElse(0.0));
	}
}
