package com.yedam.db2;

public class EmployeeVO {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String hireDate;
	private String jobId;
	private int salary;

	private int departmentId;
	private String departmentName;
	private String managerId;
	private String locationId;


	
	public EmployeeVO(int employeeId, String firstName, String lastName, String email, String phoneNumber,
			String hireDate, String jobId, int salary, int departmentId, String managerId) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.jobId = jobId;
		this.salary = salary;
		this.departmentId = departmentId;
		this.managerId = managerId;
	}

	public EmployeeVO(int employeeId) {
		this.employeeId = employeeId;
	}

	public EmployeeVO() {
		
	}

	public EmployeeVO(int employeeId, String firstName, String lastName, String email, String phoneNumber,
			String hireDate, String jobId, int salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.jobId = jobId;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void showEmpInfo() {
		System.out.println("사원번호: " + employeeId //
				+ ", 이름: " + firstName + " " + lastName //
				+ ", email: " + email //
				+ ", 연락처: " + phoneNumber // 
				+ ", 입사일: " + hireDate // 
				+ ", 업무: " + jobId + ", 월급: " + salary);
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public void showDepartmentInfo() {
		System.out.println("부서번호: " + departmentId // 
				/*+ ", 부서이름: " + departmentName*/ //
				+ ", 관리번호: " + managerId //
				/*+ ", 지역번호: " + locationId*/);//
	}
}
