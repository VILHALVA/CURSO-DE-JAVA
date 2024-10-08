package com.mycompany.aula011;

public class Aula011 {
    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa(); > CLASSE ABSTRATA NÃO PODE SER INSTANCIADA.
        Visitante v1 = new Visitante();
        v1.setNome("JOVENAL");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("CLAUDIO");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.setCurso("INFORMATICA");
        a1.setMatricula(1111);
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setNome("JUBILEU");
        b1.setIdade(44);
        b1.setSexo("M");
        b1.setCurso("PROGRAMAÇÃO");
        b1.setMatricula(1112);
        b1.pagarMensalidade();
        System.out.println(b1.toString());
    }
}
