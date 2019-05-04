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
    <title>Edit Students</title>
</head>
<body>
<h1> Edit Students </h1>

<a href="/students">Back to students list</a>
<p>
    <form method="post">
    <fiealdset>
        <legend>Student information</legend>
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
                <td>Age: </td>
                <td><input type=" text" name ="age" id="age" value="${requestScope}"></td>
            </tr>

            <tr>
                <td>Sex: </td>
                <td><input type="text" name="sex" id="sex" value="${requestScope}" ></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><input type="text" name="address" id="address" value="${requestScope}" ></td>
            </tr>
            <tr>
                <td>Classmate: </td>
                <td><input type="text" name="classmate" id="classmate" value="${requestScope}" ></td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" value="Update Student" ></td>
            </tr>
        </table>
    </fiealdset>
</form>
</p>
</body>
</html>
