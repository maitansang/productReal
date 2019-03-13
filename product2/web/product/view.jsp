<%--
  Created by IntelliJ IDEA.
  User: SANG HUNG
  Date: 3/13/2019
  Time: 1:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Product</title></title>
</head>
<body>
<h1>Product detail</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>Name:</td>
        <td>${requestScope["product"].getName()}</td>
    </tr>
     <tr>
         <td>ID:</td>
         <td>${requestScope["product"].getID()}</td>
     </tr>
    <tr>
        <td>Price:</td>
        <td>${requestScope["product"].getPriceO()}</td>
    </tr>
    <tr>
        <td>Describe:</td>
        <td>${requestScope["product"].getDescribe}</td>
    </tr>
</table>
</body>
</html>
