import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoObjects.getSeller;

public class loadSeller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<String> sellerList = getSeller.getSellerList();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<select name = 'sellerList'>");
		out.println("<option value = ' '>-- Select Seller --</option>");
		for(int i = 0;i < sellerList.size();i++){
			String s = sellerList.get(i);
			out.println("<option value = " + s + ">" + s + "</option>");
		}
		out.println("</select>");
		out.close();
	}
}
