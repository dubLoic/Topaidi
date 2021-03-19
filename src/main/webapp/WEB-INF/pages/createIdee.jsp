<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nouvelle Idee !</title>
    <%@include file="commons/header.jsp" %>

</head>
<body>
<div class="container">
<%@include file="commons/menu.jsp" %>
<h1>Formulaire de creation</h1>

<form action="idee" method="post">
  <label for="titre">Titre</label> <input type="text" name="titre">
  <label for="categorie">Categorie</label> <input type="text" name="categorie">
  <label for="description">Description</label> <input type="text" name="description">
  <label for="image">Image</label> <input type="text" name="image">
  <label for="datep">Date</label> <input type="date" name="datep">
  
  <input type="submit" value="Valider"/>
</form>
</div>

</body>
</html>