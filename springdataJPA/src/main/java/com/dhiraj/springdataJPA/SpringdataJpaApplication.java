package com.dhiraj.springdataJPA;

import com.dhiraj.springdataJPA.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdataJpaApplication {

	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(SpringdataJpaApplication.class, args);
		Employee e1 = context.getBean(Employee.class);
		Employee e2 = context.getBean(Employee.class);
		Employee e3 = context.getBean(Employee.class);
		Employee e4 = context.getBean(Employee.class);


		e1.setEmpID(01);
		e1.setEmpName("Dhiraj");
		e1.setAge(21);

		e2.setEmpID(02);
		e2.setEmpName("Rohan");
		e2.setAge(21);

		e3.setEmpID(03);
		e3.setEmpName("Nikhil");
		e3.setAge(22);

		e4.setEmpID(04);
		e4.setEmpName("Manish");
		e4.setAge(23);

		EmpRepo empRepo = context.getBean(EmpRepo.class);
		empRepo.save(e1);
		empRepo.save(e2);
		empRepo.save(e3);
		empRepo.save(e4);

	}

}
