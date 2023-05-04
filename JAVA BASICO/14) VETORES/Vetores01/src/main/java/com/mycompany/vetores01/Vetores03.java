package com.mycompany.vetores01;

import java.util.Arrays;

public class Vetores03 {
    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for (int v: vet){
            System.out.print(v + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 1);
        System.out.println("ENCONTREI O VALOR 1 NA POSIÇÃO "+p);
    }
}
