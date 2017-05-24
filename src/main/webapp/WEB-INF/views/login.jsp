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
<div>
<form:form class="form-horizontal" method="get" action="logn"	commandName="UserCredentials" >
<center><tr>
   <td><h1>Login Form</h1></td>
</tr><center>

<tr><td>&nbsp;</td></tr>


<table>
<tr><td><b>UserName:</b></td><td><form:input path="userName" size="25"/></td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td><b>Password:</b></td><td><form:input path="password" type="password" size="25"/></td></tr>
<tr><td>&nbsp;</td></tr>

 
<tr><td><input type="submit" value="submit"></td></tr>
</form:form>
</div>

</body>
</html>
