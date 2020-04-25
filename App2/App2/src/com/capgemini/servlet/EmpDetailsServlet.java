package com.capgemini.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class EmpDeatailsServlet
 */
@WebServlet("/empDetails")
public class EmpDetailsServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
   
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=request.getParameter("empId");
		String name=request.getParameter("empName");
		String salary=request.getParameter("empSalary");
		String hn=request.getParameter("hnm");
		String area=request.getParameter("area");
		String city=request.getParameter("city");
		String pin=request.getParameter("pin");
		
        PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		
		out.println("<p>Employee Id: "+Integer.parseInt(id));
		out.println("<br>Employee Name :"+name);
		out.println("<br>Salary: "+Integer.parseInt(salary));
		out.println("<h3>Address Details</h3>");
		out.println("<br>House No.: "+Integer.parseInt(hn));
		out.println("<br>Area: "+area);
		out.println("<br>City: "+city);
		out.println("Pincode: "+Integer.parseInt(pin)+"</p>");
		
		out.close();
		 
           
	}

}
