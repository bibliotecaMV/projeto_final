<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>BIBLIOTECA LTV - MV INFORMATICA</title>

<!-- Bootstrap -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">

<link rel="stylesheet" type="text/css" href="resources/css/style.css">
</head>
<script type="text/javascript" src="resources/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="resources/js/emprestimos/emprestimos.js"></script>
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
			<a class="navbar-brand">Painel do Administrador</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<form class="navbar-form navbar-right">
				<button type="submit" class="btn btn-warning">
					<a href="logoutAdministrador" class="link">Encerrar a sess�o</a>
				</button>
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
						<h3 class="panel-title">Cadastrar Turmas</h3>
					</div>

					<div class="panel-body">


						<form class="form-horizontal" action="adicionaTurma" method="POST"
							name="formulario">
							<div class="form-group">
								<label for="nome" class="col-sm-2 control-label">Descri��o:</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="nome" name="nome"
										required />
								</div>
							</div>

							<div class="modal-footer">
								<button type="reset" class="btn btn-danger">Limpar</button>
								<button type="submit" class="btn btn-warning">Cadastar
									Turma</button>
							</div>

						</form>


					</div>
				</div>


				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Lista das Turmas</h3>
					</div>
					<div class="panel-body">
						<div id="opcoes">
							<div class="form-group">
								<div class="col-sm-6">
									<input type="text" class="form-control" name="pesquisa"
										placeholder="Pesquisar" />
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-4">
									<a href="listarTurmas"><button type="submit" class="btn btn-danger">Pesquisar</button></a>
								</div>
							</div>
						</div>

						<br /> <br /> <br /> <br />

						<div>
							<table width="600px" class="table table-bordered">
								<tr>
									<td class="active">Id</td>
									<td class="success">Descri��o</td>
									<td class="danger">Excluir</td>
									<td class="active">Alterar</td>
								</tr>

								<c:forEach items="${turmas}" var="turmas">
									<tr>
										<td><input type="text" value="${turmas.id}"
											class="form-control" id="disabledInput" disabled /></td>
										<td><input type="text" value="${turmas.nome}" name="nome" /></td>
										<td><a href="deletaTurmas?id=${turmas.id}">Remover</a></td>
										<td><a href="alterarTurma?id=${turmas.id}">Alterar</a></td>

									</tr>
								</c:forEach>
							</table>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>