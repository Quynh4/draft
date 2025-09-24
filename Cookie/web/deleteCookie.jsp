<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Delete Cookies</title>
    </head>
    <body>
        <h1>Delete Cookies</h1>
        <%
         Cookie cookie = null;
        Cookie[] cookies = null;
        cookies = request.getCookies();
        if (cookies != null) {
         for (int i = 0; i < cookies.length; i++) {
          cookie = cookies[i];
          if ((cookie.getName()).compareTo("first_name") == 0) {
         cookie.setMaxAge(0);
         response.addCookie(cookie);
         out.print("Deleted cookie: " + cookie.getName() + "<br/>");
          }
          out.print("Name : " + cookie.getName() + ",  ");
          out.print("Value: " + cookie.getValue() + " <br/>");
         }
        }
        %>
    </body>
</html>
