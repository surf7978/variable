package variable4;

import java.util.Arrays;

public class Member {
	private int id;
	private String name;
	private String ph;
	private String[] cls;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public String[] getCls() {
		return cls;
	}
	public void setCls(String[] cls) {
		this.cls = cls;
	}
	@Override
	public String toString() {
		
		return "Member [회원번호=" + id + ", 회원이름=" + name + ", 연락처=" + ph + ", 강좌=" + Arrays.toString(cls) + "]";
	}
	
	
}
