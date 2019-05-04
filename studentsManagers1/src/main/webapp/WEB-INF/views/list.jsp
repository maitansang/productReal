<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%--
  Created by IntelliJ IDEA.
  User: Huy Coc
  Date: 10/03/2019
  Time: 2:44 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students List</title>
</head>
<body>
<h1>Student List </h1>
<p>
    <a href="/students?action=create">Create new student</a>
</p>
<p>
<table border="10">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Age</td>
        <td>Address</td>
        <td>Sex</td>
        <td>Classmate</td>
    </tr>
    <c:forEach items='${requestScope["students"]}' var="">
        <tr>

            <td><a href="students?action=view&id${student.getId()}">${student.getName()}</a></td>
            <td>${student.getAge()}</td>
            <td>${student.getAddress()}</td>
            <td>${student.getClassmate()}</td>
            <td><a href="/students?action=edit&id=${student.getId()}">edit</a></td>
            <td><a href="/students?action=delete&id=${student.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</p>
</body>
</html>