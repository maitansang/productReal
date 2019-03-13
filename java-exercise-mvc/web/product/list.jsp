<%--
  Created by IntelliJ IDEA.
  User: SANG HUNG
  Date: 3/8/2019
  Time: 9:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
    <h1>Product</h1>
    <p>
        <table border="1">
        <tr>
            <td>Name</td>
            <td>ID</td>
            <td>Function</td>
        </tr>
        <c:forEach items='${requestScope["products"]}' var ="product">
            <tr>
                <td>${product.getName()} </td>
                <td>${product.getID()}</td>
                <td>${product.getFunction()}</td
            </tr>
        </c:forEach>

</table>
    </p>

</body>
</html>
