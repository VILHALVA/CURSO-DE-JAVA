/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadorternario;

/**
 *
 * @author HP
 */
public class OperadorTernario {

    public static void main(String[] args) {
        int n1, n2, r, p, s;
        n1 = 14;
        n2 = 18;
        
        r = (n1>n2)?0:1;
        System.out.println(r);
        
        p = (n1>n2)?n1:n2;
        System.out.println(p);
        
        s = (n1>n2)?n1+n2:n1-n2;
        System.out.println(s);
    }
}
