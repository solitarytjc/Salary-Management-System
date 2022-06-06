package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.dao.*;
import com.model.staff2;

/**
 * Servlet implementation class inputServlet
 */
@WebServlet("/controller/inputServlet.do")
public class inputServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        inputDao dao=new inputDao();
        ArrayList<staff2> staffList = dao.staffinf();
        request.getSession().setAttribute("inputList", staffList);
        response.sendRedirect("../inputwage.jsp");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
