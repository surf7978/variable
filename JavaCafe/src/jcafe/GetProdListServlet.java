package jcafe;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetProdList")
public class GetProdListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetProdListServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html charset=utf-8");
		ProductDAO dao = new ProductDAO();
		List<ProductVO> list = dao.getProductList();
		String json = "[";
		int cnt =1;
		for(ProductVO vo : list) {
			json += "{";
			json += "\"item_no\":\""+ vo.getItemNo() +"\"";
			json += ",\"item\":\""+ vo.getItem() +"\"";
			json += ",\"category\":\""+ vo.getCategory() +"\"";
			json += ",\"price\":\""+ vo.getPrice() +"\"";
			json += ",\"link\":\""+ vo.getLink() +"\"";
			json += ",\"content\":\""+ vo.getContent() +"\"";
			json += ",\"like_it\":\""+ vo.getLikeIt() +"\"";
			json += ",\"alt\":\""+ vo.getAlt() +"\"";
			json += ",\"image\":\""+ vo.getImage() +"\"";
			json += "}";
			if(list.size() != cnt++) {
				json += ",";
			}
		}
		json += "]";
		//DB에서 테이블 생성하고 커밋안해주면 내용 없어서 []만 출력됨
		
		//PrintWriter out = response.getWriter().append(json);
		//out.print(json); //이렇게 되면 console에 오브젝트로 뜸
		
		response.getWriter().append(json); //이렇게 해야 배열로 뜸
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
