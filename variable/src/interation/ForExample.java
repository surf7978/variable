package interation;
public class ForExample {
	public static void main(String[] args) {
		int sum =0;
		sum+=10;
		sum+=10;
		sum+=10;
		sum+=10;
		sum+=10;
		sum+=10;
		sum+=10;
		sum+=10;
		sum+=10;
		sum+=10;
		System.out.println(sum);
//반복구문
		for(int i=0; i<=10; i++) {sum += 10; System.out.println(i);}
		//i가 0으로 시작하고 1씩 증가하며 10까지하고 멈춤(총 11번 실행)
		System.out.println(sum);
		for(int i=0; i<=10;) {sum += 10; i++; System.out.println(i);}
		//i++ 다른데 넣어도 됨
		System.out.println(sum);
		for(int i=0; i<=10; i+=2) {sum += 10; System.out.println(i);}
		//2씩증가 가능
		System.out.println(sum);
		
	}
}
