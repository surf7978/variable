package variable;

public class MorningCode {

	public static void main(String[] args) {
		int intNumbers[] = {23, 56,34,65,28,21};
		//홀수 값의 합 sum에 저장하고 출력
//		int sum=0;
//		for(int i=0; i<6; i++) 
//		{
//			if(i%2==0) {sum += intNumbers[i];}
//		}
//		System.out.println(sum);
//		System.out.println("정답"+(23+34+28));
//		//홀수값의 합의 평균 출력
//		sum=0; 
//		int a=0;
//		for(int i=0; i<6; i++) 
//		{
//			if(i%2==0) 
//			{
//				sum += intNumbers[i];
//				a++;
//			}
//		}
//		System.out.println(((double)(sum)/(double)(a)));
//		System.out.println("정답"+((23+34+28)/3));
		//+추가 != 두 피연산자의 값이 다른지를 검사한다.
		//+추가 또 numbers.leghth안씀
		
		int sum = 0;
		for(int i=0; i<intNumbers.length; i++) 
		{
			if(intNumbers[i] % 2 == 1 ) {sum+=intNumbers[i];}
		}
		System.out.println(sum);
		System.out.println("정답"+(23+65+21));
		
		//홀수합 평균 구하기
		sum=0;
		int a=0;
		double avg;
		for(int i=0; i<intNumbers.length; i++) 
		{
			if(intNumbers[i] % 2 == 1 ) 
			{
				sum+=intNumbers[i];
				a++;
			}
		}
		System.out.println(((double)(sum)/a));
		System.out.println("정답"+((23+65+21)/3));		
		
		
	}	
}