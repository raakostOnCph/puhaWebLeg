package com.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletNik",urlPatterns = {"/minservlet"})
public class ServletNik extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("postBesked","det her er en post fdra minServlet");
       request.getRequestDispatcher("index.jsp").forward(request,response);
    }







    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("besked","Det her er en get fra minServlet");

        String s = "hej med dig";

        response.getWriter().print(s);

        request.getRequestDispatcher("index.jsp").forward(request,response);




    }
}
