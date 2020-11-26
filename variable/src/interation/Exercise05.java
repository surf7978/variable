package interation;

public class Exercise05 {

	public static void main(String[] args) {
		int x,y;
		
		for(x=0; x<=10; x++) 
		{
			for(y=1; y<=10; y++)
			{
				if((4*x)+(5*y)==60) 
				{
					System.out.println("x값 : "+x);
					System.out.println("y값 : "+y);
					System.out.println("---------");
				}
			}
		}
	}
}
