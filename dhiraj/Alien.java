package com.dhiraj;

import org.springframework.stereotype.Component;

@Component
public class Alien
{
    private int Salary;
    private String Name;
    private Double Weight;
    private Demo demo;

    public int getSalary()
    {
        return Salary;
    }

    public void setSalary(int salary)
    {
        Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double  getWeight()
    {
        return Weight;
    }
    public void setWeight(Double weight)
    {
        Weight = weight;
    }

    public Demo getDemo() {
        return demo;
    }

    public void setDemo(Demo demo) {
        this.demo = demo;
    }

    public void DemoCalling()
    {
        demo.Fun();
    }
}
