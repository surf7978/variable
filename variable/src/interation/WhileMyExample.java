package interation;

public class WhileMyExample {

	public static void main(String[] args) {
		int i=2;
		while(i<10)
		{
			int num =1; //변수 while밖에 선언하면 밑에 while 작동안됨
			System.out.println("<"+i+"단>");
			while (num<10) 
			{
				System.out.println(i+" * "+num+" = "+(i*num));
				num++;
			}
			System.out.println("---------------");
			i++;
		}
		// 1부터10까지의 합
		int a=1;
		int b=0;
		while(a<=10) 
		{
			b += a;
			a++;//윗줄에 두면 a값 올린다음 b에 덧셈됨
		}
		System.out.println("1부터 10까지의 합 : "+b);
		//break추가
		int c=1;
		int d=0;
		while(true) 
		{
			d += c;
			c++;//윗줄에 두면 a값 올린다음 b에 덧셈됨
			if(c==11) 
			{
				break; // c==10으로 하면 10이 되는 순간 종료되서 11해야 됨
			}
		}
		System.out.println("1부터 10까지의 합 : "+d);
		System.out.println("----------------------");
		
		String g ="*";
		System.out.println(g);
		System.out.print(g); //ln 빼면 줄바꿈 안 해줌
		System.out.println(g);
		System.out.print(g);
		System.out.print(g);
		System.out.println(g);
		System.out.println("----------------------");
		
		//for구문으로 표현하기
		for(int h=1; h<4; h++) 
		{
			for(int j=1; j<=h; j++) 
			{
				System.out.print(g);
			}
			System.out.println("");
		}
		System.out.println("----------------------");
		//응용
		int A,B;
		int C=5;
		String D="#";
		String E="$";
		for(A=0; A<=C; A++) 
		{
			for(B=A; B<C; B++) 
			{
				System.out.print(D);
			}
			for(B=C-A; B<C; B++) 
			{
				System.out.print(E);
			}
			System.out.println("");
		}
	}
}