//문제
//숫자 num1,2,result
//문자 resultStr = "결과값은 "일 때
//num1,2중에서 큰 수에서 작은수를 뺀 값 출력하라.

package variable;

public class VariableExample {

	public static void main(String[] args) {
		int num1 = -10;
		int num2 = -20;
		int result = num2-num1;
		String resultStr = "결과값은 ";
		//방법1
		boolean trueOffFalse = result > 0;
		if (trueOffFalse) {
			System.out.println(resultStr+result);
		}else {
			System.out.println(resultStr+(-result));
			}
		
		//방법2 이렇게 하면 boolean 안써도 됨
		if (num2 > num1) {
			System.out.println(resultStr+result);
		}else {
			result = (num1 - num2);
			System.out.println(resultStr+result);
		}
	}
}


