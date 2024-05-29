package main.java;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;

public class HelloWorldServelet extends HttpServlet {
    int count =0;
    public void init(ServeletConfig config) throws ServletException{
        super.init();
        System.out.println("From HelloWorld Servelet init method");
    }

}
