package variable2;
//문제 : 인스턴스 클래스 만들기
//학생이름 :
//학번 :
//영어점수 :
//수학점수 :
public class Student {
	//필드 private걸어서 다른 방법으로 불러오게 하기
	private String name ="윤태현";
	private int No=797979;
	private double E=11;
	private double M=22;
	
	public void orgInfo() {
		System.out.println(name);
		System.out.println(No);
		System.out.println(E);
		System.out.println(M);
	}
	
	public void setName(String a) {
		this.name = a;
	}
	public void setNo(int b) {
		this.No = b;
	}
	public void setE(double c) {
		this.E = c;
	}
	public void setM(double d) {
		this.M = d;
	}
	public void studentInfo() {
		System.out.println("이름 : "+name+", 학번 : "+No);		
	}
	public double totalScore() {
		return this.E+this.M;
	}
//선택2
//	public double totalScore(double E, double M) {
//		return E+M;//this 빼야함 안그러면 totalScore(x,y)선언할때 x,y값이 아니라 위에 선언한 값이 들어감.
//	}
	
}
