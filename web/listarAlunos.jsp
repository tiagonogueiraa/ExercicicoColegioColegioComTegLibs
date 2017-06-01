<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : listarAlunos
    Created on : 18/05/2017, 20:09:10
    Author     : alunoces
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista Alunos</h1>
        
        <p>
        <table cellspacing="2" cellpadding="5" border="2"> 
            <tr> 
            <tr>
                <th>Matricula</th>
                <th>Nome</th>
                <th>Curso</th>
                <th>Periodo</th>
                <th>Ano de Ingresso</th>
                <th>Ação</th>
            </tr>
            </tr>
            <c:forEach var="aluno" items="${sessionScope.lista}">
                
                <tr>
                    <td>${aluno.matricula}</td>
                    <td>${aluno.nome}</td>
                    <td>${aluno.curso}</td>
                    <td>${aluno.periodo}</td>
                    <td>${aluno.anoIngresso}</td>
                    <td><a href="ServletAluno?opcao=3&matricula=${aluno.matricula}">Remover</a></td>
                </tr>
            </c:forEach>
            
    </table>
        <p>
            <a href="CadastroAluno.jsp"> Cadastrar um novo Aluno</a></p>
            <a href="buscarAluno.jsp"> Buscar um Aluno</a></p>
        
        </p>
    </body>
</html>
