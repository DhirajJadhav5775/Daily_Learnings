package com.dhiraj;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println( "Hello World!" );
        Tomcat tomcat = new Tomcat();

        Context context = tomcat.addContext("",null);
        //Tomcat.addServlet(context, "S1", new ServletClass());
        Tomcat.addServlet(context,"S1", new ServletClass());
        context.addServletMappingDecoded("/Servlet","S1");

        tomcat.start();
        tomcat.getServer().await();
    }
}
