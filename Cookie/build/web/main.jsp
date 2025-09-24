<%
// Create cookies for first and last names.      
Cookie firstName = new Cookie("first_name", request.getParameter("first_name"));
Cookie lastName = new Cookie("last_name", request.getParameter("last_name"));

// Set expiry date after one hour for both the cookies.
firstName.setMaxAge(60 * 60);
lastName.setMaxAge(60 * 60);

// Add both the cookies in the response header.
response.addCookie(firstName);
response.addCookie(lastName);
%>
<html>
    <body>
        <h1>Setting Cookies</h1>
        <ul>
            <b>First Name:</b><%=request.getParameter("first_name")%><br /><br/>
            <b>Last Name:</b><%=request.getParameter("last_name")%>
    </body>
</html>