package com.mycompany.encapsulamento;

public class Encapsulamento {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.ligarMudo();
        c.desligarMudo();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }
}
