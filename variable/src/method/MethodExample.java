package method;

public class MethodExample {
	public static void main(String[] args) {

		Math m1 = new Math();
		int a = m1.sum(10, 20);
		System.out.println("메소드 int sum()결과 : " + a);
		double sum = m1.sum(10.5, 20);
		System.out.println("메소드 double sum()결과 : " + sum);
		//메소드 int sum(), double sum() 어디로 들어갈지는 선언한 형식보고 알아서 구분해서 적용됨
		
		double area = m1.getArea(5.5); // pi * r * r ;
		System.out.println("메소드 double getArea()결과 : "+area);
		
		area = m1.getRectangle(4.2);
		System.out.println("메소드 double getRectangle()결과 : "+area);
		
		area = m1.getRectangle(4.2, 2.4);
		System.out.println("메소드 double getRectangle()결과 : "+area);
		//메소드 double getRectangle() 어디로 들어갈지는 선언한 형식보고 알아서 구분해서 적용됨
	
		int ary = m1.getArySum(new int[] {5, 10, 15, 20});
		System.out.println("메소드 int getArySum()결과 : "+ary);
		
		int[] ary1 =new int[] {m1.getArySum(new int[] {5, 10, 15, 20})};
		System.out.println("ary1[0] 결과 : "+ary1[0]);
		//이런것도 가능
		
		//몸무게 구하기
		Person p1 = new Person("김",10,135.5,32.5);
		double d1 = m1.getProperWeight(p1);
		if(p1.weight>d1) {System.out.println("체중과다");}
		else if(p1.weight==d1) {System.out.println("적정체중");}
		else {System.out.println("체중미달");}
		System.out.println("몸무게 결과 : "+d1);
		//차이점 매개변수 가져온곳이 위에는 여기서 선언한 p1 안의 Math식, 밑에는 person클래스의 몸무게
		d1 = m1.getProperWeight(p1.height);
		if(p1.weight>d1) {System.out.println("체중과다");}
		else if(p1.weight==d1) {System.out.println("적정체중");}
		else {System.out.println("체중미달");}
		System.out.println("몸무게 결과 : "+d1);
		
		
	}
}