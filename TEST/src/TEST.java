public class TEST 
{
	public static void main(String[] args) 
	{
		double a = Math.random()*6;
		System.out.println((int)a);
		
		String[][] c = new String[1][1];
		String d ="가";
		int e =1;
		c[0][0] = d+e;
		System.out.println(c[0][0]);

	}
}