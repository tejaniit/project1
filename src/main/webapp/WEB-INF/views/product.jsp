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
<%@ include file="admin.jsp" %>

<form:form class="form-horizontal" method="post" action="product"	commandName="ProductDetails" enctype="multipart/form-data" >
<center><tr>
   <td><h1>Product Form</h1></td>
</tr><center>

<tr><td>&nbsp;</td></tr>

<table>
<tr><td><b>ProductId:</b></td><td><form:input path="productId" size="25"/></td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td><b>productName:</b></td><td><form:input path="productname" size="25"/></td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td><b>productDescription:</b></td><td><form:input path="productdescription" size="25"/></td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td><b>productPrice:</b></td><td><form:input path="productprice" size="25"/></td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td><b>productStock:</b></td><td><form:input path="productstock" size="25"/></td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td><b>SupplierName</b><form:select class="form-control" path="supId">
<form:option value="-1">select supplier name</form:option>
<c:forEach items="${SupData}" var="sup">
<form:option value=" ${sup.supplierId}">${sup.supplierName}</form:option>

</c:forEach>
</form:select></tr></td>
<tr><td>&nbsp;</td></tr>
<tr><td><b>CategoryName</b><form:select class="form-control" path="catId">
<form:option value="-1">select category name</form:option>
<c:forEach items="${CatData}" var="cat">
<form:option value=" ${cat.categoryId}">${cat.categoryName}</form:option>
</c:forEach>
<tr><td>&nbsp;</td></tr>
</form:select></tr></td>
<tr><td><b>Image</b>
<form:input type="file" path="pimage"/></td></tr>

<tr><td>&nbsp;</td></tr>
 
<tr><td><input type="submit" value="${bname}"></td></tr>


</table>
</form:form> 

<table class="table table-bordered table-hover table-striped">
 <tr><th>Product Id</th>
<th>Product name</th>
<th>Supplier Id</th>
<th>Category Id</th>
<th>Price</th>
<th>stock</th>
<th>Description</th>
<th>Edit</th>
<th>Delete</th>
<th>Image</th>
</tr> 
<c:forEach items="${Prodata}" var="product">
<tr class="success" >

                <td>${product.productId}</td> 
                 <td>${product.productname}</td>
                  <td>${product.supId}</td>
                <td> ${product.catId}</td>
                <td>${product.productprice}</td>
                <td>${product.productstock}</td>
                 <td>${product.productdescription}</td>
                 
               
                    
                     <td><a href="deladprod1?adpid1=${product.productId}">Edit</a></td>
                <td><a href="deladprod?adpid=${product.productId}">Delete</a></td>
                <td><img src="./resources/images/${product.productId}.jpg" height="50px" width="50px"/></td> 

</tr>
</c:forEach>

</table>
</body>
</html>