package condition;

public class ConditionExample2 {
//switch구문 사용 if랑 다른점 : break쓰면 조건 만족하는 순간 바로 빠져나옴.
//if는 조건 충족안되도 일단 알고리즘 다 돌림
//+추가 case에 뭐 안넣어도됨 바로 다음 알고리즘으로 진행
	public static void main(String[] args) {
		int score = 61;
		int Oscore = score;
		score /=10;
		String grade = "";
		
		switch(score) {
		case 9: 
		case 8: grade = "양호"; break;
		case 7: 
		case 6: grade = "보통"; break;
		default: grade = "미흡";
		}

		System.out.println(Oscore + "점은 ");
		System.out.println((score*10) + "점대이므로 ");
		System.out.println(grade);
	}
}
