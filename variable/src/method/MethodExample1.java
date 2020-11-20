package method;

public class MethodExample1 {
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.drawRectangle();//이건 바로 출력하는거라 sysout안해도됨
		
		String result = r1.getRectangle();
		System.out.println("result에 받은 값 출력 : "+result);//이건 값만 받은거라 sysout해서 따로 출력해줘야함
		
		r1.drawShape("ㅇ");//이건 리턴없어서 여기서 매개값 적어줘야함
		
	}
}