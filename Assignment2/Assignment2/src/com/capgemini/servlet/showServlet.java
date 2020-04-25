package com.capgemini.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/showsServlet")
public class showServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int sum,diff,multiply;
		int op1 = (Integer) request.getAttribute("arg1");
		int op2 = (Integer) request.getAttribute("arg2");
		
		String add= (String) request.getAttribute("arg3");
		//String sub=(String) request.getAttribute("arg4");
		//String mul=(String) request.getAttribute("arg5");
	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		if("Add".equalsIgnoreCase(add)) {
			 sum=op1+op2;
			 out.println("<p> Sum is: "+sum+"</p>");
		}	 
		else if("Sub".equalsIgnoreCase(add)) {
			diff=Math.abs(op1-op2);
			out.println("<p> Difference is: "+diff+"</p>");

		}
		else if("Mul".equalsIgnoreCase(add)) {
			multiply=op1*op2;
			out.println("<p> Multiplication is:"+multiply+"</p>");
        }
		//out.println("<p>"+add+sub+mul+"</p>");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
		
		
		dispatcher.include(request, response);
		

		
		
		out.close();

	}

}
