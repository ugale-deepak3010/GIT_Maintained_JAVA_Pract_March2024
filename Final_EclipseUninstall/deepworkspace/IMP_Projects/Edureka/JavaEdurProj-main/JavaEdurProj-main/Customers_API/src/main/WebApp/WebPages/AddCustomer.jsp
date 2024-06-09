<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h1>Add Customer</h1>


	<form action="AddCustomerRecord" method="post">

		<input placeholder="Customer Id" type="text" name="cid"> <br>
		<input placeholder="Customer Name" type="text" name="cname">
		<br> <input placeholder="Customer Email" type="email"
			name="cemail"> <br> 
		<input type="submit"
			value="Add Customer">
	</form>

</body>
</html>