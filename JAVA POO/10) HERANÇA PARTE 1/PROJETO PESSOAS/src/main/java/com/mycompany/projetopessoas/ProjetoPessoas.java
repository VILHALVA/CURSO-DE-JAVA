package com.mycompany.projetopessoas;

public class ProjetoPessoas {
    public static void main(String[] args) {
       Pessoa p1 = new Pessoa();
       Aluno p2 = new Aluno();
       Professor p3 = new Professor();
       Funcionario p4 = new Funcionario();
       
       p1.setNome("PEDRO");
       p1.setIdade(20);
       p1.setSexo("M");
       
       p2.setNome("MARIA");
       p2.setIdade(25);
       p2.setSexo("F");
       p2.setCurso("INFORMATICA");
       p2.cancelarMatr();
       
       p3.setNome("CLÁUDIA");
       p3.setIdade(20);
       p3.setSexo("F");
       p3.setSalario(2500.25f);
       
       p4.setNome("FABIANA");
       p4.setIdade(19);
       p4.setSexo("F");
       p4.setSetor("ESTOQUE");
       
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());                
    }
}
