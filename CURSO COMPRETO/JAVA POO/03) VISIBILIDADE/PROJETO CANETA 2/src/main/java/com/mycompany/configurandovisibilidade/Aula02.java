package com.mycompany.configurandovisibilidade;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC CRISTAL";
        c1.cor = "AZUL";
        // c1.ponta = 0.5f;
        c1.carga = 80;
        // c1.tampada = true;
        c1.tampar();
        c1.rabiscar();
        c1.status();
     
    }
}
