package com.dhiraj.springdataJPA;

import com.dhiraj.springdataJPA.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>
{

}
