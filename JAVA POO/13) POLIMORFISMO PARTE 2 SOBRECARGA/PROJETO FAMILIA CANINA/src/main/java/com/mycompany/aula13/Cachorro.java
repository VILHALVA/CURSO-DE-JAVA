package com.mycompany.aula13;

public class Cachorro extends Lobo {
    @Override
    public void emitirSom() {
        System.out.println("AU! AU! AU!");
    }
    
    public void reagir(String frase) {
        if (frase == "toma comida" || frase == "ola") {
            System.out.println("ABANAR E LATIR!");
            this.emitirSom();
        }
        else {
            System.out.println("ROSNAR!");
        }
    }
    
    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("ABANAR!");
        }
        else if (hora >= 18) {
            System.out.println("IGNORAR!");
        }
        else {
            System.out.println("ABANAR E LATIR!");
        }
    }
    
    public void reagir(boolean dono) {
        if (dono == true) {
            System.out.println("ABANAR");
        }
        else {
            System.out.println("ROSNAR E LATIR!");
            this.emitirSom();
        }
    }
    
    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("ABANAR");
            }
            else {
                System.out.println("LATIR!");
                this.emitirSom();
            }
        }
        else {
            if (peso < 10) {
                System.out.println("ROSNAR!");
            }
            else {
                System.out.println("IGNORAR!");
            }
        }
    }
}
