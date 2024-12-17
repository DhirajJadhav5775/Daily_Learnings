package com.dhiraj;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class ServletClass extends HttpServlet
{
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("in service");
        PrintWriter out = response.getWriter();
        //response.getWriter().println("Started");
        response.setContentType("text/html");
        out.println("<h2><B>Started On 8080</B></h2>");
    }
}
