package com.dhiraj.CRUD;

import com.dhiraj.CRUD.service.serviceImplements;
import com.dhiraj.CRUD.service.studentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(CrudApplication.class, args);
		studentService stdService = context.getBean(serviceImplements.class);

		Student std = new Student();
		std.setStu_id(01L);
		std.setName("Dhiraj");
		std.setAge(22);
		std.setGrade("FirstClass");

		boolean status = stdService.addStudentDetails(std);
		if(status)
		{
			System.out.println("Student Inserted Succesfully");
		}
		else
		{
			System.out.println("Student Does Not Inserted Due To Some Error///");
		}
	}
}
