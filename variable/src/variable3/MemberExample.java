package variable3;

public class MemberExample {
	public static void main(String[] args) {
		//필드 선언하기 회원번호 회원이름 회원전화번호 강좌명
		//변수 이름설정 소문자+두단어(대문자)
		Member m1 = new Member();
		m1.id = 1;
		m1.name = "홍길동";
		m1.showMemberInfo();
		
		Member m2 = new Member();
		m2.id = 2;
		m2.name = "김찬영";
		m2.num = "010-1234-5678";
		
		Member[] members ={m1, m2};
		for(Member mem : members) 
		{
			mem.showMemberInfo();
		}
	}
}
