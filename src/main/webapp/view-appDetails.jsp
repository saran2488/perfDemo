<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<style>
#applist {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#applist td, #applist th {
  border: 1px solid #ddd;
  padding: 8px;
}

#applist tr:nth-child(even){background-color: #f2f2f2;}

#applist tr:hover {background-color: #ddd;}

#applist th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}
</style>
<meta charset="ISO-8859-1">
<title>List of Test executions</title>
</head>
<body>
	<table id="applist">
		<tr>
			<th>Run Type</th>
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
		<select name="productId">
    <option value="1">MainTest</option>
    <option value="2">Compare</option>
  </select>
		</td>
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