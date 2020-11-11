<%--
  Created by IntelliJ IDEA.
  User: adminn
  Date: 11/10/2020
  Time: 9:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Form control: input</h2>
    <p>The form below contains two input elements; one of type text and one of type password:</p>
    <form action="/updatecontroller">

        <div class="form-group">
            <label >pID:</label>
            <input type="text" class="form-control"  name="pID">
        </div>
        <div class="form-group">
            <label >Name:</label>
            <input type="text" class="form-control"  name="pName">
        </div>
        <div class="form-group">
            <label >price:</label>
            <input type="text" class="form-control"name="price">
        </div>
        <div class="form-group">
            <label >quantity:</label>
            <input type="text" class="form-control"  name="quantity">
        </div>
        <div class="form-group">
            <label >color:</label>
            <input type="text" class="form-control"  name="color">
        </div>
        <div class="form-group">
            <label >categoryID</label>
            <input type="text" class="form-control"  name="categoryID">
        </div>

        <div class="form-group">
            <label >submit:</label>
            <input type="submit" class="form-control"  name="xac nhan">
        </div>







    </form>
</div>

</body>
</html>

