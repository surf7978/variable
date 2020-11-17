//숙제 
package variable;
public class ArrayExample1 {
	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,50,60,70,80,90,100};
		//합을 구하는데 위치상으로 1,3,5,7,9에 있는 수의 합만 구하는 것 만들기
		
		int sum=0;
		for(int i=0; i<11; i++) 
		{
			if(i%2==0) {}
			else {sum+= numbers[(i-1)];}
		}
		System.out.println(sum);
		System.out.println((10+30+50+70+90)+"과 같아야함");
		System.out.println("-------------");
//numbers.length 사용할 것 
		sum=0;
		for(int i=0; i<numbers.length; i++) 
		{
			if(i%2==0) {sum+= numbers[i];}
		}
		System.out.println(sum);
		System.out.println((10+30+50+70+90)+"과 같아야함");
		System.out.println("-------------");
	}
}