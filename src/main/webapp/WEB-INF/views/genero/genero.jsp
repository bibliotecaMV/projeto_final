<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<title>Genero</title>
<meta charset="utf-8" />
<script type="text/javascript" src="resources/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="resources/js/generos/generos.js"></script>
</head>
<body>
	<center>
		<h1>Generos</h1>
	</center>
	<div id="form_adicao">
		<form action="cadastrarGenero" method="post">
			<table>
				<tr>
					<td>Descrição:</td>
					<td><input type="text" name="descricao" /></td>
				</tr>
				<tr>
					<td>Sigla:</td>
					<td><input type="name" name="sigla" /></td>
				</tr>
			</table>
			<input type="submit" value="Cadastrar">
		</form>
		<br><br>
	</div>
	<br>
	<br>
	<div id="pesquisa">
		<form action="listarGenerosNaTable" method="post">
			Descrição: <input type="text" name="descricao2">
			<input type="submit" value="Pesquisar">
		</form>
	</div>
	<div>
		<table border="1">
			<tr>
				<td>Id</td>
				<td>Descrição</td>
				<td>Sigla</td>
				<td>Excluir</td>
				<td>Alterar</td>
			</tr>
			<c:forEach items="${generos}" var="genero">
				<form action="alterarGenero" method="post">
					<tr id="linha_${genero.id}">
						<td><input type="text" value="${genero.id}" name="id"/></td>
						<td><input type="text" value="${genero.descricao}" name="descricao" /></td>
						<td><input type="text" value="${genero.sigla}" name="sigla"/></td>
						<td><a href="#" onClick="removerGenero(${genero.id})">Excluir</a></td>
						<td><input type="submit" value="Alterar" /></td>
					</tr>
				</form>	
			</c:forEach>
		</table>
	</div>
</body>
</html>