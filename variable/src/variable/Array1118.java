package variable;

public class Array1118 {

	public static void main(String[] args) {
		int[] intAry = new int[5];
		// intAry에 5개짜리를 선언
		intAry[0] = 15;
		intAry[4] = 33;
		for (int i = 0; i < 5; i++) {System.out.println(intAry[i]);}
		// String 타입일 경우 값 없으면 null 값들어감
		System.out.println("------------");

		double[] doubleAry;
		doubleAry = new double[] { 2.3, 2, 4.5, 2.2, 1.6 };
		System.out.println(doubleAry[0]);
		System.out.println(doubleAry[1]);
		//알아서 promotion해줌 2.0으로
		double sum=0;
		for(int i=0; i<doubleAry.length; i++) 
		{
			sum+=doubleAry[i];
		}
		System.out.println("sum : "+sum);
		System.out.println("------------");
		
		//+추가 enhanced for = 확장 for라고 편하게 쓰는방법 있음
		sum=0;
		for(double dbl:doubleAry) 
		{
			System.out.println(dbl);
			sum+=dbl;
		}
		System.out.println("sum : "+sum);
		System.out.println("------------");
		
		//걍 테스트
		double a=0;
		a++;
		System.out.println(a);
		a++;
		System.out.println(a);
		//double의 ++도 똑같이 1올라감
	}
}