//문제
// num1이 짝수면
// result에 0 , 홀수면 1
// if구문으로 쓰고 3항구문으로 쓰시오
package variable;

public class OperatorExample2 {

	public static void main(String[] args) {

		int num1 = 7;
		int result = 0;

		System.out.println("현재 num1 값 : " + num1);
		if (num1 % 2 == 0) {
			System.out.println("<if구문을 사용한 결과>");
			System.out.println("짝수");
			System.out.println("--------------------");
		} else {
			result = 1;
			System.out.println("<if구문을 사용한 결과>");
			System.out.println("홀수");
			System.out.println("--------------------");
		}

		System.out.println("현재 num1 값 : " + num1);
		result = (num1 % 2) == 0 ? 000 : 111;
		System.out.println("<3항구문을 사용한 결과>");
		System.out.println("int로 표현 : " + result);

		String result1 = result == 0 ? "짝수" : "홀수";
		System.out.println("String으로 표현 : " + result1);

		boolean result2;
		result2 = (num1 % 2) == 0 ? true : false;
		System.out.println("boolean으로 표현 : " + result2);
		System.out.println("--------------------");

	}
}
