<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
<title>BIBLIOTECA LTV - MV INFORMATICA</title>

<!-- Bootstrap -->
<link type="text/css" href="resources/css/style.css" rel="stylesheet" />
<link type="text/css" href="resources/css/bootstrap.min.css"
	rel="stylesheet">
<!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->
<!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<!-- TOPO-->
	<nav class="navbar navbar-default">
		<div class="container">
			<div id="logo" align="center">
				<img src="resources/img/logo.png">
			</div>
		</div>
	</nav>

	<div class="container">
		<div class="starter-template">
			<h3 align="center">Sistema Gerenciador de Biblioteca</h3>
			<p align="center">SEJA BEM VINDO</p>
		</div>
	</div>

	<div class="container">
		<div id="content">
			<div class="row">
				<div class="col-lg-6" id="centro">

					<a href="#one" class="item"
						style="margin-left: 35px; margin-right: 35px;" data-toggle="modal"
						data-target="#administrador">


						<div id="centraliza" class="centraliza">
							<center>
								<div class="circulo">
									<img src="resources/img/adm.png" border="0">
								</div>
							</center>
						</div>

						<div class="titulo">
							<div class="seta">&nbsp;</div>
							<div class="borda">
								<center>
									<span>ADMINISTRADOR</span>
								</center>
							</div>
						</div>
					</a>

				</div>

				<div class="col-lg-6" id="centro">

					<a href="#one" class="item page-scroll"
						style="margin-left: 35px; margin-right: 35px;" data-toggle="modal"
						data-target="#monitor">


						<div id="centraliza" class="centraliza">
							<center>
								<div class="circulo">
									<img src="resources/img/monitor.png" border="0">
								</div>
							</center>
						</div>

						<div class="titulo">
							<div class="seta">&nbsp;</div>
							<div class="borda">
								<center>
									<span>MONITOR</span>
								</center>
							</div>
						</div>
					</a>

				</div>

			</div>
		</div>
	</div>



	<!--/.Rodapé -->
	<hr>
	<footer class="footer">
		<div class="container">
			<p class="text-muted" align="center">© 2011 - Governo do Estado
				do Ceará - Todos os direitos reservados</p>
		</div>
	</footer>


	<!--modal administrador-->
	<div class="modal fade" id="administrador" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="exampleModalLabel">ADMINISTRADOR</h4>
				</div>
				<div class="modal-body">
					<form id="" method="post" action="" class="form-horizontal">

						<div class="form-group">
							<label for="usuario" class="col-sm-3 control-label">Usuário</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" id="usuario"
									placeholder="caahup1" name="usuario" required />
							</div>
						</div>

						<div class="form-group">
							<label for="senha" class="col-sm-3 control-label">Senha</label>
							<div class="col-sm-9">
								<input type="password" class="form-control" id="senha"
									placeholder="********" name="senha" required />
							</div>
						</div>
				</div>
				<div class="modal-footer">
					<button type="submit" class="btn btn-warning">Acessar</button>
					<button type="reset" class="btn btn-danger">Limpar</button>
				</div>
				</form>
			</div>
		</div>
	</div>
	</div>
	<!--fim modal-->

	<!--modal monitor-->
	<div class="modal fade" id="monitor" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="exampleModalLabel">MONITOR</h4>
				</div>
				<div class="modal-body">
					<form id="" method="post" action="" class="form-horizontal">

						<div class="form-group">
							<label for="usuario" class="col-sm-3 control-label">Usuário</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" id="usuario"
									placeholder="caahup1" name="usuario" required />
							</div>
						</div>

						<div class="form-group">
							<label for="senha" class="col-sm-3 control-label">Senha</label>
							<div class="col-sm-9">
								<input type="password" class="form-control" id="senha"
									placeholder="********" name="senha" required />
							</div>
						</div>
				</div>
				<div class="modal-footer">
					<button type="submit" class="btn btn-warning">Acessar</button>
					<button type="reset" class="btn btn-danger">Limpar</button>
				</div>
				</form>
			</div>
		</div>
	</div>
	</div>
	<!--fim modal-->



	<!-- jQuery (obrigatório para plugins JavaScript do Bootstrap) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necessário -->
	<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>