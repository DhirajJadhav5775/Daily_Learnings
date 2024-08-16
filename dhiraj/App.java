package com.dhiraj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Alien obj = (Alien) context.getBean("Alienobj");
        System.out.println("Salary: " + obj.getSalary());
        System.out.println("Name: " + obj.getName());
        System.out.println("Weight: " + obj.getWeight());
        obj.DemoCalling();
    }
}
