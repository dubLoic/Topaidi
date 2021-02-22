<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nouvel Article !</title>
    <%@include file="commons/header.jsp" %>

</head>
<body>
<div class="container">
<%@include file="commons/menu.jsp" %>
<h1>Formulaire de creation</h1>

<form action="articles" method="post">
  <label for="libelleArticle">Libelle</label> <input type="text" name="libelleArticle">
  <label for="prixArticle">Prix</label> <input type="number" name="prixArticle">
  <input type="hidden" value="formCreate" name="actionPost"/>
  
  <input type="submit" value="Valider"/>
</form>
</div>

</body>
</html>