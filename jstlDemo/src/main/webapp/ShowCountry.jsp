<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Database Connection Using JSTL</title>
</head>

<body>
	<h1>the list of country</h1>
	<sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/world" user="root"
		password="root" var="ds"></sql:setDataSource>
	<sql:query dataSource="${ds}" var="rs" sql="select * from country order by Continent" maxRows="10"></sql:query>
	<table border="5px">
		<tr>
			<th>Code</th>
			<th>Name</th>
			<th>Continent</th>
		</tr>
		<c:forEach var="country" items="${rs.rows}">
			<tr>
				<td>
					<c:out value="${country.Code}"></c:out>
				</td>
				<td>
					<c:out value="${country.Name}"></c:out>
				</td>
				<td>
					<c:out value="${country.Continent}"></c:out>
				</td>
			</tr>
		</c:forEach>
	</table>
	<c:set var="cont" value="Africa"></c:set>
	<sql:query dataSource="${ds}" var="rs1" sql="select * from country  where Continent=? " maxRows="10">

		<sql:param value="${cont}"></sql:param>
	</sql:query>
	<table border="1px">
		<tr>
			<th>Code</th>
			<th>Name</th>
			<th>Continent</th>
		</tr>
		<c:forEach var="country1" items="${rs1.rows}">
			<tr>
				<td>
					<c:out value="${country1.Code}"></c:out>
				</td>
				<td>
					<c:out value="${country1.Name}"></c:out>
				</td>
				<td>
					<c:out value="${country1.Continent}"></c:out>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>

</html>