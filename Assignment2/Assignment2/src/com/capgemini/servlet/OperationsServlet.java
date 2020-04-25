package com.capgemini.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class OperationsServlet
 */
@WebServlet("/operation")
public class OperationsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String op1=request.getParameter("op1");
		String op2=request.getParameter("op2");
		String add=request.getParameter("oprn");
		//String sub=request.getParameter("sub");
		//String mul=request.getParameter("mul");
		
		RequestDispatcher dispatcher =request.getRequestDispatcher("showsServlet");
	
		
		request.setAttribute("arg1", Integer.parseInt(op1));
		request.setAttribute("arg2", Integer.parseInt(op2));
		request.setAttribute("arg3", add);
	//	request.setAttribute("arg4", sub);
	//	request.setAttribute("arg5", mul);
				
		dispatcher.forward(request, response);
		
	}
	}