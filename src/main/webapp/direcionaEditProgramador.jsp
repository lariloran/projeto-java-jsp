<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page errorPage="PaginaErro.jsp" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale = 1, shrink-to-fit=no">
	<title>Template Master</title>
	<link rel="stylesheet" type="text/css" href="bibliotecas/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="bibliotecas/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="bibliotecas/datatables/dataTables.bootstrap4.css">
	<link rel="stylesheet" type="text/css" href="css/sb-admin.min.css">
</head>
<body class="bg-dark fixed-nav sticky-footer" id="page-top">
	<!-- Navegação !-->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
		<p class="navbar-brand">Admin Sistema</p>
		<button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse"
		data-target="#navbarInicio" aria-control="navbarInicio" aria-expanded="false" aria-label="Navegação Toggle">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div id="navbarInicio" class="collapse navbar-collapse">
			<ul class="navbar-nav navbar-sidenav" id="linksaccordion">
			<li class="nav-item" data-toggle="tooltip" data-placement="right">
					<a class="nav-link" href="index.jsp">
						<i class="fa fa-fw fa-table"></i>
						<span class="nav-link-text">Início</span>
					</a>
				</li>
				<li class="nav-item" data-toggle="tooltip" data-placement="right">
					<a class="nav-link" href="addProgramador.jsp
					">
						<i class="fa fa-fw fa-dashboard"></i>
						<span class="nav-link-text">Cadastrar Programador</span>
					</a>
				</li>
								<li class="nav-item" data-toggle="tooltip" data-placement="right">
					<a class="nav-link" href="index.jsp">
						<i class="fa fa-fw fa-dashboard"></i>
						<span class="nav-link-text">Listar Programadores</span>
					</a>
				</li>
			</ul>
			<ul class="navbar-nav sidenav-toggler">
				<li class="nav-item">
					<a id="sidenavToggler" class="nav-link text-center">
						<i class="fa fa-fw fa-angle-left"></i>
					</a>
				</li>
			</ul>
          <ul class="navbar-nav ml-auto">
				<li class="nav-item">
					<a class="nav-link" href="invalidate.jsp">
						<i class="fa fa-sign-out">Logout</i>
					</a>
				</li>
				
			</ul>

		</div>
	</nav>
	
	 <jsp:useBean id="programadorBean" class="classes.Programador" scope="request"/>
     <jsp:setProperty name="programadorBean" property="*" /> 
        <%
            if (!programadorBean.atualizar()) {
        %>
            <h1> Erro ao editar programador</h1>
        <%}%>

    	<jsp:include page="listProgramadores.jsp"></jsp:include>
    		
		<footer class="sticky-footer">
			<div class="container">
				<div class="text-center">
				<small>Copyright @IFRS 2023</small>
				</div>
			</div>
		</footer>
	
	
	<script src="bibliotecas/jquery/jquery.min.js"></script>
	<script src="bibliotecas/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="bibliotecas/jquery-easing/jquery.easing.min.js"></script>
	<script src="bibliotecas/datatables/jquery.dataTables.js"></script>
	<script src="bibliotecas/datatables/dataTables.bootstrap4.js"></script>
	<script src="js/sb-admin.min.js" type="text/javascript"></script>
	<script src="js/sb-admin-datatables.min.js" type="text/javascript"></script>
</body>
</html>