package com.programacion.config;

import org.springframework.web.context.AbstractContextLoaderInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class AppInitializer extends AbstractContextLoaderInitializer {

    /*AbstractContextLoaderInitializer
    Clase base conveniente para implementaciones de WebApplicationInitializer
    que registran un ContextLoaderListener en el contexto del servlet.*/

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        /*createRootApplicationContext() Crea el contexto de aplicación "raíz" que se proporcionará al archivo.*/
        //Crear el contenedor
        AnnotationConfigWebApplicationContext context
                = new AnnotationConfigWebApplicationContext();

        context.register(Config.class);//la registramos para luego poder inyectarla a config
        return context;

    }

   /* AnnotationConfigWebApplicationContext
   * Implementación de WebApplicationContext que acepta clases de componentes como entrada,
   * en particular clases @Configuration, pero también clases de @Component sin formato,
   *  así como clases compatibles con JSR-330 mediante anotaciones. javax.inject
   * Permite registrar clases una por una (especificando nombres de clase como ubicaciones de configuración),
   *  así como a través del escaneo de ruta de clase (especificando paquetes base como ubicaciones
   * de configuración).
   * */
}
