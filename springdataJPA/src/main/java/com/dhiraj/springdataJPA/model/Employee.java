package com.dhiraj.springdataJPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
public class Employee
{
    @Id
    private int EmpID;
    private String EmpName;
    private int Age;

    public int getEmpID()
    {
        return EmpID;
    }

    public void setEmpID(int empID)
    {
        EmpID = empID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmpID=" + EmpID +
                ", EmpName='" + EmpName + '\'' +
                ", Age=" + Age +
                '}';
    }
}
