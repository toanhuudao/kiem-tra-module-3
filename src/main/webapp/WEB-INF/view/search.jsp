<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: adminn
  Date: 11/11/2020
  Time: 11:03 AM
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
        <c:forEach items="${searchList}" var="p">
            <tr>
                <td>${p.pID}</td>
                <td>${p.pName}</td>
                <td>${p.price}</td>
                <td>${p.quantity}</td>
                <td>${p.color}</td>
                <td>${p.category}</td>
                <td><a href="/updatepageforward?pID=${product.pID}"> <button>sua</button></a></td>
                <td><a href="/deleteController?pID=${product.pID}"> <button>xoa</button></a></td>
            </tr>
        </c:forEach>


        </tbody>
    </table>


</div>

</body>
</html>