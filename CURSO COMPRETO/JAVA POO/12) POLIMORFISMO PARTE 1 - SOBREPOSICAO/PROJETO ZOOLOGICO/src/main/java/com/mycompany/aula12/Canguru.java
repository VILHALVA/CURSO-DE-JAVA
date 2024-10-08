package com.mycompany.aula12;

public class Canguru extends Mamifero {
    public void usarBolsa() {
        System.out.println("USANDO BOLSA!");
    }
    @Override
    public void locomover() {
        System.out.println("SALTANDO!");
    }    
}
