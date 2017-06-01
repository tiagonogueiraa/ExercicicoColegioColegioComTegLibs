<%-- 
    Document   : CadastroAluno
    Created on : 18/05/2017, 19:12:24
    Author     : alunoces
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String msg = "";
    if(request.getParameter("erro") != null)
    {
       // if(Integer.parseInt(request.getParameter("erro")) == 1)
        msg = "<b><font size='2' color='red'> Aluno não foi encontrado!</b>";
    }
    %>
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
        <h1 >Buscar Aluno</h1>
        <div id="formulario">
            <form action="ServletAluno" method="get">
                Digite a matricula para buscar o aluno:
                <input type="text" name="vMatricula" value="" size="10" />
                <input type="hidden" name="opcao" value="4"/>
                <tr align="center"><td> 

                        <input type="submit" value="Gravar" />
                        <input type="reset" value="Limpar"/>

                    </td>
            </form></div>
        <p><%= msg %></p>
    </center>

</body>
</html>
