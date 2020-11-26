package condition;

public class ConditonExample4 {

	public static void main(String[] args) {
		int num1 = 11;
		
//		if(num1 % 5 == 0) {System.out.println("5의 배수입니다.");}
//		else if(num1 % 3 == 0){System.out.println("3과 배수입니다.");}
//		else if(num1 % 15== 0){System.out.println("3과 5의 배수입니다.");}
//		else {System.out.println("3과 5의 배수 둘 다 아닙니다.");}
		
//다른 방법
		if(num1 % 5 ==0 && num1 % 3 == 0) {System.out.println("3과 5의 배수입니다.");}
		else if(num1 % 5 == 0) {System.out.println("5의 배수입니다.");}
		else if(num1 % 3 == 0) {System.out.println("3의 배수입니다.");}
		else {System.out.println("3과 5의 배수 둘 다 아닙니다.");}
	}
}
