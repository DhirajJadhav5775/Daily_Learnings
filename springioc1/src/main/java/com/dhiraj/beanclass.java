package com.dhiraj;

public class beanclass
{
    private int age;

//    public int getAge() {
//        return age;
//    }

    public void setAge(int age) {
        this.age = age;//setter dependency injection
    }
    public void display()
    {
        System.out.println("Age: " + age);
    }
}
