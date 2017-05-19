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
<form:form class="form-horizontal" method="post" action="supp"	commandName="SupplierDetails" >
<center><tr>
   <td><h1>Supplier Form</h1></td>
</tr><center>
<table>
<tr><td>SupplierId:</td><td><form:input path="supplierId"/></td></tr>
<tr><td>SupplierName:</td><td><form:input path="supplierName"/></td></tr>
<tr><td>SupplierDescription:</td><td><form:input path="supplierDescription"/></td></tr>

 
<tr><td><input type="submit" value="submit"></td></tr>


</table>


<table class="table table-bordered table-hover table-striped">
 <tr><th>SupplierId</th>
<th>Supplier Name</th>
<th>Supplier Description</th>

<th>Edit</th>
<th>Delete</th>

</tr> 
<c:forEach items="${SupData}" var="supplier">
<tr class="success" >

                <td>${supplier.supplierId}</td> 
                 <td>${supplier.supplierName}</td>
                  <td>${supplier.supplierDescription}</td>
                
                
                     <td><a href="UpdateAdmprod?adpid=${supplier.supplierId}">Edit</a></td>
                <td><a href="deladsup?adsid=${supplier.supplierId}">Delete</a></td>
                
</tr>
</c:forEach>

</table>


</form:form>
</body>
</html>