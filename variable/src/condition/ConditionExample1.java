package condition;

public class ConditionExample1 {

	public static void main(String[] args) {
		int score = 90;
		String grade = "";
//틀린 예 : 이렇게 하면 맨 밑에껄로 먹는다.
		if (score >= 90) {grade = "A";} 
		if (score >= 80) {grade = "B";} 
		if (score >= 70) {grade = "C";} 
		if (score >= 60) {grade = "D";} 
		if (score < 60) grade = "F";
		
		System.out.println(score + "점은 " + grade + "등급 입니다.");
		
		
		
	}
}
