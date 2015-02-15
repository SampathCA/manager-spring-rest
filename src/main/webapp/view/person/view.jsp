<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${person.name}</title>
</head>
<body>
	<h1>${person.name}</h1>

	<ul>
		<c:set var="address" value="${person.address}"></c:set>
		<li>${address.street}</li>
		<li>${address.city},${address.state},${address.zip}</li>
		<li>Manager: ${person.manager.name}</li>
		<li>Employer: ${person.employer.name}</li>
	</ul>
	<a href="${person.url}&edit">edit person</a> |
	<a href="contacts">back to contact list</a>
</body>
</html>