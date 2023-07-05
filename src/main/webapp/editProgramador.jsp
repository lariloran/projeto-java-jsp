<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="classes.*"%>
<%@page errorPage="PaginaErro.jsp" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale = 1, shrink-to-fit=no">
	<title>Template Master</title>
	<link rel="stylesheet" type="text/css" href="bibliotecas/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="bibliotecas/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="css/sb-admin.min.css">
</head>
<body class="bg-dark fixed-nav sticky-footer" id="page-top">
	<!-- Navega��o !-->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
		<p class="navbar-brand" >Admin Sistema</p>
		<button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse"
		data-target="#navbarInicio" aria-control="navbarInicio" aria-expanded="false" aria-label="Navega��o Toggle">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div id="navbarInicio" class="collapse navbar-collapse">
			<ul class="navbar-nav navbar-sidenav" id="linksaccordion">
			<li class="nav-item" data-toggle="tooltip" data-placement="right">
					<a class="nav-link" href="index.jsp">
						<i class="fa fa-fw fa-table"></i>
						<span class="nav-link-text">In�cio</span>
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
					<a class="nav-link" href="listagemDeProgramadores.jsp">
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
     <jsp:setProperty name="programadorBean" property="idFuncionario" param="idFuncionario" />
        <%  
        Programador p = programadorBean.buscarID(); 
        String id = String.valueOf(programadorBean.getIdFuncionario());	
        %>  
	
	<div class="content-wrapper">
		<div class="container-fluid">
			<div class="row">
				<div class="col-12">
				
				<div class="container">
		<div class="card card-register mx-auto mt-5">
			<div class="card-header">Editar Programador</div>
			<div class="card-body">
                   <form method ="POST" action="direcionaEditProgramador.jsp">
                      <input type="hidden" name="idFuncionario" value="<%=id%>"/>
                <div class="form-group">
						<label for="nome">Nome:</label>
						<input type="text" class="form-control" id="nome" name="nome"
						placeholder="Digite seu nome:" value="<%=p.getNome()%>">
					</div>
					
										<div class="form-group">
						<label for="endereco">Endereco:</label>
						<input type="text" class="form-control" id="endereco" name="endereco"
						placeholder="Digite seu endere�o:"value="<%=p.getEndereco()%>">
					</div>
					
										<div class="form-group">
						<label for="email">Email:</label>
						<input type="text" class="form-control" id="email" name="email"
						placeholder="Digite seu email" value="<%=p.getEmail()%>">
					</div>
					
										<div class="form-group">
						<label for="salario">Salario:</label>
						<input type="text" class="form-control" id="salario" name="salario"
						placeholder="Digite seu sal�rio" value="<%=p.getSalario()%>">
					</div>
					
										<div class="form-group">
						<label for="cpf">CPF:</label>
						<input type="text" class="form-control" id="cpf" name="cpf"
						placeholder="Digite seu CPF:" value="<%=p.getCpf()%>">
					</div>
					
					<div class="form-group">
						<label for="linguagemProg">Linguagem:</label>
						<input type="text" class="form-control" id="linguagemProg" name="linguagemProg"
						placeholder="Digite a linguagem:" value="<%=p.getLinguagemProg()%>">
					</div>
					<div class="form-group">
						<label for="projetos">Projeto:</label>
						<input type="text" class="form-control" id="projetos" name="projetos"
						placeholder="Digite o nome do projeto:" value="<%=p.getProjetos()%>">
					</div>
					
					<button class="btn btn-primary btn-block">Editar</button>
				</form>
				</div>
			</div>
		</div>
					</div>
			</div>
		</div>
		<footer class="sticky-footer">
			<div class="container">
				<div class="text-center">
					<small>Copyright @IFRS 2023</small>
				</div>
			</div>
		</footer>
	</div>
	
	<script src="bibliotecas/jquery/jquery.min.js"></script>
	<script src="bibliotecas/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="bibliotecas/jquery-easing/jquery.easing.min.js"></script>
	<script src="js/sb-admin.min.js" type="text/javascript"></script>
</body>
</html>