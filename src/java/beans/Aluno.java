/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author alunoces
 */
public class Aluno {
    
    private String matricula;
    private String nome;
    private String curso;
    private String periodo;
    
    private int anoIngresso;
    private float renda;

    public Aluno() {
    }

    public Aluno(String matricula, String nome, String curso, String periodo, int anoIngresso, float renda) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.periodo = periodo;
        this.anoIngresso = anoIngresso;
        this.renda = renda;
        
    }

    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

  

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

  
    
    
    
    
    
}
