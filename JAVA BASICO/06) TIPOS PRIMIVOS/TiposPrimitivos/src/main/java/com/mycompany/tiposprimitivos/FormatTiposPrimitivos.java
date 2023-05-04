package com.mycompany.tiposprimitivos;
import java.util.Scanner;

public class FormatTiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("DIGITE O NOME DO ALUNO:\n>>>");
        String nome = teclado.nextLine();
        System.out.print("DIGITE A NOTA DO ALUNO:\n>>>");
        Float nota = teclado.nextFloat();
        System.out.format("A NOTA DE %s É %.2f",nome, nota);
        //System.out.format("A NOTA É %.2f", nota);
        //System.out.println("A NOTA É " + nota);
        //System.out.println("A NOTA DE " + nome);
    }
}
