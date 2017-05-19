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
<form:form class="form-horizontal" method="post" action="cate"	commandName="CategoryDetails" >
<center><tr>
   <td><h1>Category Form</h1></td>
</tr><center>
<table>
<tr><td>CategoryId:</td><td><form:input path="categoryId"/></td></tr>
<tr><td>CategoryName:</td><td><form:input path="categoryName"/></td></tr>
<tr><td>CategoryDescription:</td><td><form:input path="categoryDescription"/></td></tr>

 
<tr><td><input type="submit" value="submit"></td></tr>


</table>
</form:form>


<table class="table table-bordered table-hover table-striped">
 <tr><th>Category Id</th>
<th>Category Name</th>
<th>Category Description</th>

<th>Edit</th>
<th>Delete</th>

</tr> 
<c:forEach items="${CatData}" var="category">
<tr class="success" >

                <td>${category.categoryId}</td> 
                 <td>${category.categoryName}</td>
                  <td>${category.categoryDescription}</td>
                
                
                     <td><a href="UpdateAdmprod?adpid=${category.categoryId}">Edit</a></td>
                <td><a href="deladcat?adcid=${category.categoryId}">Delete</a></td>
                
</tr>
</c:forEach>

</table>
</body>
</html>