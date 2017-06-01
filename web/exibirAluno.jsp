<%-- 
    Document   : exibirAluno
    Created on : 24/05/2017, 21:41:05
    Author     : alunoces
--%>

<jsp:useBean id="aluno" scope="session" class="beans.Aluno" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center> 
        <h1>Aluno matriculado</h1>
        <p> 
            Matricula:<b>${aluno.matricula}</b><br>
            Nome:<b>${aluno.nome}</b><br>
            Curso:<b>${aluno.curso}</b><br>
            Período:<b>${aluno.periodo}</b><br>
            Ano Ingresso:<b>${aluno.anoIngresso}</b><br>
            Renda:<b>${aluno.renda}</b>

        </p>


    </center>
</body>
</html>
