package com.practice;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
public class RegisterServlet extends HttpServlet{
    public void dopost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
     response.setContentType("text/html");
     PrintWriter out=response.getWriter();
     out.println("<h2> Welcome to Register Servlet </h2>");
    }
    
}
