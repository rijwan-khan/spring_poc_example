<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<form:form action="/update" method="post" modelAttribute="edit">
<tr>
<td>SNO:</td>
<td><form:input type="text" path="sno" /></td>
</tr>
<tr>
<td>NAME:</td>
<td><form:input type="text" path="name" /></td>
</tr>
<tr>
<td>EMAIL:</td>
<td><form:input type="text" path="email"  /></td>
</tr>
<tr>
<td>PHON:</td>
<td><form:input type="text" path="phonNo" /></td>
</tr>
<td colspan = "2">
<input type="submit" value="submit"><br>
</td>
</form:form> 
<a href="/all">View All Contact</a><br>

</table>
</body>

</html>