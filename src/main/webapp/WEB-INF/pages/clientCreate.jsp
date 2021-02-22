<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nouveau Client !</title>
    <%@include file="commons/header.jsp" %>

</head>
<body>
<div class="container">
<%@include file="commons/menu.jsp" %>
<h1>Formulaire de creation</h1>

<form action="clients" method="post">
  <label for="nomClient">Nom</label> <input type="text" name="nomClient">
  <label for="adresseClient">Adresse</label> <input type="text" name="adresseClient">
  <input type="hidden" value="formCreate" name="actionPost"/>
  
  <input type="submit" value="Valider"/>
</form>
</div>

</body>
</html>