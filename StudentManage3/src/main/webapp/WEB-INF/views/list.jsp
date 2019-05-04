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
    <a href="${pageContext.request.contextPath}/createStudent">Create new student</a>
<form action="/searchStudent" method="post">
    <h3>Search</h3>
    <input type="text" id="id">
</form>

</p>
<form action="/list" method="post">
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
    <c:forEach items='${requestScope["students"]}' var="student">
        <tr>
            <td><a href="/view?id=${student.getId()}">${student.getId()}</a></td>
            <td>${student.getName()}</td>
            <td>${student.getAge()}</td>
            <td>${student.getAddress()}</td>
            <td>${student.isSex()}</td>
            <td>${student.getClassmate()}</td>
            <td><a href="/edit?id=${student.getId()}">edit</a></td>
            <td><a href="/delete?id=${student.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</p>
</form>

</body>
</html>