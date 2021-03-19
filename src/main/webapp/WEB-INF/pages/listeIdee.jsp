<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des idées</title>
<%@include file="commons/header.jsp" %>
</head>
<body>
<div class="container">
<%@include file="commons/menu.jsp" %>

<h1>Liste des idées</h1>

<table>
 <c:forEach var="p" items="${ideeList}" >
    <tr>
    	 <td><c:out value="${p.titre}"></c:out></td>
	     <td><c:out value="${p.categorie}"></c:out></td>
	     <td><c:out value="${p.description}"></c:out></td>
	     <td><c:out value="${p.image}"></c:out></td>
	     <td><c:out value="${p.datePoste}"></c:out></td>
    </tr>
 </c:forEach>
 </table>

</div>

</body>
</html>