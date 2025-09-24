<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Another page</title>
    </head>
    <body>
        <jsp:useBean class="bean.users" id="user" scope="session"/>
        <h1>Result View!</h1>
        <jsp:getProperty name="user" property="name"/>
    </body>
</html>