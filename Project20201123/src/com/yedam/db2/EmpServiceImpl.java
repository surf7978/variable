package com.yedam.db2;

import java.util.List;

public class EmpServiceImpl implements EmpService {

	EmpDAO dao = new EmpDAO();

	@Override
	public List getEmpList() {
		return dao.getEmpList();
	}

	@Override
	public EmployeeVO getEmp(int empId) {
		return dao.getEmp(empId);
	}

	@Override
	public void insertEmp(EmployeeVO empVo) {
		dao.insertEmp(empVo);
	}

	@Override
	public void updateEmp(EmployeeVO empVo) {
		dao.updateEmp(empVo);
	}

	@Override
	public void deleteEmp(int empId) {
		dao.deleteEmp(empId);
	}

}
