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
			<a class="navbar-brand">Usu�rio administrador</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<form class="navbar-form navbar-right">
				<button type="button" class="btn btn-warning" data-toggle="modal"
					data-target="#encerrar">Encerrar a sess�o</button>
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
							method="POST" name="formulario" data-toggle="validator" role="form">
							<div class="form-group">
								<label for="tombo" class="col-sm-2 control-label">Tombo:</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="tombo" name="tombo"
										onkeypress="return testeNumeros(event)" required />
								</div>
							</div>

							<div class="form-group">
								<label for="ano_editado" class="col-sm-2 control-label">Ano
									editado:</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="ano_editado"
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
									<input type="text" class="form-control" id="exemplares"
										name="exemplares" required
										onkeypress="return testeNumeros(event)" />
								</div>
							</div>

							<div class="form-group">
								<label for="forma_aquisicao" class="col-sm-2 control-label">Forma
									de aquisi��o:</label>
								<div class="col-sm-3">
									<select class="form-control" id="forma_aquisicao" name="forma_aquisicao"
										onchange="habilitarBotaoOutro()">
										<option>Doado</option>
										<option>Comprado</option>
										<option>Outro</option>
									</select>
								</div>
								<div class="col-sm-3">
									<input type="text" class="form-control" id="forma_aquisicao-outro" name="forma_aquisicao2"
									required="false" disabled>
								</div>

							</div>

							<div class="form-group">
								<label for="local_edicao" class="col-sm-2 control-label">Local
									da edi��o:</label>
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
									<input type="text" class="form-control" id="volume"
										name="volume" onkeypress="return testeNumeros(event)" required />
								</div>
							</div>

							<div class="form-group">
								<label for="genero" class="col-sm-2 control-label">Genero:</label>
								<div class="col-sm-3">
									<select class="form-control" name="genero" required>
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
											placeholder="Pesquisar por t�tulo" />
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
											<td><input type="text" class="form-control" id="tombo"
												name="tombo" onkeypress="return testeNumeros(event)"
												required value="${livro.tombo}" /></td>
											<td><input type="text" class="form-control" id="autor"
												name="autor" required onkeypress="return testeLetras(event)"
												value="${livro.autor}" />
											<td><input type="text" class="form-control"
												id="exemplares" name="exemplares" required
												value="${livro.exemplares}"
												onkeypress="return testeNumeros(event)" /></td>
											<td><input type="text" class="form-control" id="titulo"
												name="titulo" required value="${livro.titulo}" /></td>
											<td><select class="form-control" name="genero">
													<c:forEach items="${generos}" var="genero">
														<c:if
															test="${livro.genero.descricao == genero.descricao }">
															<option selected>${genero.descricao}</option>
														</c:if>
														<c:if
															test="${livro.genero.descricao != genero.descricao }">
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
					<h4 class="modal-title" id="myModalLabel">Encerrar a sess�o</h4>
				</div>
				<div class="modal-body">Voc� realmente quer encerrar sua
					sess�o?</div>
				<div class="modal-footer">
					<a href="logoutAdministrador" class="link">
						<button type="button" class="btn btn-warning">Sim</button>
					</a>
					<button type="button" class="btn btn-danger" data-dismiss="modal">N�o</button>
				</div>
			</div>
		</div>
	</div>
	
	<a href="mostrarPainelAdministrador"
		class="link btn btn-warning btn-custom "> <span
		class="glyphicon glyphicon-chevron-left img-circle text-primary btn-icon"></span>
		Voltar
	</a>

	<!-- jQuery (obrigat�rio para plugins JavaScript do Bootstrap) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necess�rio -->
	<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>