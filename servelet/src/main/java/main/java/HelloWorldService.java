package main.java;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HelloWorldService extends HttpServlet {//two types of servlets are there 1 generic and httpservlet
    //life cycle of servlet init ,service,destroy


    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("From HelloWorld Servelet init method");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doGet(req, resp);
        System.out.println("HelloWorldService");
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("/HelloWorldExpress");
        requestDispatcher.forward(req,resp);
    }

}
