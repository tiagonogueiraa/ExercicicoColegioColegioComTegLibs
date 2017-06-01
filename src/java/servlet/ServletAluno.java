/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import beans.Aluno;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import persistencia.AlunoBD;

/**
 *
 * @author alunoces
 */
@WebServlet(name = "ServletAluno", urlPatterns = {"/ServletAluno"})
public class ServletAluno extends HttpServlet {

    private AlunoBD bd = new AlunoBD();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int opcao = Integer.parseInt(request.getParameter("opcao").toString());
        RequestDispatcher rd = null;
        if (opcao == 1)//inserir um aluno
        {
            Aluno aluno = new Aluno();

            aluno.setMatricula(request.getParameter("matricula"));
            aluno.setNome(request.getParameter("nome"));
            aluno.setCurso(request.getParameter("curso").toString());
            aluno.setAnoIngresso(Integer.parseInt(request.getParameter("anoIngresso").toString()));
            aluno.setPeriodo(request.getParameter("periodo").toString());
            aluno.setRenda(Float.parseFloat(request.getParameter("renda").toString()));

            bd.adicionarAluno(aluno);

            rd = request.getRequestDispatcher("ServletAluno?opcao=2");

        }

        if (opcao == 2) // listar os objeto da lista
        {
            List<Aluno> todos = bd.buscarTodos();

            HttpSession session = request.getSession(true);
            session.setAttribute("lista", todos);

            rd = request.getRequestDispatcher("listarAlunos.jsp");

        }

        if (opcao == 3) // 
        {
            String matricula = request.getParameter("matricula");

            rd = request.getRequestDispatcher("ServletAluno?opcao=2");

            Aluno a = bd.buscaAluno(matricula);
            if (a != null) {
                bd.removerAluno(a);
            }
        }

        if (opcao == 4) {
            Aluno a = bd.buscaAluno(request.getParameter("vMatricula"));
            if (a != null) {
                
                HttpSession session = request.getSession();
                session.setAttribute("aluno", a);
                
                rd = request.getRequestDispatcher("exibirAluno.jsp");
            }
            else 
            {
                rd = request.getRequestDispatcher("buscarAluno.jsp?erro=1");
            }
            
            

        }

        rd.forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
