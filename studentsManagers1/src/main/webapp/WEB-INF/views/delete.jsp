<%--
  Created by IntelliJ IDEA.
  User: SANG HUNG
  Date: 3/13/2019
  Time: 2:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleting product</title>
</head>
<body>
<h1>Delete product</h1>
<p>
    <a href="/students">Back to students list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Student information</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td>${requestScope["student"].getName()}</td>
            </tr>
            <tr>
                <td>ID:</td>
                <td>${requestScope["student"].getId()}</td>
            </tr>
            <tr>
                <td>age:</td>
                <td>${requestScope["student"].getAge()}</td>
            </tr>
            <tr>
                <td>Address:</td>
                <td>${requestScope["student"].getAddress()}</td>
            </tr>
            <tr>
                <td>Sex:</td>
                <td>${requestScope["student"].getSex()}</td>
            </tr>
            <tr>
                <td><input type="submit" value ="Delete student"></td>
                <td><a href="/students">Back to student list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
