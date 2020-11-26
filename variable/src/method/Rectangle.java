package method;

public class Rectangle {
	
	public void drawRectangle() {//void는 리턴값 없다는뜻?
		System.out.println("ㅁ");
	}
	public String getRectangle() {
		return "ㅁ";
	}
	
	public void drawShape(String shape) {//위에랑 같은 void지만 저쪽에서 입력하게 변수타입만 선정해줌
		System.out.println(shape);
	}
}
