<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page errorPage="paginaErro.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Programadores</title>
</head>
<body>
    <p>Erro ao realizar operação!</p>   
    <jsp:include page="listarPessoas.jsp"></jsp:include>  
</body>
</html>