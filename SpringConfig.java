package com.dhiraj.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dhiraj.beans.Student;

@Configuration
public class SpringConfigFile
{
	@Bean
	public Student std1()
	{
		Student std = new Student();
		std.setName("Dhiraj");
		std.setRollNo(79);
		std.setEmail("dhiraj@gmail.com");
		
		return std;
	}
}
