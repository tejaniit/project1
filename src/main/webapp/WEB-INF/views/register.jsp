<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="UserHeader.jsp" %>
<form:form class="form-horizontal" method="post" action="register"	commandName="UserDetails" >
<center><tr>
   <td><h1>Registration Form</h1></td>
</tr><center>
<table>
<tr><td>UserName:</td><td><form:input path="userName"/></td></tr>
<tr><td>Password:</td><td><form:password path="password"/></td></tr>
<tr><td>Email:</td><td><form:input path="email"/></td></tr>
<tr><td>UserId:</td><td><form:input path="userId"/></td></tr>
<tr><td>name:</td><td><form:input path="name"/></td></tr>
<tr><td>mobile:</td><td><form:input path="mobile"/></td></tr>
 
<tr><td><input type="submit" value="Register"></td></tr>


</table>
</form:form>
</body>
</html>