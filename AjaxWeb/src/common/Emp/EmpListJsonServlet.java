package common.Emp;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmpListJsonServlet")
public class EmpListJsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EmpListJsonServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpDAO dao = new EmpDAO();
		List<EmployeeVO> list = dao.getEmpList();
		
		String jsonFile = "[";
		
		int i = 1; //마지막데이터일경우 "," 제거용 변수
		for(EmployeeVO emp : list) {
			jsonFile += "{";
			jsonFile += "\"id\":"+emp.getEmployeeId()+""; // 역슬래쉬\=문자로 인식시킴
			jsonFile += ",\"firstName\":\""+emp.getFirstName()+"\"";
			jsonFile += ",\"lastName\":\""+emp.getLastName()+"\"";
			jsonFile += ",\"email\":\""+emp.getEmail()+"\"";
			jsonFile += ",\"salary\":\""+emp.getSalary()+"\"";
			jsonFile += "}";
			if(list.size() != i++) { //마지막데이터일 경우 "," 제거용 IF문
				jsonFile += ",";
			}
		}
		
		jsonFile += "]";
		
		response.getWriter().append(jsonFile);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
