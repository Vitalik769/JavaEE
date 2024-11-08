package com.example.demo1;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "productServlet", value = "/product")
public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Product Information</h1>");
        response.getWriter().println("<p>Product ID: 12345</p>");
        response.getWriter().println("<p>Product Name: Amazing Gadget</p>");
        response.getWriter().println("<p>Description: This gadget does amazing things!</p>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productName = request.getParameter("productName");
        String productDescription = request.getParameter("productDescription");

        response.setContentType("text/html");
        response.getWriter().println("<h1>Product Update</h1>");
        response.getWriter().println("<p>Product Name: " + productName + "</p>");
        response.getWriter().println("<p>Description: " + productDescription + "</p>");
        response.getWriter().println("<p>Your product information has been updated!</p>");
    }
}
