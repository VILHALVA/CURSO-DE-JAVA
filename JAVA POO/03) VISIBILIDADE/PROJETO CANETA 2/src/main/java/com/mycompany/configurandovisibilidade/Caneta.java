package com.mycompany.configurandovisibilidade;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status() {
        System.out.println("A CANETA TEM A COR "+this.cor);
        System.out.println("A CANETA ESTÁ TAMPADA? "+this.tampada);
        System.out.println("SEU MODELO É "+this.modelo);
        System.out.println("SUA PONTA TEM "+this.ponta);
        System.out.println("DE CARGA TEM "+this.carga);
    }
    
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! ESTOU TAMPADA!");
        }
        else {
            System.out.println("ESTOU RABISCANDO!");
        }
    }
    
    public void tampar() {
       this.tampada = true; 
    }
    
    public void destampar() {
       this.tampada = false; 
    }
}

