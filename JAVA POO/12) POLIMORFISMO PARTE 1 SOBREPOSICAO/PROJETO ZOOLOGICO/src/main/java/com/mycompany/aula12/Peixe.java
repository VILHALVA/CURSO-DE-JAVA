package com.mycompany.aula12;

public class Peixe extends Animal {
    private String corEscama;
    
    public void soltarBolha() {
        System.out.println("SOLTOU UMA BOLHA!");
    }

    @Override
    public void locomover() {
        System.out.println("NADANDO!");
    }

    @Override
    public void alimentar() {
        System.out.println("COMENDO ESCAMAS!");
    }

    @Override
    public void emetirSom() {
        System.out.println("PEIXE NÃO FAZ SOM!");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
