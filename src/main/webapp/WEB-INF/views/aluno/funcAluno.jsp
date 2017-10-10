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
						<h3 class="panel-title">Cadastrar Alunos</h3>
					</div>

					<div class="panel-body">


						<form class="form-horizontal" action="
							adicionarAluno"
							method="POST" name="formulario">
							<div class="form-group">
								<label for="matricula" class="col-sm-2 control-label">Matricula:</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="matricula"
										name="matricula" required />
								</div>
							</div>

							<div class="form-group">
								<label for="nome" class="col-sm-2 control-label">Nome:</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="nome" name="nome"
										required />
								</div>
							</div>


							<div class="form-group">
								<label for="numero" class="col-sm-2 control-label">N�mero:</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="numero"
										name="numero" required />
								</div>
							</div>

							<div class="form-group">
								<label for="turma" class="col-sm-2 control-label">Turma:</label>
								<div class="col-sm-3">
									<select class="btn btn-primary dropdown-toggle" name="turma"
										id="turma">
										<option selected>Selecione</option>
										<c:forEach items="${turma}" var="turmas">
											<option>${turmas.nome}</option>
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
						<h3 class="panel-title">Lista de Alunos</h3>
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
									<a href="listarAlunos"><button type="submit"
											class="btn btn-danger">Pesquisar</button></a>
								</div>
							</div>
						</div>

						<br /> <br /> <br /> <br />
						<div>

							<table width="600px" class="table table-bordered">
								<tr>
									<td class="active">Id</td>
									<td class="success">Matricula</td>
									<td class="danger">Nome</td>
									<td class="warning">Numero</td>
									<td class="warning">Turma</td>
									<td class="danger">Excluir</td>
									<td class="active">Alterar</td>
								</tr>

								<c:forEach items="${alunos}" var="aluno">
									<tr>
										<td class="col-sm-2"><input type="text"
											value="${aluno.id}" /></td>
										<td class="col-sm-2"><input type="text"
											value="${aluno.matricula}" name="matricula" /></td>
										<td class="col-sm-2"><input type="text"
											value="${aluno.nome}" name="nome" /></td>
										<td class="col-sm-2"><input type="text"
											value="${aluno.numero}" name="numero" /></td>
										<td class="col-sm-2"><input type="text"
											value="${aluno.turma.nome}" name="turma" /></td>
										<td class="col-sm-1"><a
											href="deletarAluno?id=${aluno.id}">Remover</a></td>
										<td class="col-sm-1"><a
											href="altetarAluno?id=${aluno.id}">Alterar</a></td>

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