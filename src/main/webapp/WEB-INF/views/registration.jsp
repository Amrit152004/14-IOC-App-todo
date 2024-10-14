<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration App</h1>
<form action="/submit" method="post">
<pre>
Name:<input type="text", name="name"/>
Email:<input type="text" name="email"/>
Password:<input type="password" name="pass"/>
Gender <input type="text" name="gender"/>
Phono:<input type="number" name="phno"/>
<input type="submit" value="Submit"/>
</pre></form>
<a href="/login">Login</a>
</body>
</html>