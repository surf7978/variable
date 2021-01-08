package common.Emp;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");//한글출력용1
		//response.setContentType("text/html; charset=utf-8"); //한글출력용2 꺽쇠(<)없애줘야함
		
		
		// TODO Auto-generated method stub
		EmpDAO dao = new EmpDAO();
		String xml = "<dataset>";
		List<EmployeeVO> list = dao.getEmpList();
		for (EmployeeVO emp : list) {
			xml += "<record>";
			xml += "<empId>" + emp.getEmployeeId() + "</empId>"//
					+ "<first_Name>" + emp.getFirstName() + "</first_Name>"//
					+ "<last_Name>" + emp.getLastName() + "</last_Name>"//
					+ "<email>" + emp.getEmail() + "</email>"//
					+ "<phone_Number>" + emp.getPhoneNumber() + "</phone_Number>"//
					+ "<hire_Date>" + emp.getHireDate() + "</hire_Date>"//
					+ "<job_Id>" + emp.getJobId() + "</job_Id>"//
					+ "<salary>" + emp.getSalary() + "</salary>";
			xml += "</record>";
		}
		xml += "</dataset>";// 데이터 넣어줌

		response.getWriter().append(xml);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);// 어짜피 doGet이 실행됨
	}

}
