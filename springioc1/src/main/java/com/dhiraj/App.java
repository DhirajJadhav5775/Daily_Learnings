package com.dhiraj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        beanclass obj = (beanclass) context.getBean("beanclass1");

        obj.display();
    }
}
