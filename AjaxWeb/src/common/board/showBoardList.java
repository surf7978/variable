package common.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class showBoardList
 */
@WebServlet("/showBoardList")
public class showBoardList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showBoardList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");//한글출력용1
		BoardDAO dao = new BoardDAO();
		String xml = "<dataset>";
		List<BoardVO> list = dao.getBoardList();
		for (BoardVO brd : list) {
			xml += "<record>";
			xml += "<brdId>" + brd.getBoardNo() + "</brdId>"//
					+ "<Content>" + brd.getContent() + "</Content>"//
					+ "<Writer>" + brd.getWriter() + "</Writer>"//
					+ "<Creation_date>" + brd.getCreation_date() + "</Creation_date>";//
			xml += "</record>";
		}
		xml += "</dataset>";// 데이터 넣어줌
		response.getWriter().append(xml);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
