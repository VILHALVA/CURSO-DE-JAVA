package com.mycompany.projetoyoutube;

public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("AULA 1 DE POO");
        v[1] = new Video("AULA 12 DE PHP");
        v[2] = new Video("AULA 10 DE HTML");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("JUBILEU", 22, "M", "JUBA");
        g[1] = new Gafanhoto("CREUZA", 12, "F", "CREUZITA");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        
        Visualizacao s[] = new Visualizacao[5];
        s[0] = new Visualizacao(g[0], v[2]);
        s[1] = new Visualizacao(g[0], v[1]);
        s[0].avaliar();
        s[1].avaliar(87);
        System.out.println(s[0].toString());
        System.out.println(s[1].toString());
    }
}
