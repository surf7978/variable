package method;

public class Math {
	private double pi = 3.14;

	public int sum(int a, int b) {
		return a + b;
	}

	public double sum(double a, double b) {
		return a + b;
	}

	public double getArea(double r) {
		return pi * r * r;
	}
	
	public double getRectangle(double l) {
		return l * l;
	}

	public double getRectangle(double l, double a) {
		return l * a;
	}
	
	//int 배열의 합을 구하는 메소드
	public int getArySum(int[] ary) 
	{
		int sum = 0;
		for(int num : ary) 
		{
			sum+=num;
		}
		return sum;
	}
	
	// 사람의 적정 몸무게 구하는 메소드. (Person 클래스로 만들기)
	public double getProperWeight(Person p1) {
		//몸무게 공식 (키-100)*0.9
		double properWeight =(p1.height-100)*0.9;
		return properWeight;
	}
	public double getProperWeight(double height) {
		double properWeight =(height-100)*0.9;
		return properWeight;
	}
	
	
	
}
