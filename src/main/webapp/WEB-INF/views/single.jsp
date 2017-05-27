<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@include file="UserHeader.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<div class="container">
	<div class="row">
   <div class="col-xs-6 item-photo">
<div>
<c:forEach var="product" items="${ProductDetails}">

			<img src="./resources/images/${product.productId}.jpg"
				style="width: 330px; height: 315px" />
				</c:forEach>
				</div>
				</div>
		
 <div class="col-xs-8" >
<div>

	
	
			<th><b>Product name:</b></th>
           
	
		<c:forEach var="product" items="${ProductDetails}">
			"${product.productname}"
			</c:forEach>
			</div>
<div>
 <th><b>Stock:</b></th>
<c:forEach var="product" items="${ProductDetails}">
       "${product.productstock}"
</c:forEach>
				</div>
				<div>
 <th><b>Product Description:</b></th>
<c:forEach var="product" items="${ProductDetails}">
       "${product.productdescription}"
</c:forEach>
				</div>
				
								<div>
 <th><b>Product Price:</b></th>
<c:forEach var="product" items="${ProductDetails}">
       "${product.productprice}"    
</c:forEach>
				</div>
		<div>
		<c:forEach var="product" items="${ProductDetails}">	
		
		
		
<tr><td>
			<form action="addcart" method="post">

					<input type="text"  readonly="readonly" name="pid" value="${product.productId}"/>
					<input type="text" name="quantity"/>
					<input type="submit" value="AddToCart"/>
		
				</form>
			</td></tr>

		</c:forEach>
	</table>
	</div>
	</div>
</div>
</body>
</html>
