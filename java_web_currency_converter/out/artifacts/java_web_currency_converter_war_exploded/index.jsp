<%--
  Created by IntelliJ IDEA.
  User: SANG HUNG
  Date: 3/4/2019
  Time: 3:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  <body>
  <h2>Product Discount Calculator</h2>
  <form action ="/display_discount" method="post">
    <label>Product Description</label><br>
    <input type="text" name = "description" placeholder="Enter your description"><br>
    <label>List Price: </label><br>
    <input type="text" name ="price" placeholder="Enter list price"><br>
    <label>Discount Percent</label>
    <input type="text" name ="percent" placeholder="Enter discount percent"><br>
    <input type ="submit" id="submit" value ="calculateDiscount">
  </form>
  $END$
  </body>
</html>
