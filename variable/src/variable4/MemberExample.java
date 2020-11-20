package variable4;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setId(1);
		m1.setName("김");
		m1.setPh("010-1234-5678");
		m1.setCls(new String[] {"축구"});

		System.out.println(m1.getId());
		System.out.println(m1.getName());
		System.out.println(m1.getPh());
		System.out.println(m1.getCls());

		System.out.println(m1.toString());
	}
}
