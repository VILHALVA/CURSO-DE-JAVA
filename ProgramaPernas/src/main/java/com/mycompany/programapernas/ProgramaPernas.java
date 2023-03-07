/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programapernas;

import java.util.Scanner;

public class ProgramaPernas {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("QUANTAS PERNAS:\n>>>");
        int perna = tec.nextInt();
        String tipo;
        System.out.print("ISSO É UMA(A) ");
        switch(perna) {
            case 1:
                tipo = "SACI!";
                break;
            case 2:
                tipo = "BIPEDE!";
                break;
            case 3:
                tipo = "TRIPÉ!";
                break;
            case 4:
                tipo = "QUADRUPEDE!";
                break;
            case 6:
                tipo = "ARANHA!";
                break;
            default:
                tipo = "ET!";
                break;
        }
        System.out.print(tipo);
    }
}
