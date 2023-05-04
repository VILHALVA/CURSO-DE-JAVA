package com.mycompany.aula12;

public class Cachorro extends Mamifero {
    @Override
    public void locomover() {
        System.out.println("CACHORRO ANDANDO!");
    } 

    @Override
    public void emetirSom() {
        System.out.println("CACHORRO LATINDO!");
    }   
}
