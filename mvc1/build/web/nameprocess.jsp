<%@page import=" bean.users "%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Processing your name</title>
    </head>
    <body>
        <h1>Hello Controller!</h1>
        <jsp:useBean class="bean.users" id="user" scope="session" />
        <jsp:setProperty name="user" property="name" param="ten" />
        <a href="another.jsp"> Another page</a>
    </body>
</html>

<!--bean = model = object-->