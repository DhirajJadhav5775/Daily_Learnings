package com.dhiraj.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ImpServlet")
public class ImplicitServlet extends HttpServlet 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
	{
		try {
			PrintWriter out = res.getWriter();
			String Name = req.getParameter("name1");
			String Pass = req.getParameter("pass1");
			
			out.println("Name: " + Name);
			out.println("PassWord: " + Pass);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
