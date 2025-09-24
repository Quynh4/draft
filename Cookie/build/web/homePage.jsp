<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Display Details</title>
    </head>
    <body>
        <%
         String username = request.getParameter("username");
        String password = request.getParameter("password");
        String message = "Username is : " + username + "<br/> Password is :" + password;
        String rememberMe = request.getParameter("rememberMe");
        if (rememberMe != null) {
         Cookie usernameCookie = new Cookie("username-cookie", username);
         Cookie passwordCookie = new Cookie("password-cookie", username);
         usernameCookie.setMaxAge(24 * 60 * 60);
         passwordCookie.setMaxAge(24 * 60 * 60);
         response.addCookie(usernameCookie);
         response.addCookie(passwordCookie);
        }
        %>
        <strong> <%=message%>
        </strong>
    </body>
</html>