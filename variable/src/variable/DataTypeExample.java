package variable;

public class DataTypeExample {

	public static void main(String[] args) {
		byte num1 = 12; //1byte는 -128~127까지만 가능(0도 포함됨)
		short num2 = 128;
		int num3 = 100000000;
		long num4 = 100000000000L; //소문자 l 써도 되는데 1이랑 헷갈려서 L씀
		
		byte val1 = 10;
		num3 = val1;//byte를 자동으로 int로 형변환 해줌 = promotion이라고 함
		
		byte result =(byte)(num1+val1); //합쳐서 127안되는데 에러남
		//사칙연산은 int형으로 바꿔서 계산하기 때문(그래서 형변환 해줘야함)
		//이런 것을 casting이라고 함
		
		num1 = 120;
		num1++;//증가 연산자 썼을 꼉우 byte타입 그대로 연산됨(int로 안바꾸고 연산)
		num1++;
		num1++;
		num1++;
		num1++;
		num1++;
		num1++;
		num1++;
		num1++;
		num1++;
		System.out.println(num1);//-128~127사이 값으로 루프됨 127에서+1하면 -128됨
		System.out.println("-------------------");
		
		num1 = 120;
		for(int i=0; i<20; i++) {System.out.println(num1++);}
		System.out.println("-------------------");
		
		char char1 = 65;//숫자를 담을 수 있는 문자
		System.out.println(char1);
		char1 = 'A';//""안쓰고 ''쓴다. +추가 숫자값을 문자로 출력해줌
		System.out.println(char1);
	
		char1 = 97; //= 'a'
		for(int i=0; i<26; i++) {System.out.println(char1++);}
		System.out.println("-------------------");
		
		float floatVal = 4.567F;
		double doubleVal = 3.4567;
		//실수형일때는 double이 기준형 (정수형은 int)
		
		
		
		
		
		
	}
}