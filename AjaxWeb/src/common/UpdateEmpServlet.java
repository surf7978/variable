package common;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateEmpServlet")
public class UpdateEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateEmpServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empId = request.getParameter("updateId");
		String fName = request.getParameter("updatefName");
		String lName = request.getParameter("updatelName");
		String email = request.getParameter("updateemail");
		String pNumber = request.getParameter("updatepNumber");
		String hDate = request.getParameter("updatehireDate");
		String jId = request.getParameter("updatejId");
		String salary = request.getParameter("updatesalary");

		EmployeeVO vo = new EmployeeVO();
		vo.setEmployeeId(Integer.parseInt(empId));
		vo.setFirstName(fName);
		vo.setLastName(lName);
		vo.setEmail(email);
		vo.setPhoneNumber(pNumber);
		vo.setHireDate(hDate);
		vo.setJobId(jId);
		vo.setSalary(Integer.parseInt(salary));

		System.out.println(vo);
		EmpDAO dao = new EmpDAO();
		if(dao.updateEmp(vo)) {
			response.getWriter().append("<h1>OK</h1>");
		}else {
			response.getWriter().append("<h1>NG</h1>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
