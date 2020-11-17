package variable;

public class ReferenceExample {

	public static void main(String[] args) {
		String str1 = "Hello";//String에는 주소값이 저장되있음
		String str2 = "Hello";
		String str3 = new String("Hello"); 
		
		if(str1 == str2){System.out.println("동일한 주소값");}
		else {System.out.println("다른 주소값");}
		//주소값 역시 같은 곳에 저장되있는 것을 알 수 있다.
		if(str1 == str3){System.out.println("동일한 주소값");}
		else {System.out.println("다른 주소값");}	
		//String엔 주소값이 저장되어있기 때문에 new하면 문자열 같아도 주소에 저장됨
		if(str1.equals(str2)){System.out.println("동일한 주소값");}
		else {System.out.println("다른 주소값");}
		//주소값을 비교하려면 .equals쓰면됨?
	
		
		
		
	
	
	}
}