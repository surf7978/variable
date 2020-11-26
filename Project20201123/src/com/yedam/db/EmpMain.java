package com.yedam.db;

import java.util.Scanner;

public class EmpMain {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// 사원정보, 부서정보,
		while (true) {
			System.out.println();
			System.out.println("==========================================");
			System.out.println("| 1.사원정보 | 2.부서정보 | 3.종료 | 4.사원입력 |");
			System.out.println("==========================================");
			System.out.print("선택 >> ");

			int selectNo = scn.nextInt();
			String enterX = scn.nextLine();

			if (selectNo == 1) {
				EmpDAO dao = new EmpDAO();
				Employee[] employees = dao.getEmpList();
				for (Employee emp : employees) {
					if (emp != null) {
						emp.showEmpInfo();
					}
				}
			} else if (selectNo == 2) {
				EmpDAO dao = new EmpDAO();
				Employee[] employees = dao.getDepartmentList();
				for (Employee emp : employees) {
					if (emp != null) {
						emp.showDepartmentInfo();
					}
				}
			} else if (selectNo == 3) {
				System.out.println();
				System.out.println("<<end of program>>");
				break;
			} else if (selectNo == 4) {
				addEmployee();
			}
		}

	}// end of main()

	public static void addEmployee() {
		System.out.print("이름 입력 >> ");
		String name = scn.nextLine();
		System.out.print("이메일 입력 >> ");
		String email = scn.nextLine();
		System.out.print("입사일 입력 >> ");
		String hireDate = scn.nextLine();
		System.out.print("직무 입력 >> ");
		String jobId = scn.nextLine();

		Employee emp = new Employee(name, email, hireDate, jobId);
		EmpDAO dao = new EmpDAO();
		dao.insertEmployee(emp);
	}

}// end of class
