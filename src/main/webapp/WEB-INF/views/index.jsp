<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
  <head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conte�do deve vir *ap�s* essas tags -->
    <title>BIBLIOTECA LTV - MV INFORMATICA</title>

    <!-- Bootstrap -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="resources/css/style.css">
    <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->
    <!-- ALERTA: Respond.js n�o funciona se voc� visualizar uma p�gina file:// -->
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
                    <a href="realizarLoginAdministrador" class="item" style="margin-left: 35px; margin-right: 35px;">
                          <div id="centraliza" class="centraliza" >
                             <center> <div class="circulo" >
                                  <img src="resources/img/adm.png" border="0">
                              </div></center>
                          </div>
                          <div class="titulo">
                              <div class="borda">
                                <center> <span>ADMINISTRADOR</span></center>
                              </div>
                          </div>
                    </a>
              </div>
                  <div class="col-lg-6" id="centro">
                    <a href="realizarLoginMonitor" class="item page-scroll" style="margin-left: 35px; margin-right: 35px;">
                          <div id="centraliza" class="centraliza" >
                             <center> <div class="circulo" >
                                  <img src="resources/img/monitor.png" border="0">
                              </div></center>
                          </div>
                          <div class="titulo">
                              <div class="borda">
                                 <center> <span>MONITOR</span></center>
                              </div>
                          </div>
                      </a>
                  </div>
            </div>
        </div>
    </div>
    <!--/.Rodap� -->
    <hr>
    <footer class="footer">
      <div class="container">
        <p class="text-muted" align="center">� 2017 - Governo do Estado do Cear� - Todos os direitos reservados</p>
      </div>
    </footer>
    <!-- jQuery (obrigat�rio para plugins JavaScript do Bootstrap) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necess�rio -->
    <script src="resources/js/bootstrap.min.js"></script>
  </body>
</html>