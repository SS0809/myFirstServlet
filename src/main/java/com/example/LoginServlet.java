package com.example;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import org.json.JSONObject;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // Read JSON body
        BufferedReader reader = request.getReader();
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }

        // Parse JSON
        JSONObject jsonRequest = new JSONObject(sb.toString());
        String username = jsonRequest.optString("username");
        String password = jsonRequest.optString("password");

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