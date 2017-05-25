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
   <td><h1><font face="Monotype corsiva" size="7">Registration Form</font><br /></h1></td>
</tr><center>
<tr><td>&nbsp;</td></tr>
<table>
<tr><td><b><font face="Monotype corsiva" size="3">UserName:</font><br /></b></td><td><form:input path="username"  size="35"/></td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td><b><font face="Monotype corsiva" size="3">Password:</font><br /></b></td><td><form:password path="password" size="35"/></td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td><b><font face="Monotype corsiva" size="3">Email:</font><br /></b></td><td><form:input path="email" size="35"/></td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td><b><font face="Monotype corsiva" size="3">UserId</font><br /></b></td><td><form:input path="userId" size="35"/></td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td><b><font face="Monotype corsiva" size="3">Name:</font><br /></b></td><td><form:input path="name" size="35"/></td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td><b><font face="Monotype corsiva" size="3">Mobile:</font><br /></b></td><td><form:input path="mobile" size="35"/></td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td><input type="submit" value="Register"></td></tr>


</table>
</form:form>
<%@ include file="footer.jsp" %>
</body>
</html>