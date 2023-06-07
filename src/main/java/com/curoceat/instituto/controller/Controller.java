package com.curoceat.instituto.controller;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


@WebServlet(name = "Controller", value = "/Controller")
public class Controller extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("mensaje", "HOLA  a TOD@");
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String nombre=request.getParameter("nombre");
        String curso=request.getParameter("curso");
        ....



        System.out.println(nombre);




    }

}