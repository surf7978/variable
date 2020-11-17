public class TEST 
{
	public static void main(String[] args) 
	{
		int a,b;
		int c=5; //줄당 몇글자 나올지 결정
		for(a=0; a<c; a++) //몇 줄 나올지 결정
		{
		 for(b=a; b<c; b++) {System.out.print("$");}
		 //a가 $출력수에 영향줌
		 for(b=c-a; b<c; b++) {System.out.print("#");}
		 //c-a가 #출력수에 영향줌		
		 System.out.println(""); 
		 //줄바꿈용
		}
	}
}