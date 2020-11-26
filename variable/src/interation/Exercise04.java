package interation;

public class Exercise04 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*6);
		int b = (int)(Math.random()*6);
		int c,d;

		for(c=1; c>0; c++)
		{
			System.out.println("<"+c+"번째 굴림>");
			System.out.println("주사위 a는 "+a+"이다.");
			System.out.println("주사위 b는 "+b+"이다.");
			System.out.println("두 주사위의 합은 "+(a+b)+"이다.");
			System.out.println("----------------");
			d=a+b;
			if(d==5) 
			{
				System.out.println("합이 5이므로 멈춥니다.");
				break;
			}
			else 
			{
				a = (int)(Math.random()*6);
				b = (int)(Math.random()*6);
			}
		}
	}
}
