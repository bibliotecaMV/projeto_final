<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BIBLIOTECA LTV</title>
</head>
<body>
	<h1>LISTA DE MONITOR</h1>
	<table border="2">
		<tr>
			<td><input type="text" name="pesquisar" /></td>
			<td><input type="submit" value="Pesquisar"></td>
		</tr>
		<tr>
			<th>Id</th>
			<th>Usuario</th>
			<th>Senha</th>
			<th>aluno</th>
			<th>Excluir</th>
			<th>Alterar</th>
		</tr>
		<c:forEach items="${monitores}" var="monitor">
			<tr>
				<td>${monitor.id}</td>
				<td>${monitor.usuario}</td>
				<td>${monitor.senha}</td>
				<td>${monitor.aluno.nome}</td>
				<td><a href = "deletaMonitores?id=${monitor.id}">Remover</a></td>
				<td><a href = "deletaMonitores?id=${monitor.id}">Alterar</a></td>
			</tr>
		</c:forEach>
	</table>
	<h1>CADASTRAR MONITOR:</h1>
	<form action="adicionarMonitores" method="post">
		<table>
			<tr>
				<td>Usuario:</td>
				<td><input type="text" name="usuario" required/></td>
			</tr>
			<tr>
				<td>Senha:</td>
				<td><input type="password" name="senha" required/></td>
			</tr>
			
			<tr>
		        <td>Alunos</td>
				<td><select name="aluno">
		        <c:forEach items="${alunos}" var="aluno"> 	
				    <option>${aluno.nome}</option>
				</c:forEach>
				</select></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Cadastra" /></td>
			</tr>
		</table>
	</form>
</body>
</html>