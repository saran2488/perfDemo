<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<%@ page isELIgnored="false"%>
<html>
<body>
<h2>Hello World!</h2>
<a href="${pageContext.request.contextPath}/test_dbController?case=1">List of Applications</a>
<%-- 	<form action="${pageContext.request.contextPath}/test_dbController?case=1" method="post"> --%>
<!-- 		<input type="text" name="appid"> -->
<!-- 		<input type="submit"> -->
<!-- 	</form> -->
</body>
</html>