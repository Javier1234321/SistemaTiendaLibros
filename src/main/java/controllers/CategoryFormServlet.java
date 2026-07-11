/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controllers;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Optional;
import models.Category;
import services.CategoryService;

/**
 *
 * @author javie
 */
@WebServlet("/Category/form")
public class CategoryFormServlet extends HttpServlet {
    CategoryService cs=new CategoryService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       int id;
       try{
           id=Integer.parseInt(req.getParameter("id"));
       }catch(NumberFormatException e){
           id=0;
       }
       Category c=new Category();
       if(id>0){
           c=cs.finById(id);
           if(c!= null){
               req.setAttribute("category", c);
               getServletContext().getRequestDispatcher("/Administrator/categoriesForm.jsp").forward(req, resp);
           }
       }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    
}
