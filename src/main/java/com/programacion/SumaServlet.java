package com.programacion;

import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/suma", name = "sumarHandler")
public class SumaServlet extends HttpRequestHandlerServlet {

    private static final long serialVersionUID = 1L;//necesario para tompact cuando se tiene un servlet
    // es como un public static void main para un servideor web, es el punto de inicio en un servidor web
}
