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
<script type="text/javascript" src="resources/js/livro/livro.js"></script>
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
						<h3 class="panel-title">Livros</h3>
					</div>

					<div class="panel-body">


						<form class="form-horizontal" action="adicionarLivros"
							method="POST" name="formulario">
							<div class="form-group">
								<label for="tombo" class="col-sm-2 control-label">Tombo:</label>
								<div class="col-sm-4">
									<input type="number" class="form-control" id="tombo"
										name="tombo" required />
								</div>
							</div>

							<div class="form-group">
								<label for="CDD" class="col-sm-2 control-label">CDD:</label>
								<div class="col-sm-4">
									<input type="number" class="form-control" id="CDD" name="CDD"
										required />
								</div>
							</div>

							<div class="form-group">
								<label for="ano_editado" class="col-sm-2 control-label">Ano
									editado:</label>
								<div class="col-sm-4">
									<input type="number" class="form-control" id="ano_editado"
										name="ano_editado" required
										onkeypress="return testeNumeros(event)" />
								</div>
							</div>

							<div class="form-group">
								<label for="autor" class="col-sm-2 control-label">Autor:</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="autor" name="autor"
										required onkeypress="return testeLetras(event)" />
								</div>
							</div>

							<div class="form-group">
								<label for="editora" class="col-sm-2 control-label">Editora:</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="editora"
										name="editora" required />
								</div>
							</div>

							<div class="form-group">
								<label for="exemplares" class="col-sm-2 control-label">Exemplares:</label>
								<div class="col-sm-4">
									<input type="number" class="form-control" id="exemplares"
										name="exemplares" required
										onkeypress="return testeNumeros(event)" />
								</div>
							</div>

							<div class="form-group">
								<label for="forma_aquisicao" class="col-sm-2 control-label">Forma
									de aquisição:</label>
								<div class="col-sm-3">
									<select class="form-control" name="forma_aquisicao" required>
										<option>Doado</option>
										<option>Comprado</option>
									</select>
								</div>

							</div>

							<div class="form-group">
								<label for="local_edicao" class="col-sm-2 control-label">Local
									da edição:</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="local_edicao"
										name="local_edicao" required />
								</div>
							</div>

							<div class="form-group">
								<label for="titulo" class="col-sm-2 control-label">Titulo:</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="titulo"
										name="titulo" required />
								</div>
							</div>

							<div class="form-group">
								<label for="volume" class="col-sm-2 control-label">Volume:</label>
								<div class="col-sm-4">
									<input type="number" class="form-control" id="volume"
										name="volume" required />
								</div>
							</div>

							<div class="form-group">
								<label for="genero" class="col-sm-2 control-label">Genero:</label>
								<div class="col-sm-3">
									<select class="form-control" name="genero">
										<c:forEach items="${generos}" var="genero">
											<option>${genero.descricao}</option>
										</c:forEach>
									</select>
								</div>
							</div>

							<div class="modal-footer">
								<button type="reset" class="btn btn-danger">Limpar</button>
								<button type="submit" class="btn btn-warning">Cadastar
									Livro</button>
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
							<form action="listarLivroNaTable" method="post">
								<div class="form-group">
									<div class="col-sm-6">
										<input type="text" class="form-control" name="titulo"
											placeholder="Pesquisar por título" />
									</div>
								</div>
								<div class="form-group">
									<div class="col-sm-4">
										<input type="submit" value="Pesquisar" class="btn btn-default" />
									</div>
								</div>
							</form>
						</div>

						<br /> <br /> <br /> <br />
						<div class="table-responsive">

							<table width="600px" class="table table-bordered">
								<tr>
									<td class="active">Tombo</td>
									<td class="danger">Autor</td>
									<td class="danger">Exemplares</td>
									<td class="success">Titulo</td>
									<td class="success">Genero</td>
									<td class="danger">Excluir</td>
									<td class="active">Alterar</td>
								</tr>

								<c:forEach items="${livros}" var="livro">
									<form action="alterarLivro" method="post">
										<tr>
											<td><input class="form-control" type="number"
												name="tombo" value="${livro.tombo}" required
												readonly="false"></td>
											<td><input class="form-control" type="text" name="autor"
												value="${livro.autor}" required
												onkeypress="return testeLetras(event)" />
											<td><input class="form-control" type="number"
												name="exemplares" value="${livro.exemplares}" required /></td>
											<td><input class="form-control" type="text"
												name="titulo" value="${livro.titulo}" required
												onkeypress="return testeLetras(event)" /></td>
											<td><select class="form-control" name="genero">
													<c:forEach items="${generos}" var="genero">
														<c:if test="${livro.genero.descricao == genero.descricao }">
															<option selected>${genero.descricao}</option>
														</c:if>
														<c:if test="${livro.genero.descricao != genero.descricao }">
															<option>${genero.descricao}</option>
														</c:if>
													</c:forEach>
											</select></td>
											<td><a href="deletarLivro?id=${livro.tombo}"
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
</body>
</html>