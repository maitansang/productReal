<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: SANG HUNG
  Date: 3/11/2019
  Time: 7:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit product</title>
</head>
<body>
<h1> Edit product </h1>
<p>
    <c:if  test='${ requestScope["message"]!= null}'>
        <span class = "message">${requestScope["message"]}</span>
    </c:if>
</p>
<a href="/products">Back to products list</a>
<p>
    <form method="post">
    <fiealdset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>ID: </td>
                <td><input type=" text" name ="id" id="id" value="${requestScope}"></td>
            </tr>

            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name" value="${requestScope}" ></td>
            </tr>

            <tr>
                <td>Price: </td>
                <td><input type=" text" name ="price" id="price" value="${requestScope}"></td>
            </tr>

            <tr>
                <td>Describe: </td>
                <td><input type="text" name="describe" id="describe" value="${requestScope}" ></td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" value="Update Product" ></td>
            </tr>
        </table>
    </fiealdset>
</form>
</p>
</body>
</html>
