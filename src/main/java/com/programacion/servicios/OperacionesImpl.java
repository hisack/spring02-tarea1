package com.programacion.servicios;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //, InitializingBean, DisposableBean
public class OperacionesImpl implements Operaciones, InitializingBean, DisposableBean {

    @Autowired
    private ServicioLog logger;

    public OperacionesImpl(){
        System.out.println("*******OperacionesImpl contructor (entrando al constructor)");

    }

    public int sumar(int x, int y) {
        logger.log("*******OperacionesImpl::sumar");
        System.out.println("sumando los números");
        int ret = x + y;
        return ret ;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.log("*******OperacionesImpl::init");
    }

    @Override
    public void destroy() throws Exception {
        logger.log("*******OperacionesImpl::destroy");
    }


}
