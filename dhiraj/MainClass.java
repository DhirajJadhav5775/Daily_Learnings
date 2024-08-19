package com.dhiraj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Employee employee = (Employee) context.getBean("Emp");

        int EmpID = employee.getEmpID();
        float Salary = employee.getSalary();

        System.out.println(EmpID);
        System.out.println(Salary);
    }
}
