package org.wcs.hello;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleHelloServlet", urlPatterns =  {"/simplehello"})
public class SimpleHelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String time =request.getParameter("time");

        String heure = time.substring(0,2);

       int hh = Integer.parseInt(heure);
       String mess = "Good night ";

        if (hh >= 5 && hh < 20)
            if (hh < 12)
                mess = "Good morning ";
            else
                mess = "Good Afternoon ";


        String message = mess  + firstname +" "+ lastname;

        request.setAttribute("message", message);

        RequestDispatcher dispatcher = request.getRequestDispatcher("custom-hello.jsp");
        dispatcher.forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("hello-form.jsp");
        dispatcher.forward(request,response);



    }
}
