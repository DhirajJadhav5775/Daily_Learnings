package com.dhiraj.SpringBootDemo2.model;

import org.springframework.stereotype.Component;

@Component
public class G63 implements Car
{
    @Override
    public void Mercedes() {
        System.out.println("Mercedes G63");
    }
}
