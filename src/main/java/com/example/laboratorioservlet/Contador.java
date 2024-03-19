package com.example.laboratorioservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/contador")
public class Contador extends HttpServlet {

    private int contador = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        contador++;
        response.setContentType("text/html");

        response.getWriter().println("<html><head><title>Contador de Acessos</title></head><body>");
        response.getWriter().println("<h1>Número de acessos: " + contador + "</h1>");
        response.getWriter().println("</body></html>");
    }
}
