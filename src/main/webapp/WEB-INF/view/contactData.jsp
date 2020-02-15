<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><font color="red">Show contact details</font></h1>
<a href="/all">View All Contact</a><br>
<a href="/info">HOME</a><br>

<c:choose><c:when test="${!emptylist}">
<table border="1">
<tr>
<th>SNO</th>
<th>NAME</th>
<th>EMAIL</th>
<th>PHONNO</th>
<th>ACTIVE</th>
</tr>
<c:forEach items="${list}" var="ob">
<tr>
<td>${ob.sno}</td>
<td>${ob.name}</td>
<td>${ob.email}</td>
<td>${ob.phonNo}</td>
<td><a href="edit?sno=${ob.sno}">EDIT</a></td>
<td><a href="delete?sno=${ob.sno}">DELETE</a></td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h4>No Data Found</h4>
</c:otherwise>
</c:choose>

 
</body>
</html>