package variable2;

public class Person {
	//필드
	private String name; //private : 외부에 노출하지 않는 설정임
	int age;
	double height;
	double weight;
	//main만들기 전에 선언해야함
	
	//메소드 println(이건 메인에 있는 메소드임)같은거 만들기
	public void showInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("키 : "+height);
		System.out.println("몸무게 : "+weight);
		System.out.println();
	}
	
	//필드에 값을 저장, 불러오기 기능 만들기
	public void setName(String name) {
		this.name = name;//바로 위에 선언한 name을 받아서 저 위에 class에 있는 name 바꾼다는 뜻
	}
	public void setAge(int age) {//위에꺼랑 타입 달라서 같이 못 씀
		if(age>0)//잘못된값 넣었을 경우 방지
			this.age=age;
		else 
			this.age=0;
	}
	public String getName() {//public만들어서 바로 String, int, double하면 private한 것도 재설정해서 사용가능
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public double getHeight() {
		return this.height;
	}
	
	//생성자 : 필드의 초기값 지정할때 씀(특징 :public 뒤에 반환타입이 없음)
	public Person(){
		this.name = "초기이름";
		this.age=0;
		this.height =0.0;
		this.weight =0.0;		
	}
	
	//생성자 만들고 적용할 메인에 값을 지정하고 싶을 때
	public Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	
	
	
	
}
