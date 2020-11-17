package helloWorld;

public class HelloWorld {
	public static void main(String[] args) {
		String name = "Hong kildong";// String은 문자열(대문자로 시작안하면 안 먹음)
		name = "홍길동";
		System.out.println("My name is " + name);// 이것도 대문자S로 해야됨(대문자 시작하는것=클래스)
		int age = 20;// int는 숫자임 거기에 정수임,소수안됨(소문자 i임, 대부분 명령어는 소문자)
		System.out.println("My name is " + name + " " + age);// 띄어쓰기 " "
		double height = 170.5;// double은 소수도 가능쓰
		System.out.println("내 키는 " + height + " 입니다.");// 응용1
		System.out.println(name + " 키는 " + height + " 입니다.");// 응용2
		name = "윤태현";// 변수 바꿀 수 있음
		System.out.println("내 이름은 " + name + "입니다.");
		String name1 = "김찬영";// 동일한 이름으로 변수 못 줌
		int age1 = 22;
		double height1 = 175.53;
		System.out.println(name1 + "의 키는 " + height1 + "이고 나이는 " + age1 + "입니다.");// 응용3
		int age2 = age + age1;
		System.out.println("두 사람 나이의 합은 " + age2 + "입니다.");// 응용4
		System.out.println("두 사람 나이의 합은 " + (age + age1) + "입니다.");// 이게 더 효율적임
		System.out.println("두 사람 키의 합은 " + (height + height1) + "입니다.");// 소수 덧셈도 가능
	}
}