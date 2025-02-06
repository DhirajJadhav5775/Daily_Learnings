package com.dhiraj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config
{
    @Autowired
    public BeanClass beanClass()
    {
        return new BeanClass();
    }
}
