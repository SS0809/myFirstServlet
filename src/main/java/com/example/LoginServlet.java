package com.example;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello from Login - GET method</h1>");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        String username = request.getHeader("username");
        String password = request.getHeader("password");
        JSONObject jsonResponse = new JSONObject();

        if ("admin".equals(username) && "saurabh".equals(password)) {
            jsonResponse.put("status", "success");
            jsonResponse.put("message", "Login successful");
        } else {
            jsonResponse.put("status", "error");
            jsonResponse.put("message", "Invalid username or password");
        }

        response.getWriter().write(jsonResponse.toString());
    }
}

