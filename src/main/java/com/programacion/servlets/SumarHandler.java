package com.programacion.servlets;


import com.programacion.config.Config;
import com.programacion.servicios.Operaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@Component("sumarHandler")
public class SumarHandler implements HttpRequestHandler {
    @Autowired
    private Operaciones servicio;
    @Autowired
    private Config config;
    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        /*Procesar la solicitud dada, generando una respuesta.
         *request - solicitud HTTP actual
         * response - Respuesta HTTP actual */
        int ret = servicio.sumar(config.getNum1(), config.getNum2());
        PrintWriter pw = resp.getWriter();
        resp.setContentType("text/html");
        pw.printf("La suma es: %d", ret);

    }
    //handleRequest maneja la peticion, nos permite trabajar con la peticion
    //request tiene informacion de la peticion.
}
