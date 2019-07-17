<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Application</title>
</head>
<body>
	<table>
		<tr>
<!-- 			<th>RefID</th> -->
<!-- 			<th>Date_Time</th> -->
<!-- 			<th>Testname</th> -->
<!-- 			<th>TestrunID</th> -->
<!-- 			<th>SteadystateDuration</th> -->
			<th>ApplicationName</th>
		</tr>
		<c:forEach items="${list}" var="perf_db"> 
		<tr>
			<td> 
<%-- 			<a href="/viewDetail.jsp?RefID="+${perf_db.getRefID()}+"&viewDetailsList="+${list2}>${perf_db.getApplicationName()}</a> --%>
			<a href="${pageContext.request.contextPath}/test_dbController?case=2&AppName=${perf_db.getApplicationName()}">${perf_db.getApplicationName()}</a>
			</td>
<%-- 			<td>${perf_db.Date_Time}</td> --%>
<%-- 			<td>${perf_db.Testname}</td> --%>
<%-- 			<td>${perf_db.TestrunID}</td> --%>
<%-- 			<td>${perf_db.SteadystateDuration}</td> --%>
<%-- 			<td>${perf_db.ApplicationName}</td> --%>
		</tr>
		</c:forEach>
	</table>
</body>
</html>