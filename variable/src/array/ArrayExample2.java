package array;

import java.security.ProtectionDomain;

public class ArrayExample2 
{

	public static void main(String[] args) 
	{
		double result = 0;
		double[] dAry;
		dAry = new double[] {23.2, 55.3, 52.8, 62.8};
		
		//택1
//		double sum =0;
//		for(int i=0; i<dAry.length; i++) 
//		{
//			sum += dAry[i];
//		}
//		System.out.println("결과값: "+sum);
		
		
		//택2
		result = doubleSum(dAry);
		System.out.println("결과값: "+result);

	}
	
	// double [] => 23.2, 55.3, 52.8, 62.8 : dAry로 선언하고
	// method: doubleSum(), 매개변수: double[]
	// 반환해주는 값: double
	
	public static double doubleSum(double[] a) 
	{
		double sum =0;
		for(double i : a) 
		{
			sum += i;
		}
		return sum;
	
// 더 좋은방법으로 풀기	
	
//	// double [] => 23.2, 55.3, 52.8, 62.8 : dAry로 선언하고
//	// method: doubleSum(), 매개변수: double[]
//	// 반환해주는 값: double
//	public static void main(String[] args) 
//	{
//		double result = 0;
//		double[] dAry =  {23.2, 55.3, 52.8, 62.8};
//		result = doubleSum(dAry);
//		System.out.println("결과값: "+result);
//	}
//	public static double doubleSum(double a[]) 
//	{
//		double result =0;
//		for(int i=0; i<a.length; i++)
//		{
//			result += a[i];
//		}
//		return result;
//	}
//	//이건 왜 안될지 생각해보기
//	
	}
}