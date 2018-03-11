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
<script type="text/javascript" src="resources/js/monitores/monitores.js"></script>
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
						<h3 class="panel-title">Monitores</h3>
					</div>
					<div class="panel-body">


						<form class="form-horizontal" action="adicionarMonitores"
							method="POST" name="formulario" data-toggle="validator"
							role="form">
							<div class="form-group">
								<label for="usuario" class="col-sm-2 control-label">Usuario:</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="usuario"
										name="usuario" data-minlength="6" required /> <span
										class="help-block">Mínimo de seis (6) digitos</span>
								</div>
							</div>

							<div class="form-group">
								<label for="senha" class="col-sm-2 control-label">Senha:</label>
								<div class="col-sm-4">
									<input type="password" class="form-control" id="senha"
										name="senha" data-minlength="8" required /> <span
										class="help-block">Mínimo de seis (8) digitos</span>
								</div>
							</div>

							<div class="form-group">
								<label for="turma" class="col-sm-2 control-label">Turma:</label>
								<div class="col-sm-3">
									<select class="form-control" name="turma" id="turma"
										onchange="mostrarAlunosDaTurmaMonitor();">
										<option>Selecione:</option>
										<c:forEach items="${turmas}" var="turma">
											<option>${turma.nome}</option>
										</c:forEach>
									</select>
								</div>
							</div>


							<div class="form-group">
								<label for="alunos" class="col-sm-2 control-label">Alunos:</label>
								<div class="col-sm-3">
									<select class="form-control" name="aluno" id="aluno" disabled
										required="true">
										<c:if test="${alunos != null})">
											<c:forEach items="${alunos}" var="aluno">
												<option>${aluno.nome}</option>
											</c:forEach>
										</c:if>
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
						<h3 class="panel-title">Lista</h3>
					</div>
					<div class="panel-body">
						<div id="opcoes">
							<form action="listarMonitoresNaTable" method="post">
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

						<br /> <br /> <br /> <br />
						<div class="table-responsive">
							<table class="table table-bordered">
								<tr>
									<td class="active">Id</td>
									<td class="success">Usuario</td>
									<td class="danger">Senha</td>
									<td class="warning">Aluno</td>
									<td class="active">Turma</td>
									<td class="success">Excluir</td>
									<td class="danger">Alterar</td>
								</tr>


								<c:forEach items="${monitores}" var="monitor">
									<form action="alterarMonitores" method="post">
										<tr>
											<td><input type="text" name="id" class="form-control"
												value="${monitor.id}" readonly /></td>
											<td><input type="text" name="usuario"
												class="form-control" value="${monitor.usuario}" required /></td>
											<td><input type="text" name="senha" class="form-control"
												value="${monitor.senha}" required /></td>
											<td><input type="text" name="aluno" class="form-control"
												value="${monitor.aluno.nome}" required /></td>
											<td><input type="text" name="turma" class="form-control"
												value="${monitor.aluno.turma.nome}" required /></td>
											<td><a href="deletaMonitores?id=${monitor.id}"
												class="btn btn-danger">Remover</a></td>
											<td><input type="submit" value="Alterar"
												class="btn btn-warning" /></td>
										</tr>
									</form>
								</c:forEach>
							</table>
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
								<button type="button" class="btn btn-warning">Sim</button>
							</a>
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