<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="">Logout</a>
<h1>${msg }</h1>
<form action="/task" method="post">
<h1>Add Your Task Here</h1>
<pre>
Task Name:<input type="text" name="tname"/>
Task Date:<input type="date" name="tdate"/>
Task Time:<input type="time" name="ttime"/>
<input type="submit" value="Add Task"/>
</pre>
<a href="/view">View Task</a>
</form>

</body>
</html>