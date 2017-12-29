<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>BIBLIOTECA LTV - MV INFORMATICA</title>
<!-- Bootstrap -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="resources/css/style.css">

<meta charset="utf-8" />
<script type="text/javascript" src="resources/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="resources/js/generos/generos.js"></script>

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
						<h3 class="panel-title">Generos</h3>
					</div>

					<div class="panel-body">


						<form action="cadastrarGenero" method="post"
							class="form-horizontal" data-toggle="validator" role="form">
							<div class="form-group">
								<label for="descricao" class="col-sm-2 control-label">Descrição:</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="descricao" 
										name="descricao" required  title="Digite um genero"
										onkeypress="return testeLetras(event)" />
								</div>
							</div>
							<div class="form-group">
								<label for="sigla" class="col-sm-2 control-label">Sigla numérica:</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="sigla"
										name="sigla" title="Digite uma sigla" required
										onkeypress="return testeNumeros(event)" />
								</div>
							</div>

							<div class="modal-footer">
								<button type="reset" class="btn btn-danger">Limpar</button>
								<button type="submit" class="btn btn-warning">Cadastar
									Genero</button>
							</div>

						</form>


					</div>
				</div>


				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Lista</h3>
					</div>
					<div class="panel-body">
						<form action="listarGenerosNaTable" method="post">
							<div class="form-group">
								<div class="col-sm-6">
									<input type="text" class="form-control" placeholder="Pesquisar por descrição"
										name="descricao2" onkeypress="return testeLetras(event)">
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-4">
									<input type="submit" value="Pesquisar" class="btn btn-default">
								</div>
							</div>
						</form>
					</div>
					<div class="table-responsive">
						<table class="table table-bordered" border="1">
							<tr>
								<td>Id</td>
								<td>Descrição</td>
								<td>Sigla numérica</td>
								<td>Excluir</td>
								<td>Alterar</td>
							
							</tr>
							<c:forEach items="${generos}" var="genero">
								<form action="alterarGenero" method="post">
									<tr id="linha_${genero.id}">
										<td>
											<div class="col-sm-5">
												<input type="text" value="${genero.id}" class="form-control"
													name="id" readonly />
											</div>
										</td>

										<td>
											<div class="col-sm-10">
												<input type="text" value="${genero.descricao}"
													name="descricao" class="form-control" 
													onkeypress="return testeLetras(event)" required />
											</div>
										</td>
										<td>
											<div class="col-sm-8">
												<input type="text" class="form-control"
													value="${genero.sigla}" name="sigla" 
													onkeypress="return testeNumeros(event)" required />
											</div>
										</td>

										<td><a href="#" onClick="removerGenero(${genero.id})"
											class="btn btn-danger">Excluir</a></td>
										<td><input type="submit" value="Alterar"
											class="btn btn-warning" /></td>
										
									</tr>
								</form>
							</c:forEach>
						</table>
					</div>
				</div>
				<a href="mostrarPainelAdministrador" class="link">
					<div class="glyphicon glyphicon-triangle-left"></div>
				</a>


			</div>
		</div>
	</div>
<script>
$(document).ready(function(){
    $('[data-toggle="tooltip"]').tooltip();   
});
</script>


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