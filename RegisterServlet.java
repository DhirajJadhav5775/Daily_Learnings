package com.servlet.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet
{
	//create the query
	private static final String INSERT_QUERY = "INSERT INTO USER(NAME,CITY,MOBILE,DOB) VALUES(?,?,?,?)";
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//get PrintWriter
		PrintWriter pw = response.getWriter();			//PrintWriter pw = response.getWriter()
		//set content type
		response.setContentType("text/html");
		//Read the form values
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String mobile = request.getParameter("mobile");
		String dob = request.getParameter("dob");
		
		System.out.println("Name: " + name);
		System.out.println("City: " + city);
		System.out.println("Mobile: " + mobile);
		System.out.println("DOB: " + dob);
		
		//load the jdbc driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try
		{
			String url = "jdbc:mysql://localhost:3306/registration";
			String username = "root";
			String pass = "Dhiraj@5775";
			Connection conn = DriverManager.getConnection(url,username,pass);
			PreparedStatement ps = conn.prepareStatement(INSERT_QUERY);
			ps.setString(1, name);
			ps.setString(2, city);
			ps.setString(3, mobile);
			ps.setString(4, dob);
			
			//execute the query
			int count = ps.executeUpdate();
			if(count == 0)
			{
				pw.println("Records Not Stored Into DataBase");
			}
			else
			{
				pw.println("Records Stored Into DataBase");
			}
		}
		catch(Exception exception)
		{
			pw.println(exception.getMessage());
			exception.printStackTrace();
		}
		//close the stream
		pw.close();
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request,response);
	}
}
