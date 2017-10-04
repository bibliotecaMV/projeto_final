<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BIBLIOTECA LTV</title>
</head>
<body>
     <h1>LISTA DE PROFESSORES:</h1>
     <table border="2">
        <tr>
          <td><input type="text" name="pesquisar"/></td>
          <td><input type ="submit" value="Pesquisar"></td>
        </tr>
        <tr>
         <th>Id</th>
         <th>Matricula</th>
         <th>Nome Completo</th>
         <th>Deleta</th>
         <th>Alterar</th>
        </tr>
        <c:forEach items="${professores}" var="professor">
        <tr>
            <td>${professor.id}</td>
		    <td>${professor.matricula}</td>
		    <td>${professor.nomeCompleto}</td>
		    <td><a href = "deletaProfessores?id=${professor.id}">Remover</a></td>
		    <td><a href = "mostraProfessores?id=${professor.id}">Alterar</a></td>
        </tr>
        </c:forEach>
     </table>
     <h1>CADASTRAR PROFESSOR:</h1>
     <form action="adicionaProfessores" method="post">
     <table>
       <tr>
         <td>Nome Completo:</td>
         <td><input type="text" name="nomeCompleto" required/></td>
       </tr>
       <tr>  
         <td>Matricula:</td>
         <td><input type="text" name="matricula" required/></td>
       </tr>
       <tr>
         <td><input type="submit" value="Cadastra"/></td>
       </tr>  
     </table>         
     </form>
</body>
</html>