package com.dhiraj.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien
{
    @Value("21")
    private int age;
    private Computer com;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("code");
        com.compile();
    }
}