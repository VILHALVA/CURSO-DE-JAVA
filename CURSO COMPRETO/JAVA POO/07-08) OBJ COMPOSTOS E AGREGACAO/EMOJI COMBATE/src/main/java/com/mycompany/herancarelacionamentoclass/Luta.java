package com.mycompany.herancarelacionamentoclass;

import java.util.Random;

public class Luta {
    private EmojiCombate desafiado;
    private EmojiCombate desafiante;
    private int rouds;
    private boolean aprovado;

    public EmojiCombate getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(EmojiCombate desafiado) {
        this.desafiado = desafiado;
    }

    public EmojiCombate getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(EmojiCombate desafiante) {
        this.desafiante = desafiante;
    }

    public int getRouds() {
        return rouds;
    }

    public void setRouds(int rouds) {
        this.rouds = rouds;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public void marcarLuta(EmojiCombate l1, EmojiCombate l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)) {
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }
        else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovado == true) {
            System.out.println("#### DESAFIADO: ####");
            this.desafiado.apresentar();
            System.out.println("#### DESAFIANTE: ####");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch(vencedor) {
                case 0: //EMPATE.
                System.out.println("LUTA EMPATEDA!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;

                case 1: //GANHOU DESAFIADO.
                System.out.println(desafiado.getNome()+" GANHOU A LUTA!");
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;

                case 2: //GANHOU DESAFIANTE.
                System.out.println(desafiante.getNome()+" GANHOU A LUTA!");
                this.desafiado.perderLuta();
                this.desafiante.ganharLuta();
                break;
            }
        }
        else {
            System.out.println("A LUTA NÃO PODE ACONECER!");
        }
    }
}
