<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> customer Details</h1>
Customer Name:${customer.name}
<br/><br/>
	Country:${customer.country}
	<br/><br/>
	Favorite Cuisine:${customer.favCuisine}
	<br/><br/>
	<c:forEach var="book" items="${customer.books}">
	<li>${book}</li>
	</c:forEach>
	<br/><br/>
	Discount Coupons:${customer.discountCoupons}
</body>
</html>