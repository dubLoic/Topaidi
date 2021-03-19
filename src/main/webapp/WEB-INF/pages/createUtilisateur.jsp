<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nouveau Utilisateur !</title>
    <%@include file="commons/header.jsp" %>

</head>
<body>
<div class="container">
<%@include file="commons/menu.jsp" %>
<h1>Formulaire de creation de compte</h1>

	<form action="user" method="post">
		  <label for="identifiant">Identifiant :</label> <input type="text" name="identifiant">
		  <label for="password">Password :</label> <input type="password" name="password">
		  
		  <input type="submit" value="Valider"/>
	</form>
	
 <h1>Liste des comptes</h1>
<table>
	 <c:forEach var="p" items="${userList}" >
	    <tr>
	    	 <td><c:out value="${p.email}"></c:out></td>
	    </tr>
	 </c:forEach>
 </table>
</div>

</body>
</html>