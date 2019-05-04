<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<html>
<head>
    <title>Create new Student</title>
    <style>
        .message{
            color: green;
        }
    </style>
</head>
<body>
<h> Create new product</h>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/students">Back to student list</a>
</p>

        <legend>Student information</legend>
        <table>
            <form:form action="/create" method="post" modelAttribute="student">
            <tr>
                <td>Id:</td>
                <td><input type="text" name="id" id="=id"></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" id="=name"></td>
            </tr>
            <tr>
                <td>Age:</td>
                <td><input type="text" name="age" id="age"></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><input type="text" name="address" id="address"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create Address"></td>
            </tr>

</form:form>
</body>
</html>