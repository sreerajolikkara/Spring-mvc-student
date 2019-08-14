<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
	.error {
		color: red;
	}
</style>
<title>Student JSTL Form</title>
</head>
<body>
	<form:form action="processStudentFormV2" modelAttribute="student">
	
		<form:label path="">
			Firstname: 
			<form:input path="firstName"/>
		</form:label>
		<br /><br />
		<form:label path="">
			Lastname: 
			<form:input path="lastName"/>
		</form:label>
		<br /><br />
		<form:label path="">
			Course ID: 
			<form:input path="courseId"/>
			<form:errors path="courseId" cssClass="error"/>
		</form:label>
		<br /><br />
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>