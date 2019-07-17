<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Test executions</title>
</head>
<body>
	<table>
		<tr>
			<th>RefID</th>
			<th>Date_Time</th>
			<th>Testname</th>
			<th>TestrunID</th>
			<th>SteadystateDuration</th>
			<th>ApplicationName</th>
		</tr>
		<c:forEach items="${apps}" var="runs"> 
		<tr>
			<td> 
			<a href="${pageContext.request.contextPath}/test_dbController?case=3&RefID=${runs.getRefID()}">${runs.getRefID()}</a>
			</td>
			<td>${runs.getDate_Time()}</td>
			<td>${runs.getTestname()}</td>
			<td>${runs.getTestrunID()}</td>
			<td>${runs.getSteadystateDuration()}</td>
			<td>${runs.getApplicationName()}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>