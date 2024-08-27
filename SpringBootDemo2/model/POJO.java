package com.dhiraj.SpringBootDemo2.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class POJO
{
    @Value("27")
    private int age;

    Car car;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    @Autowired
    @Qualifier("g63")
    public void setCar(Car car) {
        this.car = car;
    }

    public void Calling()
    {
        System.out.println("Calling...");
        car.Mercedes();
    }
}


