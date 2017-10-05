<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<title>Empr�stimos</title>
<meta charset="utf-8" />
<script type="text/javascript" src="resources/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="resources/js/emprestimos/emprestimos.js"></script>
</head>
<body>
	<center>
		<h1>Empr�stimos</h1>
	</center>
	<br>
	<br>
	<br>
	<div id="escolha">
		<input type="radio" name="radio" onclick="habilitarAlunosAdicionar();" checked>Aluno
		<input type="radio" name="radio" onclick="habilitarProfessoresAdicionar();">Professor
	</div>
	<form action="realizarEmprestimos" method="POST" name="formulario">
		<table id="esquerda">
			<tr>
				<td>Tombo:</td>
				<td><input type="text" name="tombo1" /></td>
			</tr>
			<tr>
				<td>Turma:</td>
				<td><select name="turma1" id="turma1">
						<option selected>Selecione</option>
						<c:forEach items="${turmas}" var="turma">
							<option>${turma.nome}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>Aluno:</td>
				<td><input type="text" name="aluno1" id="aluno1" /></td>
			</tr>
			<tr>
				<td>Professor:</td>
				<td><select name="professor1" id="professor1" disabled>
						<option selected>Selecione</option>
						<c:forEach items="${professores}" var="professor">
							<option>${professor.nome}</option>
						</c:forEach>
				</select></td>
			</tr>
		</table>
		<br> <input type="submit" value="Realizar Empr�stimo" />
	</form><br><br>
	<form name="formulario2" action="listarEmprestimos" method="post">
		<div id="opcoes">
			<input type="radio" name="option" value="todos" onclick="desabilitarAlunosProfessoresListar();" checked>Todos 
			<input type="radio" name="option" value="alunos"  onclick="habilitarAlunosListar();">Alunos
			<select name="turma2" id="turma2" disabled>
				<option>Turma:</option>
				<c:forEach items="${turmas}" var="turma">
					<option>${turma.nome}</option>
				</c:forEach>
			</select>
			<input type="text" name="aluno2" id="aluno2" disabled>
			<input type="radio" name="option" value="professores"  onclick="habilitarProfessorListar();">Professores 
			<select name="professor2" id="professor2" disabled>
				<option>Professor:</option>
				<c:forEach items="${professores}" var="professor">
					<option>${professor.nome}</option>
				</c:forEach>
			</select> 
			<input type="checkbox" name="selection" value="devolvidos">Devolvidos
			<input type="submit" value="Pesquisar">
		</div>
	</form>
	<br>
	<table id="direito" border="1">
		<tr>
			<td>Id</td>
			<td>Livro</td>
			<td>Aluno</td>
			<td>Professor</td>
			<td>Turma</td>
			<td>Data do Empr�stimo</td>
			<td>Data da Devolu��o</td>
			<td>Devolver</td>
			<td>Excluir</td>
			<td>Alterar</td>
		</tr>
		<c:forEach var="emprestimos" items="${emprestimos}">
			<tr id="linha_${emprestimos.id}">
				<td><center>
						<input type="text" name="id" value="${emprestimos.id}" disabled />
					</center></td>
				<td><center>
						<input type="text" name="tombo" value="${emprestimos.livro.tombo}" />
					</center></td>

				<c:if test="${emprestimos.aluno.nome == null }">
					<td>Vazio</td>
				</c:if>
				<c:if test="${emprestimos.aluno.nome != null }">
					<td><center>
							<input type="text" name="aluno" value="${emprestimos.aluno.nome}" />
						</center></td>
				</c:if>
				<c:if test="${emprestimos.professor.nome == null }">
					<td>Vazio</td>
				</c:if>
				<c:if test="${emprestimos.professor.nome != null }">
					<td><center>
							<input type="text" name="professor"
								value="${emprestimos.professor.nome}" />
						</center></td>
				</c:if>
				<c:if test="${emprestimos.turma.nome == null }">
					<td>Vazio</td>
				</c:if>
				<c:if test="${emprestimos.turma.nome != null }">
					<td><center>
							<input type="text" name="turma" value="${emprestimos.turma.nome}" />
						</center></td>
				</c:if>
				<td><center>
						<input type="text" name="dataEmprestimo"
							value="${emprestimos.dataEmprestimoFormatada}" />
					</center></td>
				<c:if test="${emprestimos.dataDevolucaoFormatada == null}">
					<td id="campo_devolucao_${emprestimos.id}">N�o devolvido</td>
				</c:if>
				<c:if test="${emprestimos.dataDevolucaoFormatada != null}">
					<td id="campo_devolucao_${emprestimos.id}"><input type="text"
						name="dataDevolucao" value="${emprestimos.dataDevolucaoFormatada}" /></td>
				</c:if>
				<c:if test="${emprestimos.dataDevolucaoFormatada == null}">
					<td id="emprestimo_${emprestimos.id}"><a href="#"
						onClick="realizarDevolucao(${emprestimos.id})"> Devolver
							Agora </a></td>
				</c:if>
				<c:if test="${emprestimos.dataDevolucaoFormatada != null}">
					<td>Devolvido</td>
				</c:if>
				<td><a href="#" onclick="removerEmprestimo(${emprestimos.id});">Excluir</a></td>
				<td><a href="#">Alterar</a></td>
			</tr>
		</c:forEach>
	</table>
	

</body>
</html>