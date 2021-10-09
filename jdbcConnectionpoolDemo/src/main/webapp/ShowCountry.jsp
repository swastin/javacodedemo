<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show country</title>
<sql:query dataSource="jdbc/world_details" var="rs" maxRows="100">select * from country;</sql:query>
<table border="1px">
		<tr>
			<th>Code</th>
			<th>Name</th>
			<th>Continent</th>
		</tr>
		<c:forEach var="country" items="${rs.rows}">
			<tr>
				<td><c:out value="${country.Code}"></c:out></td>
				<td><c:out value="${country.Name}"></c:out></td> 
				<td><c:out value="${country.Continent}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</head>
<body>

</body>
</html>