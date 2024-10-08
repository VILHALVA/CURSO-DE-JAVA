package com.mycompany.contabanco;

public class ClienteBanco {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.AbrirConta("CC");
        p1.setNumConta(11111);
        p1.setDono("JUBILEU");
        p1.Depositar(100);
        p1.FecharConta();
        p1.estadoAtual();
        
        ContaBanco p2 = new ContaBanco();
        p2.AbrirConta("CP");
        p2.setNumConta(222222);
        p2.setDono("CREUSA");
        p2.Depositar(500);
        p2.Sacar(1000);
        p2.estadoAtual();      
    }
}
