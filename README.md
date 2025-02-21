# My Servlet Application

This project is a simple Java web application that demonstrates the use of servlets. It includes a servlet that handles both GET and POST requests, a JSP page as the entry point, and a deployment descriptor for servlet configuration.


## Features

- **MyServlet.java**: A servlet that processes HTTP requests.
- **web.xml**: The deployment descriptor that maps the servlet to a URL pattern.
- **index.jsp**: The main entry point of the application, providing a user interface.

## Getting Started
   ```
   mvn test tomcat7:run           
   ```

    @ECHO OFF
    cd /nginx
    taskkill /f /IM nginx.exe
    start nginx
    EXIT

    C:\nginx\conf\nginx.conf

    location /proxy/ {
        proxy_pass http://localhost:8080/;
    }


    curl --location 'http://localhost:8080/login' \
    --header 'Content-Type: application/json' \
    --data '{
    "username":"admin",
    "password":"saurabh"
    }'