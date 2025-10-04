<%-- 
    Document   : furnitureList
    Created on : Sep 28, 2025, 8:54:10 PM
    Author     : nofom
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome ${sessionScope.fullname}!</h1>
    </body>

    <form action="logout">
        <input type="submit" value="LOGOUT">
    </form>


    <form action="search">
        <input type="text" name="search"> <input type="submit" value="SEARCH"> 
    </form>

    <c:if test="${data != null}">
        <table border="1">
            <thead>
                <tr>
                    <th>No</th>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Price</th>
                    <th>Dimensions</th>
                    <th>Material</th>
                    <th>Status</th>
                    <th>Action</th>
                </tr>
            </thead>

            <tbody>
            <c:forEach items="${data}" var="o" varStatus="status">
                <% int i=0;%>
                <c:if test="${o.status !=0}"><tr>
                        <td>${status.count}</td>
                        <td>${o.id}</td>
                        <td>${o.name}</td>
                        <td>${o.description}</td>
                        <td>${o.price}</td>
                        <td>${o.dimensions}</td>
                        <td>${o.material}</td>
                        <td>${o.status}</td>
                        <td><a href="delete?id=${o.id}">Delete</a></td>
                    </tr>

                </c:if>

            </c:forEach>
            </tbody>
        </table>


    </c:if>
</html>
