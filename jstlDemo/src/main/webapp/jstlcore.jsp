
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Taglib Example</title>
</head>
<body>
	<!-- c:set and c:var values -->
	<c:set var="x" value="10"></c:set>
	<c:out value="${x}"></c:out>
	<!-- conditional iteration tags -->
	<c:if var="x1" test="${2==2}"></c:if>
	<c:out value="${x1}"></c:out>
	<h1>
		<c:set var="count" value="0"></c:set>
		<c:choose>
			<c:when test="${count == 0}">
				No records matched your selection.
			</c:when>
			<c:otherwise>
				${count} records matched your selection.
			</c:otherwise>
		</c:choose>
	</h1>

	<c:set var="arr" value="${ [1,2,3,4]}"></c:set>
	<c:out value="${arr}"></c:out>
	<table border="1px">
		<c:forEach var="array" items="${arr}">
			<tr>
				<td>${array}</td>
			</tr>
		</c:forEach>
	</table>
	<c:forEach var="i" begin="0" end="11" step="2">
${i}
</c:forEach>
</body>
</html>