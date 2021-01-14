package jcafe;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PostProductServlet")
public class PostProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PostProductServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//저장버튼 누르면 파라미터값 넘어가는 명령문
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String itemNo = request.getParameter("itemNo");
		String item = request.getParameter("item");
		String category = request.getParameter("category");
		String price = request.getParameter("price");
		String content = request.getParameter("content");
		String likeIt = request.getParameter("likeIt");
		String alt = request.getParameter("alt");
		String image = request.getParameter("image");
		
//		System.out.println(itemNo);
//		System.out.println(item);
//		System.out.println(category);
//		System.out.println(price);
//		System.out.println(content);
//		System.out.println(likeIt);
//		System.out.println(image);
		
		ProductVO vo = new ProductVO();
		vo.setItemNo(itemNo);
		vo.setItem(item);
		vo.setCategory(category);
		vo.setPrice(Integer.parseInt(price));
		vo.setContent(content);
		vo.setLikeIt(Integer.parseInt(likeIt));
		vo.setAlt(alt);
		vo.setImage(image);
		
		System.out.println(vo);
		ProductDAO dao = new ProductDAO();
		dao.insertProdeuct(vo);
		
		 //저장 누르면 cafeList.html로 화면 전환해주는 스크립트
		String script = "<script>location.href='jcafe/cafeList.html'</script>";
		response.getWriter().append(script);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
