<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>student Form</h2>
	<form action="processStudentFormV2" method="POST">
		<label> FirstName:<input type="text" id="firstName"
			name="firstName" /></label> <br />
		<br /> <label> LastName:<input type="password" id="lastName"
			name="lastName" /></label> <br />
		<br /> <label> Course id:<input type="text" id="courseId"
			name="courseId" /></label> <br />
		<br />
		
		<button type="submit">Submit</button>

	</form>

</body>
</html>