<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ include file="UserHeader.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
CART.JSP
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table class="table table-bordered table-hover table-striped">
<tr><th>Cart Id</th>
<th>Product Id</th>
<th>Product name</th>
<th>Product Price</th>
<th>Total Price</th>
<th>Image</th>
</tr>
<core:forEach items="${CartData}" var="cart">
<tr class="success">
                 <td>${cart.cartId}</td>
                 <td>${cart.proId}</td>
                 <td>${cart.proName}</td>
                 <td>${cart.proPrice}</td>
                 <td>${cart.totalPrice}</td>
 <td><img src="./resources/images/${cart.proId}.jpg" height="75px" width="75px"/></td>
 </tr>
 </core:forEach>                
</table>
</body>
</html>