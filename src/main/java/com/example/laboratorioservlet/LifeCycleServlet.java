package com.example.laboratorioservlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/lifecycle")
public class LifeCycleServlet extends HttpServlet {

    public void init() {
        System.out.println("Chamou método init");
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Chamou o método service");
    }

    public void destroy() {
        System.out.println("Destruindo LifeCycleServlet");
    }
}
