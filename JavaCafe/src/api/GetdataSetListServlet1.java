package api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/GetdataSetListServlet1")
public class GetdataSetListServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetdataSetListServlet1() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//js로 구현
		apiDAO dao = new apiDAO();
		String xml = "<dataset>";
		List<apiVO> list = dao.getDataSetList();
		for (apiVO vo : list) {
			xml += "<record>";
			xml += "<name>" + vo.getName() + "</name>"//
					+ "<position>" + vo.getPosition() + "</position>"//
					+ "<office>" + vo.getOffice() + "</office>"//
					+ "<extn>" + vo.getExtn() + "</extn>"//
					+ "<Start_date>" + vo.getStart_date() + "</Start_date>"//
					+ "<salary>" + vo.getSalary() + "</salary>";
			xml += "</record>";
		}
		xml += "</dataset>";// 데이터 넣어줌

		response.getWriter().append(xml);
		
		//json으로 구현
//		apiDAO dao = new apiDAO();
//		List<apiVO> list = dao.getDataSetList();
//		String json = "[";
//		int cnt =1;
//		for(apiVO vo : list) {
//			json += "{";
//			json += "\"Name\":\""+ vo.getPosition() +"\"";
//			json += ",\"Position\":\""+ vo.getPosition() +"\"";
//			json += ",\"Office\":\""+ vo.getOffice() +"\"";
//			json += ",\"Extn.\":\""+ vo.getExtn() +"\"";
//			json += ",\"Start date\":\""+ vo.getStart_date() +"\"";
//			json += ",\"Salary\":\""+ vo.getSalary() +"\"";
//			json += "}";
//			if(list.size() != cnt++) {
//				json += ",";
//			}
//		}
//		json += "]";
//		
//		response.getWriter().append(json);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
