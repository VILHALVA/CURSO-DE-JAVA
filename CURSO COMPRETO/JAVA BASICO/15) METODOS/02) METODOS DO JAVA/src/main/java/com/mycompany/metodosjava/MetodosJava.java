/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodosjava;

public class MetodosJava {
   static void soma(int a, int b) { //ISSO É UMA "FUNÇÃO" QUE SOMA.
      int s = a + b;
      System.out.println("A SOMA É "+s);
   }
    
    static int somado(int a, int b) {
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        soma(5,9);
        int sm = somado(9,9);
        System.out.println("A SOMA É "+sm);
    }
}
