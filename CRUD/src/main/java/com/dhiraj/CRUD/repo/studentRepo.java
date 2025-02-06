package com.dhiraj.CRUD.repo;

import com.dhiraj.CRUD.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepo extends JpaRepository<Student, Integer>
{

}
