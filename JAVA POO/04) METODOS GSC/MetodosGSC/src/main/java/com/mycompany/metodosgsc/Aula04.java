package com.mycompany.metodosgsc;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "AMARELO", 0.4f);
        c1.status();
        
        Caneta c2 = new Caneta("KKK", "LARANJA", 1.2f);
        c2.status();
        
       /* c1.setModelo("BIC");
        c1.modelo = "BIC";
        
        c1.setPonta(0.5f);
        // c1.ponta = 0.5f;
        
        System.out.println("TENHO UMA CANETA "+c1.getModelo() + "COM A PONTA "+c1.getPonta()); */
    } 
}
