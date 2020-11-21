package array;

public class MethodExample {
	public static void main(String[] args) {
		// 두 수를 더해서 2로 나누고 50을 더하고 다시 10으로 나눔
		int num1, num2, result;
		num1 = 34;
		num2 = 55;
		result = ((num1 + num2) / 2 + 50) / 10;
		System.out.println(result);

		int val1 = 34, val2 = 55;
		result = ((val1 + val2) / 2 + 50) / 10;
		System.out.println(result);

		int val3 = 13, val4 = 15;
		result = sumMethod(val3, val4);
		System.out.println(result);

		int val5 = 33, val6 = 35;
		result = sumMethod(val5, val6);
		System.out.println(result);
	}

	// 미리 수식을 넣어놓는 것 = public static () sumMethod () {}
	public static int sumMethod(int numb1, int numb2) {
		int result = numb1 + numb2;
		result = result / 2;
		result = result + 50;
		result = result / 10;
		return result;
		// return 반환해야함
	}
}