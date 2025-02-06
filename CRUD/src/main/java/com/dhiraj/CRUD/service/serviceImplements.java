package com.dhiraj.CRUD.service;

import com.dhiraj.CRUD.Student;
import com.dhiraj.CRUD.repo.studentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceImplements implements studentService
{
    @Autowired
    private studentRepo stuRepo;
    @Override
    public boolean addStudentDetails(Student stu) {
        boolean status = false;
        try {
            stuRepo.save(stu);
            status = true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            status = false;
        }
        return status;
    }
}
