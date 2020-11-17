package interation;

public class ForMultitable 
{
	public static void main(String[] args) 
	{
		System.out.println("2 * 1 = 2");
		System.out.println("2 * 2 = 4");
		System.out.println("2 * 3 = 6");
		System.out.println("2 * 4 = 8");
		System.out.println("2 * 5 = 10");
		System.out.println("****************");
		//이걸 for 구문으로 표현
		
		int num=2;
		for(int i=1; i<=5; i++) 
		{ 
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		System.out.println("******************");
		for(num=3; num<=9; num++) 
		{
			System.out.println("<"+num+"단>");
			for(int i=1; i<=5; i++) 
			{ 
				System.out.println(num+" * "+i+" = "+(num*i));
			}
			System.out.println("-------------------");
		}
		System.out.println("******************");
		
	}
}
