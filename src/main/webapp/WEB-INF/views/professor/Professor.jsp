	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>BIBLIOTECA LTV - MV INFORMATICA</title>

<!-- Bootstrap -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">

<link rel="stylesheet" type="text/css" href="resources/css/style.css">
</head>
<script type="text/javascript" src="resources/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="resources/js/professores/professores.js"></script>
<script src="resources/js/validator.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-default">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand">Usuário administrador</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<form class="navbar-form navbar-right">
				<button type="button" class="btn btn-warning" data-toggle="modal"
							data-target="#encerrar">Encerrar a sessão</button>
			</form>
		</div>
		<!--/.navbar-collapse -->
	</div>
	</nav>

	<div class="container">
		<div id="content">
			<div class="row">
				<div class="panel panel-warning">
					<div class="panel-heading">
						<h3 class="panel-title">Cadastrar Professor</h3>
					</div>

					<div class="panel-body">


						<form class="form-horizontal"
							action="
							adicionaProfessores" method="POST"
							name="formulario" data-toggle="validator" role="form">
							<div class="form-group">
								<label for="matricula" class="col-sm-2 control-label">Matricula:</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="matricula"
										name="matricula" required
										onkeypress="return testeNumeros(event)" />
								</div>
							</div>

							<div class="form-group">
								<label for="nome" class="col-sm-2 control-label">Nome:</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="nome" name="nome" 
									required onkeypress="return testeLetras(event)" />
								</div>
							</div>

							<div class="modal-footer">
								<button type="reset" class="btn btn-danger">Limpar</button>
								<button type="submit" class="btn btn-warning">Cadastar
									Professor</button>
							</div>

						</form>


					</div>
				</div>


				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Lista de Professores</h3>
					</div>
					<div class="panel-body">
						<div id="opcoes">
							<form action="listarProfessoresNaTable" method="post">
								<div class="form-group">
									<div class="col-sm-6">
										<input type="text" class="form-control" name="nome"
											placeholder="Pesquisar por nome"
											onkeypress="return testeLetras(event)" />
									</div>
								</div>
								<div class="form-group">
									<div class="col-sm-4">
										<input type="submit" class="btn btn-default" value="Pesquisar" />
									</div>
								</div>
							</form>
						</div>

						<br /> <br /> <br /> <br />
						<div class="table-responsive">

							<table width="600px" class="table table-bordered">
								<tr>
									<td class="active">Id</td>
									<td class="success">Matricula</td>
									<td class="danger">Nome</td>
									<td class="danger">Excluir</td>
									<td class="active">Alterar</td>
								</tr>

								<c:forEach items="${professores}" var="professor">
									<form action="alterarProfessores" method="post">
										<tr>
											<td><input type="text" name="id" class="form-control"
												value="${professor.id}" readonly /></td>
											<td><input type="text" name="matricula"
												class="form-control" value="${professor.matricula}" required
												onkeypress="return testeNumeros(event)" /></td>
											<td><input type="text" name="nome"
												class="form-control" value="${professor.nome}" required
												onkeypress="return testeLetras(event)" /></td>
											<td><a href="deletaProfessores?id=${professor.id}"
												class="btn btn-danger">Remover</a></td>
											<td><input type="submit" value="Alterar"
												class="btn btn-warning" /></td>
										</tr>
									</form>
								</c:forEach>
							</table>
						</div>

					</div>
				</div>
				<a href="mostrarPainelAdministrador" class="link">
					<div class="glyphicon glyphicon-triangle-left"></div>
				</a>
			</div>
		</div>
	</div>
	
	
<!-- Modal -->
	<div class="modal fade" id="encerrar" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Encerrar a sessão</h4>
				</div>
				<div class="modal-body">Você realmente quer encerrar sua
					sessão?</div>
				<div class="modal-footer">
					<a href="logoutAdministrador" class="link">
					<button type="button" class="btn btn-warning">
						Sim
					</button></a>
					<button type="button" class="btn btn-danger" data-dismiss="modal">Não</button>
				</div>
			</div>
		</div>
	</div>
	
	<!-- jQuery (obrigatório para plugins JavaScript do Bootstrap) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necessário -->
	<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>