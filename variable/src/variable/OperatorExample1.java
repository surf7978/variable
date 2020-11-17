package variable;

public class OperatorExample1 {

	public static void main(String[] args) {
		String str = "Hello";
		str += " World";// +=로 중첩해도됨
		System.out.println(str);
		System.out.println("-----------");

		int num1 = 10;
		System.out.println(num1);
		num1 += 5;
		System.out.println(num1);
		num1 -= 3;// * / - + 로 사칙연산가능 심지어 %(나머지)도 가능
		System.out.println(num1);
		num1 *= 3;
		System.out.println(num1);
		num1 /= 3;
		System.out.println(num1);
		System.out.println("-----------");

		int num2 = 10;
		num2++; // ++은 1을 증가시키라는 뜻
		System.out.println(num2);
		num2--; // --은 1을 증가시키라는 뜻 ** //는 없음
		System.out.println(num2);
		System.out.println("-----------");

		int num3 = 10;
		if (num3 > 0) {
			System.out.println("num3은 0보다 큽니다.");
			System.out.println("-----------");
		} else if (num3 < 0) {
			System.out.println("num3은 0보다 작습니다.");
			System.out.println("-----------");
		} else {
			System.out.println("num3은 0입니다.");
			System.out.println("-----------");
		}
		num3 -= 10;
		if (num3 > 0) {
			System.out.println("num3은 0보다 큽니다.");
			System.out.println("-----------");
		} else if (num3 < 0) {
			System.out.println("num3은 0보다 작습니다.");
			System.out.println("-----------");
		} else {
			System.out.println("num3은 0입니다.");
			System.out.println("-----------");
		}
		num3 -= 10;
		if (num3 > 0) {
			System.out.println("num3은 0보다 큽니다.");
			System.out.println("-----------");
		} else if (num3 < 0) {
			System.out.println("num3은 0보다 작습니다.");
			System.out.println("-----------");
		} else {
			System.out.println("num3은 0입니다.");
			System.out.println("-----------");
		}

		int num4 = 30;
		if (num4 % 2 == 0) {// ==는 비교연산자
			System.out.println("num4는 짝수입니다.");
			System.out.println("-----------");
		} else {
			System.out.println("num4는 홀수입니다.");
			System.out.println("-----------");
		}
		num4 /= 2;
		if (num4 % 2 == 0) {
			System.out.println("num4는 짝수입니다.");
			System.out.println("-----------");
		} else {
			System.out.println("num4는 홀수입니다.");
			System.out.println("-----------");
		}

		// if else 구문 짧게 쓰는 법 = 3항 연산자 사용하면 됨
		boolean result = true;
		result = (num4 % 2) == 0 ? true : false;
		System.out.println(result);
		System.out.println("-----------");
		
		int result1 = (num4 % 2) == 0 ? 789 : 456;
		System.out.println(result1);
		System.out.println("-----------");
		
		String result2 = (num4 % 2) == 0 ? "참" : "거짓";
		System.out.println(result2);
		System.out.println("-----------");
	}

}
