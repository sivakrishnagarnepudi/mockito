package main.java;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HelloWorldServelet extends HttpServlet {
    int count =0;
    public void init(ServletConfig config) throws ServletException{
        super.init();
        System.out.println("From HelloWorld Servelet init method");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

        System.out.println("HelloWorldService");
    }

}
