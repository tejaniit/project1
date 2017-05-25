<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="UserHeader.jsp" %>
<div>
<form action="perform_login" >
<center><tr>
   <td><h1><b><font face="Monotype corsiva" size="7">Login Form</font><br /></b></h1></td>
</tr><center>

<tr><td>&nbsp;</td></tr>
<table>
<tr><td><b><font face="Monotype corsiva" size="3">UserName:</font><br /></b></td><td> <input type="text" name="username" size="25"/></td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td><b><font face="Monotype corsiva" size="3">Password:</font><br /></b></td><td><input type="password" name="password"  size="25"/></td></tr>
<tr><td>&nbsp;</td></tr>

 
<tr><td><input type="submit" value="submit"></td></tr>
</form>
</div>

</body>
</html>
