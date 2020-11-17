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
	    System.out.println(sum7);
	    System.out.println(7+14+21+28+35+42+49);
	    System.out.println(sum8);
	    System.out.println(8+16+24+32+40+48);
	    System.out.println("-------------");
	    
	    a=0;
	    sum7=0;
	    sum8=0;
	    
	    while(true) 
	    {
	    	a++;
	    	if(a % 7 == 0) {sum7 += a;}
	    	else if(a % 8 == 0) {sum8 += a;}
	    	else if(a==56) 
	    	{
	    		break;
	    	}
	    }
	    System.out.println(sum7);
	    System.out.println(sum8);	    
	}
}