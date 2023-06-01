/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturaderepeticao2;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int n, s = 0; 
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("DIGITE UM NÚMERO:\n>>>");  
            n = teclado.nextInt();
            s += n;
            System.out.print("QUER CONTINUAR?\n>>>");
            resp = teclado.next();
        }
        while (resp.equals("S"));
        System.out.println("A SOMA É " +s);
    }
    
}
