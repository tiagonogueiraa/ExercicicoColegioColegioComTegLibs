<%-- 
    Document   : CadastroAluno
    Created on : 18/05/2017, 19:12:24
    Author     : alunoces
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>


        </style>
    </head>
    <body>
    <center> 
        <h1 >Cadastro Aluno</h1>
        <div id="formulario">
            <form action="ServletAluno" method="get">
                <p><label>Matricula: <input type="text" name="matricula" value="" size="30" /></label></p>
                <p><label>Nome: <input type="text" name="nome" value="" size="30" /></label></p>
                <p><label>Curso<select name="curso">
                            <option value="Sistema de Informação">Sistemas de Informação</option>
                            <option value="Administração">Administração</option>
                            <option value="Direito">Direito</option>
                        </select></label></p>
                <p><label>Período: <input type="text" name="periodo" value="" size="30" /></label></p>
                <p><label>Ano Ingresso: <input type="text" name="anoIngresso" value="" size="30" /></label></p>
                <p><label>Renda: <input type="text" name="renda" value="" size="30" /></label></p>
                <input type="hidden" value="1" name="opcao"/>
                <input type="submit" value="Gravar" />
                <input type="reset" value="Limpar"
            </form></div>
    </center>

</body>
</html>
