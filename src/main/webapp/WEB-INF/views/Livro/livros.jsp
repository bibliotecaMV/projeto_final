<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Livros</title>

</head>

<body>
	<div>
		<div id="esquerda">

			<h1>ADICIONAR LIVROS</h1>
			<!-- 
			<form action="adicionarLivros" method = "post">
				<table border="2" width="300px" bordercolor="gray">
					<tr>
						<th colspan="2">ADICIONAR LIVROS</th>
					</tr>

					<tr>
						<th>ToMbO:</th>
						<td><input type="text" name="tombo" /></td>
					</tr>

					<tr>
						<th>Forma de Aquisição:</th>
						<td><input type="text" name="forma_aquisicao" id="forma_aquisicao" /></td>
					</tr>

					<tr>
						<th>Título :</th>
						<td><input type="text" name="titulo" id="titulo" /></td>
					</tr>

					<tr>
						<th>Autor:</th>
						<td><input type="text" name="autor" id="autor" /></td>
					</tr>

					<tr>
						<th>Volume:</th>
						<td><input type="number" name="volume" id="volume" /></td>
					</tr>

					<tr>
						<th>Exemplares:</th>
						<td><input type="number" name="exemplares" id="exemplares" /></td>
					</tr>

					<tr>
						<th>Editora:</th>
						<td><input type="text" name="editora" id="editora" /></td>
					</tr>

					<tr>
						<th>Local da edição:</th>
						<td><input type="text" name="local_edicao" id="local_edicao" /></td>
					</tr>

					<tr>
						<th>Ano editado:</th>
						<td><input type="text" name="ano_editado" id="ano_editado" /></td>
					</tr>

					<tr>
					    <th>Genero</th>
						<td><select name="genero">
								<option>Selecione</option>
								<c:forEach items="${generos}" var="genero">
									<option>${genero.descricao}</option>
								</c:forEach>
						</select>
						</td>
					</tr>
					<tr>
						<td><input type="submit"value="Adicionar" />
						<td> <input type="reset" value="Limpar" /></td>
					</tr>
				</table>
			</form>
		</div>

	</div>
-->
	<table border="1">
		<tr>
			<th size="10">Tombo</th>
			<th>CDD</th>
			<th>Ano editado</th>
			<th>Autor</th>
			<th>Editora</th>
			<th>Exemplares</th>
			<th>Forma de aquisição</th>
			<th>Local da Edição</th>
			<th>Titulo</th>
			<th>Volume</th>
			<th>Genero</th>
			<th>Excluir</th>
			<th>Alterar</th>
		</tr>
		<c:forEach items="${livros}" var="livro">
			<tr>
				<td><input type="number" name="tombo" value="${livro.tombo}" /></td>
				<td><input type="text" name="CDD" value="${livro.CDD}" /></td>
				<td><input type="text" name="ano_editado"
					value="${livro.ano_editado}" /></td>
				<td><input type="text" name="autor" value="${livro.autor}" />
				<td><input type="text" name="editora" value="${livro.editora}" /></td>
				<td><input type="text" name="exemplares"
					value="${livro.exemplares}" /></td>
				<td><input type="text" name="forma_aquisicao"
					value="${livro.forma_aquisicao}" /></td>
				<td><input type="text" name="local_edicao"
					value="${livro.local_edicao}" /></td>
				<td><input type="text" name="titulo" value="${livro.titulo}" /></td>
				<td><input type="text" name="volume" value="${livro.volume}" /></td>
				<td><input type="text" name="genero"
					value="${livro.genero.descricao}" /></td>
				<td><a href="deletarAluno?id=${livro.tombo}">Remover</a></td>
				<td>alterar</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>