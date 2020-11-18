package array;

public class MethodExample1 {

	public static void main(String[] args) {
		showInfo("김");
		showInfo("이");
		showInfo("45");
		// showInfo(45); int형으로 넣어줘야 출력가능
		System.out.println("-----------");
		
		showDouble(45);
		int result = showDouble(33);
		System.out.println(result);
		System.out.println(showDouble(33.3));
		System.out.println("-----------");
		
		double rlt = divide(13,30);
		System.out.println(rlt);
		rlt = divide(30,13);
		System.out.println(rlt);
		System.out.println("-----------");
	}

	public static void showInfo(String name) {
		System.out.println("안녕하세요. " + name + "입니다.");
	}

	// 이름 같을 경우 정수값이면 int쪽으로 double값이면 double쪽 수식 사용함
	public static int showDouble(int num) {
		return num * 2;
	}

	public static double showDouble(double num) {
		return num * 2;
	}

	// 정수형 변수 3개를 받아서 세 수의 곱을 반환해주는 메소드(multi)
	public static int multi(int a, int b, int c) {
		int result = 0;
		result = a * b * c;
		return result;
	}

	// double 2개를 받아서 큰수/작은수 되는 (divide)만들기
	public static double divide(double d, double e) {
		double rlt = 0;
		if(d>e) {rlt = d/e;}
		else {rlt = e/d;}
		return rlt;
	}
}
