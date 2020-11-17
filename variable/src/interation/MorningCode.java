package interation;

public class MorningCode 
{

	public static void main(String[] args) 
	{
		//문제1 for코드로 7배수는 sum7에 8배수는 sum8에 합하는 코드
		//문제2 while코드로 7배수는 sum7에 8배수는 sum8에 합하는 코드
		// 종료조건은 7과 8의 공통배수가 나오면 종료
		int a;
		int sum7=0;
		int sum8=0;
		for(a=0; a<56; a++) 
	    {
	    	if(a % 7 == 0) {sum7 += a;}
	    	else if(a % 8 == 0) {sum8 += a;}
	    }
	    System.out.println("for문으로 만듬");
		System.out.println("현재 a값 : "+a);
	    System.out.println("현재 sum7값 : "+sum7);
	    System.out.println("현재 sum8값 : "+sum8);
	    System.out.println("-------------");
	    
	    a=0;
	    sum7=0;
	    sum8=0;
	    while(a>=0) 
	    {
	    	if(a>55) {break;}
	    	else if(a % 7 == 0) {sum7 += a;}
	    	else if(a % 8 == 0) {sum8 += a;}
	    	a++;
	    }
	    System.out.println("while문으로 만듬");
		System.out.println("현재 a값 : "+a);
	    System.out.println("현재 sum7값 : "+sum7);
	    System.out.println("현재 sum8값 : "+sum8);
		System.out.println("-------------");
		
		System.out.println("a값 56 에서 종료해야됨");
	    System.out.println("sum7값 "+(7+14+21+28+35+42+49)+" 나와야 함");
	    System.out.println("sum8값 "+(8+16+24+32+40+48)+" 나와야 함");
	}
}