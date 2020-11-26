package variable2;

public class StudentExample {
//private걸린거에서 메소드 불러오기
	public static void main(String[] args) {
		Student s1 = new Student();
		
		//private 되서 출력못함
//		System.out.println(s1.name);
//		System.out.println(s1.No);
//		System.out.println(s1.E);
//		System.out.println(s1.M);
		
		s1.orgInfo();
		
		s1.setName("이나경");
		s1.setNo(121212);
		s1.setE(80);
		s1.setM(70);
		
		s1.studentInfo();
		
		System.out.println("영어점수 + 수학점수 : "+s1.totalScore());
//선택2  System.out.println("영어점수 + 수학점수 : "+s1.totalScore(10,20));
	}

}
