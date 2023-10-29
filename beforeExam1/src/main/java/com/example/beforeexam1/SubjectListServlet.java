package com.example.beforeexam1;

import com.example.beforeexam1.entities.Subject;
import com.example.beforeexam1.repositories.SubjectRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SubjectListServlet", value = "/subjects")

public class SubjectListServlet extends HttpServlet {

    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SubjectRepository sr = new SubjectRepository();

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Subject List :: </h1>");
        out.println("<table>");
        out.println("<tr>");
        out.println("<td>Subject Id</td><td>Subject Title</td<td>Credit</td>");
        for(Subject subject : sr.findAll()){
            out.println("<tr>");
            out.println("<td>" + subject.getId() +"</td>");
            out.println("<td>" + subject.getTitle() +"</td>");
            out.println("<td>" + subject.getCredit() +"</td>");
        }
        out.println("</table>");
        out.println("</body></html>");
    }

    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}