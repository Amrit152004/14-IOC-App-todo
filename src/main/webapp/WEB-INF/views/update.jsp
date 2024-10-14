<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Update Data</h1>
 <h1>Update Task</h1>
    <form action="/updateAll/${task.tId}" method="post">
       <input type="text" name="tname" value="${task.tname}" readonly/>
        <input type="date" name="tdate" value="${task.tdate}" />
        <input type="time" name="ttime" value="${task.ttime}" />
        <input type="hidden" name="temailid" value="${task.temailid}" readonly />
        <button type="submit">Update</button>
    </form>

</body>
</html>