<%--
  Created by IntelliJ IDEA.
  User: SANG HUNG
  Date: 4/3/2019
  Time: 9:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h1>Email Validate</h1>

<h3 style="color:red">${message}</h3>

<form action="validate" method="post">

    <input type="text" name="email"><br>

    <input type="submit" value="Validate">

</form>