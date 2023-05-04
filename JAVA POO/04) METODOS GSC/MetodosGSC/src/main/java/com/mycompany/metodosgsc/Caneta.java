package com.mycompany.metodosgsc;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String m, String c, float p) { // METODO CONSTRUTOR.
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    
    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public void tampar() {
        this.tampada = true;
    } 
    
    public void destampar() {
        this.tampada = false;
    }
    
    public void status() {
        System.out.println("MODELO DA CANETA É "+this.modelo);
        System.out.println("PONTA DA CANETA É "+this.ponta);
        System.out.println("A COR DA CANETA É "+this.cor);
        System.out.println("ESTÁ TAMPADA? "+this.tampada);
    }
}
