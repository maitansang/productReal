<%--
  Created by IntelliJ IDEA.
  User: SANG HUNG
  Date: 4/4/2019
  Time: 10:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Student</title>
</head>
<body>
<h1> Student detail</h1>
    <p>
        <a href="/students">Back to Student list</a>
    </p>
<table>
    <tr>
        <td>Id:</td>
        <td>${student.id}</td>
    </tr>
    <tr>
        <td>Name:</td>
        <td>${student.name}</td>
    </tr>
    <tr>
        <td>Age:</td>
        <td>${student.age}</td>
    </tr>
    <tr>
        <td>Address:</td>
        <td>${student.address}</td>
    </tr>
    <tr>
    <td>Sex:</td>
    <td>${student.sex}</td>
    <tr>
        <td>Classmate:</td>
        <td>${student.classmate}</td>
    </tr>
    </tr>
</table>
</body>
</html>
