<%-- 
    Document   : login
    Created on : Sep 28, 2025, 8:36:29 PM
    Author     : nofom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <form action="login" method="post">

            <table border="0">
                <tbody>
                    <tr>
                        <td>User ID</td>
                        <td><input type="text" name="userID" value="${userID}"></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password" value="${password}"></td>
                    </tr>
                    
                    <tr>
                        <td><input type="submit" value="LOGIN"/></td>
                        <td>${err}</td>
                    </tr>
                </tbody>

            </table>

            
        </form>


    </body>
</html>
