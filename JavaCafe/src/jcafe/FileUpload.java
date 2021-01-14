package jcafe;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/FileUpload")

@MultipartConfig(location = "c:/tmp", maxFileSize=1024000L, maxRequestSize=-1, fileSizeThreshold=1024)
//파일 최대사이즈 지정하는 명령문

public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FileUpload() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		
		Collection<Part> parts = request.getParts();
		String filename = "";
		String filepath = request.getServletContext().getRealPath("/images");
		for(Part part : parts) {
			filename = part.getSubmittedFileName();
			part.write(filepath+"/"+part.getSubmittedFileName());
		}
		PrintWriter out = response.getWriter();
		out.println("<script>");
		out.println("opener.frm.image.value='"+filename+"';");
		out.println("window.close();");
		out.println("</script>");
	}

}
