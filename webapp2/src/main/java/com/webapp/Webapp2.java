package com.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myWebapp2")
public class Webapp2 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		System.out.println("In Get Method");
		PrintWriter pw = res.getWriter();
		pw.println("On Browser");
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		doGet(req, res);
	}
}
