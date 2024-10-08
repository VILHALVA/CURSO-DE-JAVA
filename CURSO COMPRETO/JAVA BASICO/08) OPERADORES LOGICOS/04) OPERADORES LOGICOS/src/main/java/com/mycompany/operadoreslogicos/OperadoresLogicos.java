/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadoreslogicos;

public class OperadoresLogicos {

    public static void main(String[] args) {
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        
        boolean r;
        r = (x<y && y<z)?true:false;
        System.out.println(r);
        
        boolean p;
        p = (x<y || y<z)?true:false;
        System.out.println(p);
        
        boolean e;
        e = (x<y ^ y<z)?true:false;
        System.out.println(e);
    }
}
