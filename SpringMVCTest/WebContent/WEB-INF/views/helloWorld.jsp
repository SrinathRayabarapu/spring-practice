<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World page</title>
</head>
<body>
Hello World of Spring!!
<p>
Reading data from parameter(param):
<br>
<!-- param is used to access URL parameters information -->
Student name is : ${ param.studentName }

<p>
Reading data from Model:
<br>

The Message is : ${ message }

</body>
</html>