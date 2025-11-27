package com.telecom;

import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//external tomcat
// @WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res){
        try {
            System.out.println("In service");
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            out.println("<h2><b>Hello World</b></h2>");
            // out.write("Hello from servlet!");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error");
        }
    }

}
