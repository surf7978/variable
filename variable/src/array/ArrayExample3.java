package array;

public class ArrayExample3 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20, num3 = 30;
		int temp;

		if (num1 > num2) 
		{
			if(num1>num3) {temp = num1;}
			else {temp = num3;}
		}
		else 
		{
			if(num2>num3) {temp = num2;}
			else {temp = num3;}
		}
		System.out.println("큰수는 : " + temp);
		
		// else if로 끝날경우 다른경우의 수 있다. (else생략됨)
		// 해결방법은 temp에 초기값을 넣어주면 된다. 물론 답은 틀림
		// 뭔말이냐고 값이 같을 때 경우의 수도 넣어줘야함
		
		num1 = 20;
		num2 = 20;
		num3 = 20;
		temp=0;

		if (num1 > num2) 
		{
			if(num1>num3) {temp = num1;}
			else if(num3>num1) {temp = num3;}
			else {temp=num1;}
		}
		else 
		{
			if(num2>num3) {temp = num2;}
			else if(num3>num2) {temp = num3;}
			else {temp=num2;}
		}
		System.out.println("큰수는 : " + temp);
		
		temp=0;
		int[] intAry = {34, 25, 57, 39, 55};
		for(int num : intAry) 
		{
			if(temp < num) {temp=num;}
			
		}
		System.out.println("큰수는 : "+temp);
	}

}
