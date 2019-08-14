<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
.error
{
color:red;
}
</style>
<title>Customer Form</title>
</head>
<body>
<h1>Customer Form</h1>
<form:form action="processForm" modelAttribute="customer">
Name:<form:input path="name"/>
<form:errors path="name" cssClass="error"/>
<br /><br />
Country:
<form:select path="country">
<form:options items="${customer.countryList}"/>
</form:select>
<br /><br />
<fieldset>
<form:radiobuttons path="favCuisine" items="${customer.favCuisineList}"/>
</fieldset>
<legend>Select books to buy</legend>

<form:checkbox path="books" value="Breif History of Time"/>Brief History of Time
<form:checkbox path="books" value="Think and Grow Rich"/>Think and Grow Rich
<form:checkbox path="books" value="Rich Dad Poor Dad"/>Rich Dad Poor Dad
<form:checkbox path="books" value="Harry Potter"/>Harry Potter
<form:checkbox path="books" value="The power of + thinking"/>The power of Positive thinking

<br/> <br/>
<form:label path="">
Number of discount coupons:
<form:input path="discountCoupons"/>
</form:label>
<form:errors path="discountCoupons" cssClass="error"/>
<form:errors path="books" cssClass="error"/>
<button type="submit">Submit</button>
</form:form>

</body>
</html>