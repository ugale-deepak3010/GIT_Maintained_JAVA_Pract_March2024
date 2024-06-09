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

	<h1>Welcome ${name}</h1>


	<h2>Total items count: ${items.size}</h2>

	<table border="5px">
		<thead>
			<td>name</td>
			<td>manufacturer</td>
			<td>sku</td>
		</thead>


		<c:forEach items="${items}" var="items">

			<tr>
				
				<td>
					<c:out value="${items.name}"></c:out>
				</td> 
				<!-- it will prevent to inject script -->
				
				<!--<td>${items.name}</td> -->
				<td>${items.manufacturer}</td>
				<td>${items.sku}</td>
			</tr>

		</c:forEach>

	</table>

</body>
</html>