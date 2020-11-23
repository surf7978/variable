package com.yedam.adress;

public class UnivFriend extends Friend {
//학교 전공
	private String univ;
	private String major;

	public UnivFriend(String name, String phone) {
		super(name, phone);
	}

	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public void showFriendInfo() {
//		super.showFriendInfo();
		System.out.println("이름: " + super.getName() + 
				   ", 연락처: " + super.getPhone()+
				   ", 학교: "+this.univ+
				   ", 전공: "+this.major);
	}

	
}
