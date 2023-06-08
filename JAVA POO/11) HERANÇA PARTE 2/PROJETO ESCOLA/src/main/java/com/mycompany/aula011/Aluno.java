package com.mycompany.aula011;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    public void pagarMensalidade() {
        // public final void pagarMensalidade() > ESSE METODO (TAMBÉM PODE SER USADO EM CLASS) NÃO PODE SER SOBREPOSTO (@Override).
        System.out.println("MENSALIDADE PAGA COM SUCESSO! "+this.nome);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
