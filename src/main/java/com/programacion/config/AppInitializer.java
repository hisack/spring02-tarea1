package com.programacion.config;

import org.springframework.web.context.AbstractContextLoaderInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class AppInitializer extends AbstractContextLoaderInitializer {
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        AnnotationConfigWebApplicationContext rootContext
                = new AnnotationConfigWebApplicationContext();//crea dependecia spara el contenedor
        //contexto es el contenedor de dependecias que es el objetos q guarda las instancias que podemos inectar donde lo necesitemos usando el
        // @Autowired
        rootContext.register(Config.class);//la registramos para luego poder inyectarla a config
        return rootContext;

    }

    //haces un contenedor
}
