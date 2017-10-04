<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sobre Administradores</title>
<style type="text/css">



</style>
</head>
<body>
	<br />
	<center>

		<h1 >Administradores</h1>

		<br /> Adicione um novo: <br />
		<form action="adicionaAdministrador" method="post">
			<table border="1" style="margin-top: 120px;" name="novaAdministrador">
				<tr>
					<td>Nome:</td>
					<td><input type="text" name="usuario" id="usuario"
						placeholder="Joãozinho" /></td>
				</tr>
				<tr>
					<td>Senha:</td>
					<td><input type="text" name="senha" id="senha"
						placeholder="********" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Salvar" /></td>
				</tr>
				<br />

			</table>
		</form>
		<br />

		<table name="buscaInteligente">
			<tr>
				<td><input type="text" id="busca" /></td>
				<td><input type="submit" id="buscar" value="Pesquisar"></td>
			<tr>
		</table>

		<table border="2">

			<tr>
				<th size="15">id</th>
				<th>Nome</th>
				<th>Deletar</th>
				<th>Alterar</th>
			</tr>
			<c:forEach items="${administradores}" var="administrador">
				<tr>
					<td><input type="text" value="${administrador.id}" disabled /></td>
					<td><input type="text" value="${administrador.usuario}"
						name="usuario" id="usuario" /></td>
					<td><a href="deletaAdministrador?id=${administrador.id}">Remover</a></td>
					<td><a
						href="alteraAdministrador?id=${administrador.id}&&usuario=${administrador.usuario}">Alterar</a></td>
				</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>