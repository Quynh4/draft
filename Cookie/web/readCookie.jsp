<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Read Cookies</title>
    </head>
    <body>
        <h1>Read Cookies </h1>
        <%
        Cookie cookie = null;
        Cookie[] cookies = null;
        cookies = request.getCookies();
        if (cookies != null) {
         for (int i = 0; i < cookies.length; i++) {
          cookie = cookies[i];
          out.print("Name : " + cookie.getName() + ",  ");
          out.print("Value: " + cookie.getValue() + " <br/>");
         }
        } else {
         out.println("<h2>No cookies founds</h2>");
        }
        %>
    </body>
</html>