<%@page import=" bean.LoginBean "%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page Login</title>
        <style>
            .title{
                margin: 20 px auto;
                font-size: 20px;
                font-weight: bold;
                width: 320px
            }
            .titlep{
                margin-top: 50px
            }
        </style>

    </head>
    <body>
        <form action="login-success.jsp" method="post"

              <%--<jsp:useBean id="bean" class="bean.LoginBean" scope="request" />--%>
              <h3>
            Welcome <a style="color: rgb(37, 232, 230); margin: center"/>
            
            <%--<%=bean.getName()%>--%>
            ${bean.name}
            <%@include file="index.html" %></h3>
    </form>

</body>
</html>