package condition;

public class ConditionExample {

	public static void main(String[] args) {
		int score = 95;
		String grade = "";

		if (score >= 90) {grade = "A";} 
		else if (score >= 80) {grade = "B";} 
		else if (score >= 70) {grade = "C";} 
		else if (score >= 60) {grade = "D";} 
		else grade = "F";
		
		System.out.println(score + "점은 " + grade + "등급 입니다.");

// if 안에 if 넣기
		if (score >= 90) 
		{ 
		 if(score >= 95) {grade = "A+";}
		 else {grade="A";}
		} 
		else if (score >= 80) 
		{
		 if(score>=85) {grade = "B+";}
		 else {grade = "B";}
		}
		else if (score >= 70) 
		{
		 if(score>=75) {grade = "C+";}
		 else {grade = "C";}
		} 
		else if (score >= 60) 
		{
		 if(score>=65) {grade = "D+";}
		 else {grade = "D";}
		} 
		else grade = "F";
		System.out.println("더 자세하게 분류하면");
		System.out.println(score + "점은 " + grade + "등급 입니다.");
		
	}
}
