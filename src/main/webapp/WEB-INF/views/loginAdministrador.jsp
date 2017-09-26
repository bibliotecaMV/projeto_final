<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BIBLIOTECA LTV - MV INFORMATICA</title>

    <!-- Bootstrap -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="resources/css/style.css">
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
              <div class="panel panel-warning">
                <div class="panel-heading"> <center>ADMINISTRADOR</center>
                </div>
                <div class="panel-body">
                    <form class="form-horizontal">
                       <div class="form-group">
                      <label for="usuario" class="col-sm-3 control-label">Usuário</label>
                      <div class="col-sm-5">
                        <input type="text" class="form-control" id="usuario" placeholder="caahup1" name="usuario" required/>
                      </div>
                    </div>

                    <div class="form-group">
                      <label for="senha" class="col-sm-3 control-label" >Senha</label>
                      <div class="col-sm-5">
                        <input type="password" class="form-control" id="senha" placeholder="********" name="senha" required/>
                      </div>
                    </div>
                    <div class="modal-footer">
                        <button type="reset" class="btn btn-danger">Limpar</button>
                        <button type="submit" class="btn btn-warning">Acessar</button>
                    </div>
                  </form>
                </div>
              </div>
            </div>
        </div>
    </div>



    <!--/.Rodapé -->
    <hr>
    <footer class="footer">
      <div class="container">
        <p class="text-muted" align="center">© 2017 - Governo do Estado do Ceará - Todos os direitos reservados</p>
      </div>
    </footer>

    <!-- jQuery (obrigatório para plugins JavaScript do Bootstrap) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necessário -->
    <script src="resources/js/bootstrap.min.js"></script>
</body>
</html>