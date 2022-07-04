package com.programacion.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.programacion")
public class Config {

    private int num1=15;
    private  int num2=40;

    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }
}
