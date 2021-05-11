<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car Search Errors</title>
</head>
<body>
	<sf:form id="error">
		<h3>Unable to retrieve car Information.Below are the error
			details:</h3>
		<h3>${errorMessage}</h3>
		<h3>${errorTime}</h3>
	</sf:form>
	<br />
	<a href="showCarSearchForm" id="searchCars"> Search Cars</a>
</body>
</html>