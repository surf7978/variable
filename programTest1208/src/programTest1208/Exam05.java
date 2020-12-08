package programTest1208;

import java.util.List;

public class Exam05 {
	
	public static void main(String[] args) {
		List<Employee> list = Employee.getDBList();
		
		System.out.println("<Employee에 저장된 DB>");
		list.stream().forEach(s->s.showInfo());
		System.out.println();
		int sum = list.stream() //
				.mapToInt(s -> s.getSalary()).sum();
		long count = list.stream() //
				.mapToInt(s -> s.getSalary()).count();
		System.out.println("Employee에 있는 사원 평균급여 : "+ sum / count);
		System.out.println();
		System.out.print("sum/count 하지않고 바로 평균을 구하는 다른 방식 : ");
		double avg = list.stream() //
				.mapToInt(s -> s.getSalary()) //
				.average().getAsDouble();
		System.out.println((int)avg);
	}

}
