package common;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetItemListServ")
public class GetItemListServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetItemListServ() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ItemDAO dao = new ItemDAO();
		List<ItemVO> list = dao.getItemList();
		PrintWriter out = response.getWriter();
		String json = "[";
		int cnt =1;
		for(ItemVO item : list) {
			json += "{";
			json += "\"item_no\":\""+ item.getItem_No() +"\"";
			json += ",\"item\":\""+ item.getItem() +"\"";
			json += ",\"category\":\""+ item.getCategory() +"\"";
			json += ",\"price\":\""+ item.getPrice() +"\"";
			json += ",\"link\":\""+ item.getLink() +"\"";
			json += ",\"content\":\""+ item.getContent() +"\"";
			json += ",\"like_it\":\""+ item.getLike_It() +"\"";
			json += ",\"alt\":\""+ item.getAlt() +"\"";
			json += ",\"image\":\""+ item.getImage() +"\"";
			json += "}";
			if(list.size() != cnt++) {
				json += ",";
			}
		}
		json += "]";
		
		
		out.print(json); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
