<?php

if (!isset($_GET['buscar'])) {
  header("Location: /");
  exit;
}
$con = mysql_connect('localhost','root','1234');
mysql_select_db('biblioteca', $con);

$busca = mysql_real_escape_string($_GET['buscar']);

// Monta outra consulta MySQL para a busca
$sql = "SELECT * FROM `turmas_2017` WHERE ((`nome` LIKE '%".$busca."%') OR ('%".$busca."%')) ORDER BY `nome` DESC";
// Executa a consulta
$query = mysql_query($sql);

echo "<ul>";
while ($resultado = mysql_fetch_assoc($query)) {
  $titulo = $resultado['nome'];
  $link = '/FuncTurma.jsp?id=' . $resultado['id'];
  
  echo "<li>";
    echo "<a href='{$link}'>";
      echo "<h3>{$nome}</h3>"
    echo "</a>";
  echo "</li>";
}
echo "</ul>";
