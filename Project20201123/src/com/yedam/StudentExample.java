package com.yedam;

public class StudentExample {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		Student s2 = new Student("A대학교","15-1234");
		
		Student s3 = new Student("예담","20-5678","박이김","컴공");
		
		Student[] students =new Student[] {s1, s2, s3};
		
		for(int num=0; num<students.length; num++) {
			if(students[num].getStudentName() != null) {
			 students[num].showStudentInfo();
			}
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		for(Student num1 : students ) {
			if(num1.getCollege() != null) {
			 num1.showStudentInfo();
			}
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		for(Student num2 : students ) {
			if("예담".equals(num2.getCollege())) {
			num2.showStudentInfo();
			}
		}

	}

}
