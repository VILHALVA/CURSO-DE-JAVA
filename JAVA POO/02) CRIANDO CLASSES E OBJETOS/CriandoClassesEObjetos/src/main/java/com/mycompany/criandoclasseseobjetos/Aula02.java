package com.mycompany.criandoclasseseobjetos;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "AZUL";
        c1.ponta = 0.5f;
        c1.carga = 89;
        c1.tampar();
        c1.rabiscar();
        c1.status();
        
        Caneta c2 = new Caneta();
        c2.modelo = "HOSTNET";
        c2.cor = "PRETA";
        c2.ponta = 0.8f;
        c2.carga = 70;
        c2.destampar();
        c2.rabiscar();
        c2.status();
    }
}
