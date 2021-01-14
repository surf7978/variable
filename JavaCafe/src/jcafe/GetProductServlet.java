package jcafe;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetProductServlet")
public class GetProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetProductServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.html에서 값 받고 2.DB에서 값 받은 다음 3.다시 html에 값을 줘야함
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html charset=utf-8");
		request.setCharacterEncoding("utf-8");
		//1.
		String item = request.getParameter("item_no");
		ProductVO vo = new ProductVO();
		vo.setItemNo("bean_001"); //테스트용 임시값
		//vo.setItemNo(item); //이렇게 써야함
		
		//2.
		ProductDAO dao = new ProductDAO();
		ProductVO result = dao.getProduct(vo);
		
		//3.
		String json = "{";
		json += "\"item_no\":\""+result.getItemNo()+"\"";
		json += ",\"item\":\""+ result.getItem() +"\"";
		json += ",\"category\":\""+ result.getCategory() +"\"";
		json += ",\"price\":\""+ result.getPrice() +"\"";
		json += ",\"link\":\""+ result.getLink() +"\"";
		json += ",\"content\":\""+ result.getContent() +"\"";
		json += ",\"like_it\":\""+ result.getLikeIt() +"\"";
		json += ",\"alt\":\""+ result.getAlt() +"\"";
		json += ",\"image\":\""+ result.getImage() +"\"";
		json += "}";
		
		System.out.println(json);
		response.getWriter().append(json);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
