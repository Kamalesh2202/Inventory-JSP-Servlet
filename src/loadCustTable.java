import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;
import java.io.*;

import daoObjects.tableValues;
import vaoObjects.Stocks;

//@WebServlet("/loadCustTable")
public class loadCustTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Stocks> stk = tableValues.getStocks();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<table>");
		out.print("<tr>");
		out.print("<th>Product Name</th>"); 
		out.print("<th>Quantity</th>"); 
		out.print("<th>Rate</th>"); 
		out.print("</tr>");
		for(int i = 0;i < stk.size();i++){
			out.print("<tr ALIGN = CENTER>");
			out.print("<td>" + stk.get(i).getProductName() + "</td>");
			out.print("<td>" + stk.get(i).getQuantity() + "</td>");
			out.print("<td>" + stk.get(i).getRate() + "</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		out.close();
	}

}
