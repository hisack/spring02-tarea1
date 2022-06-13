package com.programacion.servlets;


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
public class SumarServlet implements HttpRequestHandler {

    @Autowired
    private Operaciones servicio;

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

        int ret = servicio.sumar(5,90);

        PrintWriter pw = resp.getWriter();

        resp.setContentType("text/html");

        pw.printf("la suma es: %d", ret);
    }
}
