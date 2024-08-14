package com.dhiraj;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello From Main!" );
        /*BeanClass obj = new BeanClass();
        obj.Print();*/

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        BeanClass obj = (BeanClass) context.getBean("print");

        obj.Print();
    }
}
