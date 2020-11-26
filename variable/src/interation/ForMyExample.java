package interation;

public class ForMyExample 
{
	public static void main(String[] args) 
	{
		String asd = "Hello World";
		int sum=0;
		int i=0;
		
		for(int qwe=10; qwe>5; qwe--) 
		{
			System.out.println(asd);
		}
		
		for(i=0; i<=10; i++) 
		{
			if(i%2==0) {sum += i;}
			else {sum=sum;}
		}
		
		System.out.println("i값 : "+i);
		//for구문에 int 변수 선언하면 밖으로 못빼냄
		System.out.println("sum값 : "+sum);
		
	}
}
