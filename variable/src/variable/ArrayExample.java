package variable;

public class ArrayExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int[] numbers = {10, 20, 30, 40, 50}; //배열변수(여러가지 정수 담을 수 있음) int[] a = {};
		numbers[0]=200; //첫번째 값 불러오는 방법 순서 0,1,2,3,4,5....임
		System.out.println(numbers[0]);
		System.out.println("-------------");
		int sum =0;
		for(int i=0; i<5; i++) 
		{
			System.out.println(numbers[i]);
			sum +=numbers[i];
		}
		System.out.println("합계 : "+sum);
		System.out.println("-------------");
		
		String[] strings = {"Hello", "world", "Nice", "To", "Meet"};
		//문자열도 가능쓰
		strings[2] ="good";
		for(int i=0; i<strings.length; i++)//strings.length는 6이 될꺼다. 배열함수에 6개 넣어서
		{System.out.print(strings[i]+" ");}
		System.out.println("-------------");
		
		strings[2] ="NICE";
		strings[5] ="you";//이것 때문에 에러뜸 배열은 한번 정해지면 크기를 못 바꿈
		for(int i=0; i<strings.length; i++)//strings.length는 6이 될꺼다. 배열함수에 6개 넣어서
		{System.out.print(strings[i]+" ");}
	}
}