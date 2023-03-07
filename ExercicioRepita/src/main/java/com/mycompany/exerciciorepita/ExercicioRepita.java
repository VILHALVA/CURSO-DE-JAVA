/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciorepita;
import javax.swing.JOptionPane;

public class ExercicioRepita {
    public static void main(String[] args) {
        int n, s=0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("<html>INFORME UM NÚMERO.<br><em>O VALOR 0 PARA.</em></html>"));
            s += n;
        } while (n != 0);
        
        JOptionPane.showMessageDialog(null, "A SOMA ENTRE OS VALORES É "+s);
    }
}
