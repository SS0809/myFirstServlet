# My Servlet Application

This project is a simple Java web application that demonstrates the use of servlets. It includes a servlet that handles both GET and POST requests, a JSP page as the entry point, and a deployment descriptor for servlet configuration.

## Project Structure

```
my-servlet-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── MyServlet.java
│   │   └── webapp
│   │       ├── WEB-INF
│   │       │   └── web.xml
│   │       └── index.jsp
├── pom.xml
└── README.md
```

## Features

- **MyServlet.java**: A servlet that processes HTTP requests.
- **web.xml**: The deployment descriptor that maps the servlet to a URL pattern.
- **index.jsp**: The main entry point of the application, providing a user interface.

## Getting Started

1. Clone the repository:
   ```
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```
   cd my-servlet-app
   ```

3. Build the project using Maven:
   ```
   mvn clean install
   ```

4. Deploy the application to a servlet container (e.g., Apache Tomcat).

5. Access the application in your web browser:
   ```
   http://localhost:8080/my-servlet-app/
   ```

## Dependencies

This project uses Maven for dependency management. Please refer to the `pom.xml` file for the list of dependencies required for the project.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.