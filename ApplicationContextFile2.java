package com.dhiraj.App.SpringDemo2;

import org.springframework.stereotype.Component;

@Component
public class Laptop
{
    public void CPU()
    {
        System.out.println("Compiling");
    }
}
@Component
class Computer
{
    public void Keyboard()
    {
        System.out.println("Typing");
    }
}
