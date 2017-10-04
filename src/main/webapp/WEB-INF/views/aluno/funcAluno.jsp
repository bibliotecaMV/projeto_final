<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<title>Sobre Alunos</title>
</head>
<body>
	<div class="jumbotron">
		<h1>Alunos</h1>
	</div>
	<h3>Adicionar novo aluno:</h3>
	<form action="adicionarAluno" method="post">
		<table style="margin-top: 120px">
			<tr>
				<td>Matricula</td>
				<td><input type="text" name="matricula" id="matricula" /></td>
			</tr>
			<tr>
				<td>Nome:</td>
				<td><input type="text" name="nome" id="nome" /></td>
			</tr>
			<tr>
				<td>Numero:</td>
				<td><input type="text" name="numero" id="numero" /></td>
			</tr>
			<tr>
				<td>Turma:</td>
				<td><select name="Listurmas" class="btn btn-primary dropdown-toggle">
				            <option>Selecione</option>
						<c:forEach items="${turma}" var="turmas">
							<option value="${turmas.id}" name= "turma">${turmas.nome}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="Cadastrar"></td>
			</tr>
		</table>

	</form>




	<table border="1">
		<tr>
			<th size="15">id</th>
			<th>Matricula</th>
			<th>Nome</th>
			<th>Numero</th>
			<th>Turma</th>
			<th>Excluir</th>
			<th>Editar</th>
		</tr>
		<c:forEach items="${alunos}" var="aluno">
			<tr>
				<td><input type="text" value="${aluno.id}" /></td>
				<td><input type="text" value="${aluno.matricula}"
					name="matricula" /></td>
				<td><input type="text" value="${aluno.nome}" name="nome" /></td>
				<td><input type="text" value="${aluno.numero}" name="numero" /></td>
				<td><input type="text" value="${aluno.turma.nome}" name="turma" /></td>
				<td><a href="deletarAluno?id=${aluno.id}">Remover</a></td>
				<td>Alterar</td>

			</tr>
		</c:forEach>

	</table>



</body>
</html>