package com.dhiraj;

public class BeanClass
{
    private int iNo;
    public BeanClass()
    {
        System.out.println("Object Created");
    }

    public int getiNo() {
        return iNo;
    }

    public void setiNo(int iNo) {
        this.iNo = iNo;
    }
}
