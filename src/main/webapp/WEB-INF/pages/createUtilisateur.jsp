<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<h1>Formulaire de creation</h1>

<form action="utilisateur" method="post">
  <label for="email">Email</label> <input type="text" name="email">
  <label for="pwd">Password</label> <input type="password" name="pwd">
  
  <input type="submit" value="Valider"/>
</form>
</div>

</body>
</html>