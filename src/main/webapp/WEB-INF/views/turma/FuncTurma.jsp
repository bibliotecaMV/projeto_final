<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Sobre turmas</title>

</script>
</head>
<body>
	<br />
	<center>


		<div class="jumbotron">
			<h2>Turmas</h2>
		</div>

		<br />
		<h3>Adicione uma nova:</h3>
		<form action="adicionaTurma" method="post">
			<table border="1" style="margin-top: 120px;">
				<tr>
					<td>Descrição:</td>
					<td><input type="text" name="nome" id="nome" placeholder="3A" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Salvar" /></td>

				</tr>
				<br />
			</table>
		</form>
		<table name="buscaInteligente">
			<tr>
				<td>Buscar:</td>
				<td>
				<td><input type="search" name="nome" /></td>
				<td><input type="submit" id="buscar" value="Pesquisar"></td>
			</tr>
		</table>

		<table border="1">
			<tr>
				<th size="15">id</th>
				<th>Descrição</th>
				<th>Deletar</th>
				<th>Alterar</th>
			</tr>
			<c:forEach items="${turmas}" var="turmas">
				<form method="post" action="alterarTurma">
					<tr>
						<td><input type="text" value="${turmas.id}"
							class="form-control" name="id" /></td>
						<td><input type="text" value="${turmas.nome}" name="nome" /></td>
						<td><a href="deletaTurmas?id=${turmas.id}">Remover</a></td>
						<td><input type="submit" value="Alterar" /></td>
						<!--<div class="container">
						<div class="modal fade" id="myModal" role="dialog">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal">&times;</button>
										<h4 class="modal-title">Alterar turma - ${turmas.id}</h4>
									</div>
									<div class="modal-body">
										<form action="alterarTurma" method="post">

											<p>Turma:</p>
											<input type="text" name="nome" id="nome">${turmas.nome}</input>
											<input type="submit" class="btn btn-default"
												data-dismiss="modal">


										</form>
									</div>
									<div class="modal-footer">
										<input type="submit" class="btn btn-default"
											data-dismiss="modal">Alterar</a>

									</div>
								</div>
							</div>
						</div>

					</div> -->

					</tr>
				</form>

			</c:forEach>

		</table>

	</center>
</body>
</html>