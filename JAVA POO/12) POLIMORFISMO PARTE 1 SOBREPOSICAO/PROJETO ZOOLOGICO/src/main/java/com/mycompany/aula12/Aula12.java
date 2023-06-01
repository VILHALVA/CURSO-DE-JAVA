package com.mycompany.aula12;

public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        m.setCorPelo("MARROM");
        m.setPeso(35.6f);
        m.alimentar();
        m.emetirSom();
        m.locomover();
        System.out.println(m.toString());
        
        Reptil r = new Reptil();
        r.setCorEscama("ROSA");
        r.setIdade(22);
        r.setMembros(0);
        r.setPeso(2);
        r.alimentar();
        r.emetirSom();
        r.locomover();
        System.out.println(r.toString());
        
        Peixe p = new Peixe();
        p.setCorEscama("PRETO");
        p.setIdade(5);
        p.setMembros(0);
        p.setPeso(4);
        p.soltarBolha();
        p.alimentar();
        p.emetirSom();
        p.locomover();
        System.out.println(p.toString());
        
        Ave a = new Ave();
        a.setCorPena("BRANCA");
        a.setIdade(15);
        a.setMembros(2);
        a.setPeso(1);
        a.alimentar();
        a.emetirSom();
        a.fazendoNinho();
        a.locomover();
        System.out.println(a.toString());
        
        Canguru c = new Canguru();
        c.usarBolsa();
        c.locomover();
        System.out.println(c.toString());
        
        Cachorro k = new Cachorro();
        k.locomover();
        k.emetirSom();
        System.out.println(k.toString());
        
        Cobra o = new Cobra();
        System.out.println(o.toString());
        
        Tartaruga t = new Tartaruga();
        System.out.println(t.toString());
        
        Goldfish g = new Goldfish();
        System.out.println(g.toString());
        
        Arara w = new Arara();
        System.out.println(w.toString());
    }
}
