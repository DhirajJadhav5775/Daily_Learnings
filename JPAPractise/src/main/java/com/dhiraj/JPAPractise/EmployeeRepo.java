package com.dhiraj.JPAPractise;

import com.dhiraj.JPAPractise.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{
    //List<Employee> findByName(String EmpName);

     List<Employee> findBySalary(int salary);
}
