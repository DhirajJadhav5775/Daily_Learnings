package com.dhiraj;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        BeanClass b1 = (BeanClass) context.getBean("Bean1");
        b1.setiNo(21);
        System.out.println(b1.getiNo());

        BeanClass b2 = (BeanClass) context.getBean("Bean1");
        System.out.println(b2.getiNo());
    }
}
