package variable;

public class OperatorExample {
//String, int는 중첩가능
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str);
		str = str + " world";
		System.out.println(str);
		str = str + "!!!";
		System.out.println(str);
		System.out.println("---------");

		int num1 = 10;
		System.out.println(num1);
		num1 = num1 +5;
		System.out.println(num1);
		num1 = num1 +15;
		System.out.println(num1);
		System.out.println("---------");
		
		double num2 = 3.4;
		System.out.println(num2);
		num2 = num2 * 10;
		System.out.println(num2);
		num2 = num2 * 100;
		System.out.println(num2);
		System.out.println("---------");
		
		boolean tf = true;
		tf = !tf;
		System.out.println(tf);
		tf = !tf;
		System.out.println(tf);
		System.out.println("---------");
	}
}