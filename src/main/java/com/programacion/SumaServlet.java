package com.programacion;

import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/suma", name = "sumarHandler")
public class SumaServlet extends HttpRequestHandlerServlet {

    private static final long serialVersionUID = 1L;
}
