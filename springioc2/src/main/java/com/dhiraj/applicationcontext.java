package com.dhiraj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class applicationcontext
{
    @Bean
    public beanclass beanclass1()
    {
        return new beanclass();
    }
}
