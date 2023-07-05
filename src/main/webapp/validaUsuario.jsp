<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page errorPage="PaginaErro.jsp" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Template Master</title>
	<link rel="stylesheet" type="text/css" href="bibliotecas/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="bibliotecas/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="bibliotecas/datatables/dataTables.bootstrap4.css">
	<link rel="stylesheet" type="text/css" href="css/sb-admin.min.css">
</head>
<body class="bg-dark fixed-nav sticky-footer" id="page-top">

	<jsp:useBean id="usuarioBean" class="classes.Usuario" scope="request"/>
    <jsp:setProperty name="usuarioBean" property="*" /> 

    <% if (usuarioBean.buscarPorEmailESenha() != null) { %>
    	<jsp:include page="index.jsp"></jsp:include>
    <% } else { %>
    	<jsp:include page="DadosIncorretos.html"></jsp:include>
    <% } %>

</body>
</html>
