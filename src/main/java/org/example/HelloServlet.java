package org.example;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    //@java.lang.Override
    public void service(ServletRequest req, ServletResponse res) throws IOException {
        System.out.print("in service");
        res.setContentType("text/html");
        res.getWriter().println("<h2>Response from server!</h2>");
    }
}
