<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customers</title>
</head>
<body>

<h1>Welcome</h1>

Hello

<br><br>


<form action="AddCustomerInDB" method="post" >
Enter the Customer Id:<input type="text" name="cId" ><br>
Enter the Customer Name:<input type="text" name="cName" ><br>
Enter the Customer Email:<input type="email" name="cEmail" ><br>
<input type="submit" value="Add Customer"><br>
</form>


</body>
</html>