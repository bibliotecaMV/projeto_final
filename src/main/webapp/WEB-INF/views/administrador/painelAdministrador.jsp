<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
<title>BIBLIOTECA LTV - MV INFORMATICA</title>
<link rel="stylesheet" type="text/css" href="resources/css/style.css">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript"
	src="resources/js/administrador/administrador.js"></script>
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
						<h3 align="center" class="panel-title">Menu</h3>
					</div>

					<div class="panel-body">

						<div class="col-lg-12" id="centro">
							<div class="col-lg-3" id="centro">
								<a href="listaLivros" class="item link">

									<div id="centraliza" class="centraliza">
										<center>
											<div class="circulo2">
												<img src="resources/img/livro.png" border="0">
											</div>
										</center>
									</div>
									<div class="titulo">
										<div class="borda">
											<center>
												<span>Livros</span>
											</center>
										</div>
									</div>
								</a>
							</div>

							<div class="col-lg-3" id="centro">
								<a href="listarGeneros" class="item">
									<div id="centraliza" class="centraliza">
										<center>
											<div class="circulo2">
												<img src="resources/img/genero.png" border="0">
											</div>
										</center>
									</div>
									<div class="titulo">
										<div class="borda">
											<center>
												<span>Gêneros</span>
											</center>
										</div>
									</div>
								</a>
							</div>

							<div class="col-lg-3" id="centro">
								<a href="listarProfessores" class="item">
									<div id="centraliza" class="centraliza">
										<center>
											<div class="circulo2">
												<img src="resources/img/professor.png" border="0">
											</div>
										</center>
									</div>
									<div class="titulo">
										<div class="borda">
											<center>
												<span>Professores</span>
											</center>
										</div>
									</div>
								</a>
							</div>

							<div class="col-lg-3" id="centro">
								<a href="listarAlunos" class="item">

									<div id="centraliza" class="centraliza">
										<center>
											<div class="circulo2">
												<img src="resources/img/aluno.png" border="0">
											</div>
										</center>
									</div>
									<div class="titulo">
										<div class="borda">
											<center>
												<span>Alunos</span>
											</center>
										</div>
									</div>
								</a>
							</div>


						</div>

						<div class="col-lg-12" id="centro">
							<div class="col-lg-3" id="centro">
								<a href="mostrarEmprestimos" class="item">
									<div id="centraliza" class="centraliza">
										<center>
											<div class="circulo2">
												<img src="resources/img/emprestimo.png" border="0">
											</div>
										</center>
									</div>
									<div class="titulo">
										<div class="borda">
											<center>
												<span>Empréstimos e Devoluções</span>
											</center>
										</div>
									</div>
								</a>
							</div>



							<div class="col-lg-3" id="centro">
								<a href="sobreTurmas" class="item">

									<div id="centraliza" class="centraliza">
										<center>
											<div class="circulo2">
												<img src="resources/img/turma.png" border="0">
											</div>
										</center>
									</div>
									<div class="titulo">
										<div class="borda">
											<center>
												<span>Turmas</span>
											</center>
										</div>
									</div>
								</a>
							</div>


							<div class="col-lg-3" id="centro">
								<a href="listarMonitores" class="item">
									<div id="centraliza" class="centraliza">
										<center>
											<div class="circulo2">
												<img src="resources/img/monitor.png" border="0">
											</div>
										</center>
									</div>
									<div class="titulo">
										<div class="borda">
											<center>
												<span>Monitores</span>
											</center>
										</div>
									</div>
								</a>
							</div>

							<div class="col-lg-3" id="centro">
								<a href="sobreAdministrador" class="item">
									<div id="centraliza" class="centraliza">
										<center>
											<div class="circulo2">
												<img src="resources/img/admConfig.png" border="0">
											</div>
										</center>
									</div>
									<div class="titulo">
										<div class="borda">
											<center>
												<span>Aréa do Administrador</span>
											</center>
										</div>
									</div>
								</a>
							</div>

						</div>
					</div>
				</div>






			</div>
		</div>
	</div>



	<!--/.Rodapé -->
	<hr>
	<footer class="footer">
		<div class="container">
			<p class="text-muted" align="center">© 2017 - Governo do Estado
				do Ceará - Todos os direitos reservados</p>
		</div>
	</footer>

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