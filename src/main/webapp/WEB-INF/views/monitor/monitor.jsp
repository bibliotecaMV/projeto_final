<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
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
						<a href="logoutAdministrador" class="link">Encerrar a sessão</a>
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
						<h3 class="panel-title">Cadastrar Monitor</h3>
					</div>
					<div class="panel-body">


						<form class="form-horizontal" action="listarMonitores" method="POST" name="formulario">
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
									<input type="text" class="form-control" id="senha" name="senha"
										required />
								</div>
							</div>

							<div class="form-group">
								<label for="turma" class="col-sm-2 control-label">Turma:</label>
								<div class="col-sm-3">
									<select class="form-control" name="turma" id="turma">
										<option selected>Selecione</option>
										<c:forEach items="${turmas}" var="turma">
											<option>${turma.nome}</option>
										</c:forEach>
									</select>
								</div>
							</div>


							<div class="form-group">
								<label for="alunos" class="col-sm-2 control-label">Alunos:</label>
								<div class="col-sm-3">
									<select class="form-control" name="aluno" id="aluno">
										<option selected>Selecione</option>
										<c:forEach items="${alunos}" var="aluno">
											<option>${aluno.nome}</option>
										</c:forEach>
									</select>

								</div>
							</div>

							<div class="modal-footer">
								<button type="reset" class="btn btn-danger">Limpar</button>
								<button type="submit" class="btn btn-warning">Cadastar
									Monitor</button>
							</div>

						</form>


					</div>
				</div>



				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Lista de Monitores</h3>
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
									<a href=""><button type="submit" class="btn btn-danger">Pesquisar</button></a>
								</div>
							</div>
						</div>

						<br /> <br /> <br /> <br />
						<div>
							<table class="table table-bordered">
								<tr>
									<td class="active">Id</td>
									<td class="success">Usuario</td>
									<td class="danger">Senha</td>
									<td class="warning">Aluno</td>
									<td class="danger">Excluir</td>
									<td class="active">Alterar</td>
								</tr>


								<c:forEach items="${monitores}" var="monitor">
									<tr>
										<td>${monitor.id}</td>
										<td>${monitor.usuario}</td>
										<td>${monitor.senha}</td>
										<td>${monitor.aluno.nome}</td>
										<td><a href="deletaMonitores?id=${monitor.id}">Remover</a></td>
										<td><a href="deletaMonitores?id=${monitor.id}">Alterar</a></td>
									</tr>
								</c:forEach>
							</table>
						</div>


					</div>
				</div>
			</div>
</body>
</html>