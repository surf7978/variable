package helloWorld;

public class Variable {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		int sum = 40;
		System.out.println("sum : " + sum);

		sum = num1 + num2;
		System.out.println("sum : " + sum);// 순서에 따라 덮어쓰기 가능
		sum = num1 * num2;
		System.out.println("sum : " + sum);// 당연히 사칙연산 가능
		sum = num1 / num2;
		System.out.println("sum : " + sum);// 0.5인데 0나옴 int타입이라 계산못함
		sum = num1 % num2;
		System.out.println("sum : " + sum);// 나머지 표시하는 기호

		boolean trueOffFalse = sum <= -10; // T,F 값으로만 나옴 음수가능
		System.out.println(trueOffFalse);
		if (trueOffFalse) {
			System.out.println("결과 참입니다.");
		} else {
			System.out.println("결과 거짓입니다.");
		}
//문제 : sum과 diff를 비교해서 sum이 크면 참, 아니면 거짓으로 출력
		int num3 = 5;
		int num4 = 10;
		int sum1 = num3 + num4;
		int diff = num4 - num3;
		if (sum1 > diff) {
			System.out.println("sum1이 더 크니까 참");
		} else {
			System.out.println("diff가 더 크니까 거짓");
		}
		System.out.println(10 + 20 + " sum1 " + sum1 + 10);// 숫자,변수는 계산 문자는 출력, 단 변수+숫자는 계산안됨
	}
}
