package com.mycompany.criandoclasseseobjetos;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("A CANETA TEM A COR "+this.cor);
        System.out.println("A CANETA ESTÁ TAMPADA? "+this.tampada);
        System.out.println("SEU MODELO É "+this.modelo);
        System.out.println("SUA PONTA TEM "+this.ponta);
        System.out.println("DE CARGA TEM "+this.carga);
    }
    
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! ESTOU TAMPADA!");
        }
        else {
            System.out.println("ESTOU RABISCANDO!");
        }
    }
    
    void tampar() {
       this.tampada = true; 
    }
    
    void destampar() {
       this.tampada = false; 
    }
}

