package com.programacion.config;

import com.programacion.servicios.ServicioLog;
import com.programacion.servicios.ServicioLogImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.programacion")
public class Config {

    private int num1=5;
    private  int num2=90;

    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }
}
