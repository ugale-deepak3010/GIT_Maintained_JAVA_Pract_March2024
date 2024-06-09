<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center" >
	<h1>This is list Page!</h1>

	<h2>Expression Language:  214*512= ${214*512} </h2>

	<table border="100" >
		<tr>
			<th>Name</th>
			<th>Manufacturer</th>
			<th>Sku</th>
		</tr>

		<c:forEach items="${CaralogItem}" var="CaralogItem">
			<tr>
				<td>${CaralogItem.name }</td>
				<td>${CaralogItem.manufacturer }</td>
				<td>${CaralogItem.sku }</td>
			</tr>
		</c:forEach>

	</table>
</div>







</body>
</html>