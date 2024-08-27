package com.dhiraj.SpringBootDemo2;

import com.dhiraj.SpringBootDemo2.model.G63;
import com.dhiraj.SpringBootDemo2.model.POJO;
import com.dhiraj.SpringBootDemo2.service.g63Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemo2Application {

	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(SpringBootDemo2Application.class, args);
		/*POJO pojo = (POJO) context.getBean(POJO.class);

		System.out.println("Age: " + pojo.getAge());
		pojo.Calling();*/

		g63Service service = context.getBean(g63Service.class);

		G63 g63 = context.getBean(G63.class);
		service.addG63(g63);
		
	}

}
