<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
	src="resources/js/administrador/administrador.js"></script>
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
			<a class="navbar-brand">Usu�rio administrador</a>
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
						<h3 class="panel-title">Administradores</h3>
					</div>
					<div class="panel-body">


						<form class="form-horizontal" action="adicionaAdministrador"
							method="POST" name="formulario">
							<div class="form-group">
								<label for="usuario" class="col-sm-2 control-label">Usuario:</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="usuario"
										name="usuario" required />
								</div>
							</div>

							<div class="form-group">
								<label for="senha" class="col-sm-2 control-label">Senha:</label>
								<div class="col-sm-4">
									<input type="password" class="form-control" id="senha"
										name="senha" required />
								</div>
							</div>

							<div class="modal-footer">
								<button type="reset" class="btn btn-danger">Limpar</button>
								<button type="submit" class="btn btn-warning">Cadastar
									Administrador</button>
							</div>

						</form>


					</div>
				</div>



				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Lista</h3>
					</div>
					<div class="panel-body">
						<div id="opcoes">
							<form action="listarAdministradoresNaTable" method="post">
								<div class="form-group">
									<div class="col-sm-6">
										<input type="text" class="form-control" name="usuario"
											placeholder="Pesquisar por usuario" />
									</div>
								</div>
								<div class="form-group">
									<div class="col-sm-4">
										<input type="submit" class="btn btn-default" value="Pesquisar" />
									</div>
								</div>
							</form>
						</div>

						<br> <br> <br>

						<div class="table-responsive">
							<table class="table table-bordered">
								<tr>
									<td class="active">Id</td>
									<td class="success">Usu�rio</td>
									<td class="active">Senha</td>
									<td class="danger">Excluir</td>
									<td class="active">Alterar</td>
								</tr>

								<c:forEach items="${administradores}" var="administrador">
									<form action="alterarAdministrador">
										<tr>
											<td><input type="text" value="${administrador.id}"
												class="form-control" readonly name="id"/></td>
											<td><input type="text" value="${administrador.usuario}"
												name="usuario" id="usuario" class="form-control" required /></td>
											<td><input type="text" value="${administrador.senha}"
												name="senha" id="senha" class="form-control" required /></td>
											<td><a href="deletaAdministrador?id=${administrador.id}"
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


			</div>
		</div>

	</div>

</body>
</html>