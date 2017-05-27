 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="UserHeader.jsp" %>
<form:form class="form-horizontal" method="GET" action="products"	commandName="ProductDetails" enctype="multipart/form-data" >

<table class="table table-bordered table-hover table-striped">
 <tr><th>Product Id</th>
<th>Product name</th>
<th>Supplier Id</th>
<th>Category Id</th>
<th>Price</th>
<th>Description</th>

<th>Image</th>
</tr> 
<c:forEach items="${Prodata}" var="product">
<tr class="success" >

                <td>${product.productId}</td> 
                 <td>${product.productname}</td>
                  <td>${product.supId}</td>
                <td> ${product.catId}</td>
                <td>${product.productprice}</td>
                 <td>${product.productdescription}</td>
                 
   
                              
                <td><a href="getimg?gimg=${product.productId}">
                <img src="./resources/images/${product.productId}.jpg" height="50px" width="50px"/></a></td> 
                
                   
                
</tr>
</c:forEach>
</table>
</form:form>
</body>
</html>