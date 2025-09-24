<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--<form action="max" method="post">-->
<form method="post">
    <table>
        <tbody>
            <tr>
                <td>Enter a string(str): </td>
                <td><input type="text" name="str" value="${str}"></td>
            </tr>
            <tr>
                <td>Result: </td>
                <td><input type="text" name="re" value="${re}" readonly=""></td>
            </tr>
            <tr>
                <td><input type="submit" value="MAX WORD" formaction="max">
                    <!--<input type="submit" value="SORT" formaction="sort">-->
                    <input type="button" value="SORT" onclick="goSort()">
                </td>
                <td>${err}</td>
            </tr>
        </tbody>
    </table>
</form>






<table border="1">
    <thead>
        <tr>
            <th>String str</th>
            <th>Result</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${sessionScope.list}" var="o">
            <tr>
                <td>${o.str}</td>
                <td>${o.re}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>


<script>
    function goSort() {
        let form = document.forms[0]; // l?y form ??u tiên
        form.action = "sort";         // ??i action
        form.submit();                // submit form
    }
</script>
