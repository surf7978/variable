package com.yedam.string;

public class StringExample {

	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7); // 7번째 문자로 구분
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
		System.out.println("ㅡㅡ");

		String strVar1 = new String("신민철");
		String strVar2 = "신민철";

		if (strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		if (strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
		System.out.println("ㅡㅡ");

		String str = "안녕하세요";

		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1.length);
		String str1 = new String(bytes1);
		System.out.println(str1);
		System.out.println("ㅡㅡ");

		String subject = "자바 프로그래밍";
		// 0자1바2 3프 위치라서 3나옴
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		System.out.println("ㅡㅡ");

		ssn = "7306241230123";
		int length = ssn.length();
		System.out.println(length);
		System.out.println("ㅡㅡ");

		String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
		System.out.println("ㅡㅡ");

		ssn = "880815-1234567";
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);

		String secondNum = ssn.substring(7);// ~까지 안정해주면 끝가지 다 출력함
		System.out.println(secondNum);
		System.out.println("ㅡㅡ");

		str1 = "Java Programming";
		String str2 = "JAVA Programming";

		System.out.println(str1.equals(str2));

		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));

		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println("ㅡㅡ");

		String tel1 = " 02";
		String tel2 = "123    ";
		String tel3 = "     1234     ";

		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println("' 02+123    +     1234     '을 .trim()으로 공백을 없애면");
		System.out.println(tel + " << 이렇게 된다");
		System.out.println("ㅡㅡ");

		str1 = String.valueOf(10);
		str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println("ㅡㅡ");

		String birth1 = "991123-1234567";
		String birth2 = "991112-2345678";
		String birth3 = "010101*3123456";
		String birth4 = "0202024211234";

		
		getGenderInfo(birth1);
		getGenderInfo(birth2);
		getGenderInfo(birth3);
		getGenderInfo(birth4);

	}

	public static void getGenderInfo(String birth) {
		char sex;
		int length = birth.length();
		if (length == 14) {
			birth.substring(0, 1);
			sex = birth.charAt(7);
			switch (sex) {
			case '1':
			case '3':
				System.out.println("남자");
				break;
			case '2':
			case '4':
				System.out.println("여자");
				break;
			}
		} else if (length == 13) {
			sex = birth.charAt(6);
			switch (sex) {
			case '1':
			case '3':
				System.out.println("남자");
				break;
			case '2':
			case '4':
				System.out.println("여자");
				break;
			}
		}
	}
	
}