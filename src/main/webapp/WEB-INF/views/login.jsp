<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login</h1>
<h1>${msg }</h1>
<form action="/log" method="post"><pre>
Email:<input type="text" name="email"/>
Password:<input type="password" name="pass"/>
<input type="submit" value="Login"/>
</pre></form>
<a href="/hello">SignIn/Register</a>
</body>
</html>