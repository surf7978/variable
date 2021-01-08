package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/showBoardList")
public class showBoardList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public showBoardList() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");//한글출력용1
		BoardDAO dao = new BoardDAO();
		String xml = "<dataset>";
		List<BoardVO> list = dao.getBoardList();
		for (BoardVO brd : list) {
			xml += "<record>";
			xml += "<Board_Id>" + brd.getBoardNo() + "</Board_Id>"//
					+ "<Title>" + brd.getTitle() + "</Title>"//
					+ "<Content>" + brd.getContent() + "</Content>"//
					+ "<Writer>" + brd.getWriter() + "</Writer>"//
					+ "<Creation_Date>" + brd.getCreation_date() + "</Creation_Date>";//
			xml += "</record>";
		}
		xml += "</dataset>";// 데이터 넣어줌
		response.getWriter().append(xml);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
