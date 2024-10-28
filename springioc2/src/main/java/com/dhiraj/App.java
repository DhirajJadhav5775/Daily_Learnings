package com.dhiraj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(applicationcontext.class);

        beanclass obj = context.getBean(beanclass.class);
        obj.setName("Dhiraj");
        System.out.println(obj.getName());
    }
}
