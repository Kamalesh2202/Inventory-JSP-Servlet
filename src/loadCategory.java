import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;
import java.io.*;

import daoObjects.getCategory;

public class loadCategory extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		ArrayList<String> categoryList = getCategory.getCategoryList();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<select name = 'categoryList'>");
		out.println("<option value = ' '>-- Select Category --</option>");
		for(int i = 0;i < categoryList.size();i++){
			String s = categoryList.get(i);
			out.println("<option value = " + s + ">" + s + "</option>");
		}
		out.println("</select>");
		out.close();
	}
}
