package com.dhiraj.App.SpringDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringDemo2Application {
	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(SpringDemo2Application.class, args);
		System.out.println("Hello From Main");

		//Laptop lp = new Laptop();   Manually
		Laptop lp = context.getBean(Laptop.class);
		Computer com = context.getBean(Computer.class);

		lp.CPU();
		com.Keyboard();


	}

}
