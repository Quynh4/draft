<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Login Form</title>
    </head>
    <body>
        <%
         Cookie[] cookies = request.getCookies();
        String username = "";
        String password = "";
        if (cookies != null) {
         for (int i = 0; i < cookies.length; i++) {
          Cookie cookie = cookies[i];
          if (cookie.getName().equals("username-cookie")) {
         username = cookie.getValue();
          } else if (cookie.getName().equals("password-cookie")) {
         password = cookie.getValue();
          }
         }
        }
        %>
        <form name="logonform" action="homePage.jsp" method="POST">
            Username: <input type="text" name="username" value="<%=username%>" />
            <br /> <br/>Password:<input type="password" name="password"
                                        value="<%=password%>" /> <br /> <br/>Remember Me<input type="checkbox"
                                        name="rememberMe" value="true" /> <br/><br/><input type="submit" value="Submit" />
        </form>
    </body>
</html>