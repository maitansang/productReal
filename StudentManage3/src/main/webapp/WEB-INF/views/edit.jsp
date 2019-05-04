<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

    <fiealdset>
        <legend>Student information</legend>
        <table>
<form:form action="/editStudent" method="post" modelAttribute="student">

            <tr>
                <td>ID: </td>
                <td><input type=" text" name ="id" id="id" value="${student.id}"></td>
            </tr>

            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name" value="${student.name}" ></td>
            </tr>

            <tr>
                <td>Age: </td>
                <td><input type=" text" name ="age" id="age" value="${student.age}"></td>
            </tr>

            <tr>
                <td>Sex: </td>
                <td><input type="text" name="sex" id="sex" value="${student.sex}" ></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><input type="text" name="address" id="address" value="${student.address}" ></td>
            </tr>
            <tr>
                <td>Classmate: </td>
                <td><input type="text" name="classmate" id="classmate" value="${student.classmate}" ></td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" value="Update Student" ></td>
            </tr>
    </form:form>
        </table>
    </fiealdset>
</form>
</p>
</body>
</html>
