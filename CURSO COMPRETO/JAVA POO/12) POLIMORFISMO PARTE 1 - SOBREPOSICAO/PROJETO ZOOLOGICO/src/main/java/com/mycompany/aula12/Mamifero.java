package com.mycompany.aula12;

public class Mamifero extends Animal {
    private String corPelo;
    
    @Override
    public void locomover() {
        System.out.println("CORRENDO!");
    }
    
    @Override
    public void alimentar() {
        System.out.println("MAMANDO!");
    }
    
    @Override
    public void emetirSom() {
        System.out.println("SOM DE MAMIFERO!");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
