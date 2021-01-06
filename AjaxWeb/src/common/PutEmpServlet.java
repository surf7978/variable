package common;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PutEmpServlet")
public class PutEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PutEmpServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fName = request.getParameter("fName");//title에 있는 값을 가져옴
		String lName = request.getParameter("lName");
		String email = request.getParameter("email");
		String phoneNumber = request.getParameter("phoneNumber");
		String salary = request.getParameter("salary");
		String jobId = request.getParameter("jobId");
		
		int salary1 = Integer.parseInt(salary);
		
		EmployeeVO vo = new EmployeeVO();
		vo.setFirstName(fName);
		vo.setLastName(lName);
		vo.setEmail(email);
		vo.setPhoneNumber(phoneNumber);
		vo.setSalary(salary1);
		vo.setJobId(jobId);
		
		EmpDAO dao = new EmpDAO();
		
		if(dao.insertEmp(vo)) {
			response.getWriter().append("<h1>OK</h1>");
		}else {
			response.getWriter().append("<h1>NG</h1>");
			//보통 NG떳을때는 DAO쪽의 sql 구문이 잘못된 경우가 많다.
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
