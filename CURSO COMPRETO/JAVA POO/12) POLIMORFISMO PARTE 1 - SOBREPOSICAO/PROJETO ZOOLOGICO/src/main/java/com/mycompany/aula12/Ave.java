package com.mycompany.aula12;

public class Ave extends Animal {
    private String corPena;
    
    public void fazendoNinho() {
        System.out.println("CONSTRUINDO UM NINHO!");
    }

    @Override
    public void locomover() {
        System.out.println("VOANDO!");
    }

    @Override
    public void alimentar() {
        System.out.println("COMENDO FRUTAS!");
    }

    @Override
    public void emetirSom() {
        System.out.println("SOM DE AVE!");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
