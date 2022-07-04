package com.programacion.servlets;

import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/sumar", name = "sumarHandler")
public class SumaServlet extends HttpRequestHandlerServlet {

    private static final long serialVersionUID = 1L;//necesario para tomcat cuando se tiene un servlet
    /*Es un identificador de versión universal para una clase. La deserialización utiliza este número para
    garantizar que una clase cargada corresponde exactamente a un objeto serializado.*/
}
