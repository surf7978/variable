package interation;
//While 구문
public class WhileExample {
	public static void main(String[] args) {
		int i=0;
		//for와 다른 점 while구문안에는 수식만 온다. 변수는 밖에서 선언해야함.
		while(i<10) 
		{
			System.out.println("2 * "+i+" = "+(2*i));
			i++; //이것도 밖에서 설정해야함
		}
		
	}
}