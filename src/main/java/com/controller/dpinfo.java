package com.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import com.dao.*;
import com.model.dp;

/**
 * Servlet implementation class dpinfo
 */
@WebServlet("/controller/dpinfo.do")
public class dpinfo extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        dpDao dao=new dpDao();
        boolean first;
        if(request.getSession().getAttribute("dpList")!=null) {
            first=false;
        }
        else first=true;
        ArrayList<dp> dpList = dao.dpinf();
        request.getSession().setAttribute("dpList", dpList);
        if(first)
            response.sendRedirect("main.jsp");
        else response.sendRedirect("../main.jsp");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
