<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@include file="UserHeader.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<c:forEach var="product" items="${ProductDetails}">
<th><b><h1> Product Image</h1></b></th>
			<td><img src="resources/images/${product.productId}.jpg"
				style="width: 330px; height: 315px" /></td>
				</c:forEach>
				</div>

<div>

	<table class="table table-bordered table-hover table-striped">
		<tr>
			<th>Product name</th>
           
		</tr>
		<c:forEach var="product" items="${ProductDetails}">
			<td>"${product.productname}"</td>
			</c:forEach>
			</div>
<div>
 <tr><th>Stock</th></tr>
<c:forEach var="product" items="${ProductDetails}">
       <td>${product.productstock}</td>      
</c:forEach>
				</div>
				<div>
 <tr><th>Product Description</th></tr>
<c:forEach var="product" items="${ProductDetails}">
       <td>${product.productdescription}</td>      
</c:forEach>
				</div>
				
								<div>
 <tr><th>Product Price</th></tr>
<c:forEach var="product" items="${ProductDetails}">
       <td>${product.productprice}</td>     
</c:forEach>
				</div>
		<div>
		<c:forEach var="product" items="${ProductDetails}">
			<tr><td>
				<form action="AddToCart">

					<input type="eladprod1" name="dpid1" value=${product.productId } /><br/>
					
				<input type="submit" value="AddToCart" />
				</form>
			</td></tr>

		</c:forEach>
	</table>
	
</div>
</body>
</html>
