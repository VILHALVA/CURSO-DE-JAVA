/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operadorternario;

public class ComparacaoDeString {
    public static void main(String[] args) {
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        
        String res;
        res = (nome1==nome2)?"igual":"diferente";
        System.out.println(res);
        
        String obj;
        obj = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(obj);
    }   
}
