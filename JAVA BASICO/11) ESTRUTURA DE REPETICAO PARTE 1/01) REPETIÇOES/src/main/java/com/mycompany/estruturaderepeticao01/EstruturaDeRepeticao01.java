/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturaderepeticao01;

public class EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        int cc = 0;
        while (cc <20) {            
             System.out.println("CAMBAALHOTA " +(cc+1));
             cc++;
        }
        
        int d = 0;
        while (d < 10) {
            d++;
            if (d == 5 || d == 7 || d == 9) {
                continue;
            }
            System.out.println("PULOU "+(d+1));       
        }
    }
}
