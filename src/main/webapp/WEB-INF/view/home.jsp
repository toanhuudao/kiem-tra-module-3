<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: adminn
  Date: 11/10/2020
  Time: 8:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>pID</th>
            <th>Name</th>
            <th>price</th>
            <th>quantity</th>
            <th>color</th>
            <th>category</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${productList}" var="product">
            <tr>
                <td>${product.pID}</td>
                <td>${product.pName}</td>
                <td>${product.price}</td>
                <td>${product.quantity}</td>
                <td>${product.color}</td>
                <td>${product.category}</td>
                <td><a href="/updatepageforward?pID=${product.pID}"> <button>sua</button></a></td>
                <td><a href="/deleteController?pID=${product.pID}"> <button>xoa</button></a></td>
            </tr>
        </c:forEach>

        <a href="/addproductforward"><button>them sp</button></a>



        </tbody>
    </table>

    <form action="/searchcontroller">
        tim kiem:  <input type="text" name="search">
        <br>
        <input type="submit" value="tim kiem">

    </form>
</div>

</body>
</html>

