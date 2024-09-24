package com.dhiraj.JPAPractise;

import com.dhiraj.JPAPractise.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class JpaPractiseApplication {

	public static void main(String[] args) {
	    ApplicationContext context = SpringApplication.run(JpaPractiseApplication.class, args);

		EmployeeRepo repo = context.getBean(EmployeeRepo.class);
		Employee e1 = context.getBean(Employee.class);
		Employee e2 = context.getBean(Employee.class);
		Employee e3 = context.getBean(Employee.class);

		e1.setEmpID(01);
		e1.setEmpName("Mahesh");
		e1.setSalary(79000);

		e2.setEmpID(02);
		e2.setEmpName("Tushar");
		e2.setSalary(11000);

		e3.setEmpID(03);
		e3.setEmpName("Pranav");
		e3.setSalary(50000);

		repo.save(e1);
		repo.save(e2);
		repo.save(e3);

		System.out.println(repo.findAll());
		System.out.println("Enter The Id: ");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();

		System.out.println(repo.findById(id));
		//System.out.println(repo.findByName("Tushar"));
		System.out.println(repo.findBySalary(11000));
	}
}


