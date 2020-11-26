package com.yedam.db2;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmpMain {

	public static void main(String[] args) {
		// 1.전체조회, 2.한건조회, 3.입력, 4.수정, 5.삭제
		Scanner scn = new Scanner(System.in);

		EmpService service = new EmpServiceImpl();

		while (true) {

			System.out.println("--------------------------------------------");
			System.out.println("| 1.전체조회 | 2.검색 | 3.입력 | 4.수정 | 5.삭제 |");
			System.out.println("--------------------------------------------");
			System.out.print(" 선택 >> ");
			int selectNo = scn.nextInt();
			String enterX = scn.nextLine();

			if (selectNo == 1) {

				List list = service.getEmpList();
				for (Object vo : list) { // Object 타입으로 받아야함
					EmployeeVO emp = (EmployeeVO) vo; // 다시 EmployeeVO 타입으로 변경해야함
					emp.showEmpInfo();
				}

			} else if (selectNo == 2) {
				System.out.print("조회할 사원번호 입력: ");
				int empId = scn.nextInt();

				EmployeeVO vo = service.getEmp(empId);
				vo.showEmpInfo();

			} else if (selectNo == 3) {
				System.out.print("사원번호 입력: ");
				int employeeId = scn.nextInt();
				enterX = scn.nextLine();
				System.out.print("이름 입력: ");
				String firstName = scn.nextLine();
				System.out.print("성 입력: ");
				String lastName = scn.nextLine();
				System.out.print("이메일 입력: ");
				String email = scn.nextLine();
				System.out.print("연락처 입력: ");
				String phoneNumber = scn.nextLine();
				System.out.print("입사일 입력: ");
				String hireDate = scn.nextLine();
				System.out.print("업무 입력: ");
				String jobId = scn.nextLine();
				System.out.print("월급 입력: ");
				int salary = scn.nextInt();

				EmployeeVO vo = new EmployeeVO(employeeId, firstName, lastName, email, phoneNumber, hireDate, jobId,
						salary);
				service.insertEmp(vo);

			} else if (selectNo == 4) {
				System.out.print("수정할 사원번호 : ");
				int employeeId = scn.nextInt();
<<<<<<< HEAD
				String enterY = scn.nextLine();
				System.out.print("수정할 이메일: ");
				String email = scn.nextLine();
				System.out.print("수정할 연락처: ");
				String phoneNumber = scn.nextLine();
				System.out.print("수정할 월급: ");
				String salary = scn.nextLine();

				if (salary == null || salary.equals(""))
					salary = "0";// parseInt에는 null값 못들어가서 0넣고 parseInt한다.
				int sal = Integer.parseInt(salary);//한 줄이라 {}안 씀

				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(employeeId);
				vo.setEmail(email);
				vo.setPhoneNumber(phoneNumber);
				vo.setSalary(sal);//String인 salary를 Integer.parseInt()써서 int로 바꿔줌

				service.updateEmp(vo);

=======
				enterX = scn.nextLine();
				System.out.print("수정할 이메일: ");
				String email = scn.nextLine();
				System.out.print("수정할 연락처: ");
				String phoneNumber = scn.nextLine();
				System.out.print("수정할 월급: ");
				String salary = scn.nextLine();

				if (salary == null || salary.equals("")) {
					salary = "0";// parseInt에는 null값 못들어가서 0넣고 parseInt한다.
				int sal = Integer.parseInt(salary);//한 줄이라 {}안 씀

				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(employeeId);
				vo.setEmail(email);
				vo.setPhoneNumber(phoneNumber);
				vo.setSalary(sal);//String인 salary를 Integer.parseInt()써서 int로 바꿔줌

				service.updateEmp(vo);
				}
>>>>>>> branch 'master' of https://github.com/surf7978/variable.git
			} else if (selectNo == 5) {
				System.out.print("삭제할 사원번호 : ");
				int empId = scn.nextInt();
				
				service.deleteEmp(empId);

			} else if (selectNo == 6) {
				System.out.println("<<프로그램 종료>>");
				break;

			}
		}
	}
}
