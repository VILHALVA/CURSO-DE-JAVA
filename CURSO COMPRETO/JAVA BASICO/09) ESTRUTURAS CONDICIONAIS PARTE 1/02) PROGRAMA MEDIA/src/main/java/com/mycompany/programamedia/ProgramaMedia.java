package com.mycompany.programamedia;

import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("PRIMEIRA NOTA:\n>>>");
        float n1 = teclado.nextFloat();
        System.out.print("SEGUNDA NOTA:\n>>>");
        float n2 = teclado.nextFloat();
        float m = (n1+n2) / 2;
        System.out.println("SUA MÉDIA É "+m);
        if(m>7) {
            System.out.println("PARABÉNS!");
        }
    }
}
