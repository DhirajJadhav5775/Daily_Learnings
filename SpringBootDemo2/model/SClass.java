package com.dhiraj.SpringBootDemo2.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SClass implements Car
{
    public void Mercedes()
    {
        System.out.println("Mercedes S Class");
    }
}
