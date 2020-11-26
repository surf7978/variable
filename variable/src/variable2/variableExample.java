package variable2;

public class variableExample {

	public static void main(String[] args) {
		int num = 10;
		String str = "Hello";
		double dbl = 3.4;
		
		String name = "Hong";
		int age = 10;
		double height = 178.8;
		
		String name1 = "Hwang";
		int age1 = 15;
		double height1 = 188.8;
		//한꺼번에 담을 수 있는 클래스 하나 만듬(Person 클래스 보셈)
		
		Person p1 = new Person();//해당 클래스의 구조를 본 뜬 인스턴스(instance)를 만듬
//		p1.name = "Hong";
//		p1.age = 10;
//		p1.height = 178.8;
		p1.showInfo();
		System.out.println("--------------");
		
		Person p2 = new Person();
//		p2.name = "Hwang";
		p2.age = 15;
		p2.height = 188.8;
		
		
		Person p3 = new Person();
//		p3.name = "Park";
		p3.age = 17;
		p3.height = 166.8;
		p3.weight = 56.5;
		
//		System.out.println(p1.name);
		System.out.println(p2.age);
		System.out.println(p3.height);
		System.out.println(p1.weight); //null값 들어가있음
		System.out.println("--------------");
		
		//배열에도 담을 수 있음
		Person[] persons = {p1, p2, p3};
		for(Person per : persons) //p3까지 있으니까 3번해준다 per은 Person클래스의 구조를 가진 변수선언임
		{
//			System.out.println(per.name);
			System.out.println(per.age);
			System.out.println(per.height);
			System.out.println();
			per.showInfo();
		}
		System.out.println("--------------");
		
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
		System.out.println("--------------");
			
//		p1.setName("홍"); 생성자 연습한다고 주석처리 함
		p1.showInfo();
		
		p1.setAge(119);
		p1.showInfo();
		System.out.println("--------------");
		
		//name을 private으로 설정해서 전부 에러뜸 >>>  주석처리하고 다음 수업진행
		System.out.println("p1의 이름 : "+p1.getName()); //생성자연습때문에 위에 주석처리함
		System.out.println("p1의 나이 : "+p1.getAge());
		System.out.println("p1의 키 : "+p1.getHeight());
		System.out.println("--------------");
		
		//생성자 만들고 난뒤 출력
		System.out.println("p1의 이름 : "+p1.getName());
		System.out.println("--------------");
		
		//생성자 만들고 적용할 메인에 값을 지정하고 싶을 때
		//Person p1 = new Person("Choi", 20, 175.5, 72.4); 이렇게 해주면 됨
		//위에 Person p1 = new Person()랑 곂쳐서 주석처리함
		

	}

}
