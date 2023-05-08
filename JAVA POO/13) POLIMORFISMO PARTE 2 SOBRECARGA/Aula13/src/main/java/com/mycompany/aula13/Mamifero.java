package com.mycompany.aula13;

public class Mamifero extends Animal {
    protected String corPelo;
    
    @Override
    public void emitirSom() {
        System.out.println("SOM DE MAMIFERO!");
    }
}
