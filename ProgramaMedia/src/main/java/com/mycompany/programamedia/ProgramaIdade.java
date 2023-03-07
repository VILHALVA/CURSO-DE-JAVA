package com.mycompany.programamedia;

import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("DIGITE SEU ANO DE NASCIMENTO:\n>>>");
        int ano = teclado.nextInt();
        int idade = 2023 - ano;
        
        System.out.println("COM A IDADE DE " +idade);

        if(idade >= 18) {
            System.out.println("VOCÊ É MAIOR DE IDADE!");
        }
        else {
            System.out.println("VOCÊ É MENOR DE IDADE!");
        }
    }   
}
