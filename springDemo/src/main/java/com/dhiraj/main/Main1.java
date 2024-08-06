package com.dhiraj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dhiraj.beans.Student;
import com.dhiraj.resources.SpringConfigFile;

public class Main1 
		{
			public static void main(String args[])
			{
				@SuppressWarnings("resource")
				ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
				Student std = (Student) context.getBean("std1");
				
				std.Display();
			}
		}