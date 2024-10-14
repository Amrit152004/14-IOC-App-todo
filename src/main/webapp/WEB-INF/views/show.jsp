<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>Task List</h1>
    <table border="1">
        <thead>
            <tr>
                <th>EmailID</th>
                <th>Name</th>
                <th>Date</th>
                <th>Time</th>
                <th>Operation</th>
                
            </tr>
        </thead>
        <tbody>
            <c:forEach var="task" items="${task}">
                <tr>
                    <td>${task.temailid}</td>
                    <td>${task.tname}</td>
                    <td>${task.tdate}</td>
                    <td>${task.ttime }</td>
                  <td><a href="/update/${task.tId}">Update</a></td>
                    <!--   <td><a href="/update">Update current</a></td>-->
                    <td><a href="/delete/${task.tId}">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>