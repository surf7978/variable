package com.yedam;

public class Student {
//학교 학번 이름 전공
	private String college;
	private String studentNo;
	private String studentName;
	private String className;
		
	public Student() {
		
	}

	public Student(String college, String studentNo) {
		this.college = college;
		this.studentNo = studentNo;
	}
	
	public Student(String college, String studentNo, String studentName, String className) {
		super();
		this.college = college;
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.className = className;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	public void showStudentInfo() {
		System.out.println(college+" "+studentNo+" "+studentName);
	}
	
	

}
