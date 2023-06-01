package com.mycompany.vetores01;

public class MesesDoAno {
    public static void main(String[] args) {
        String mes[] = {"JAN", "FEV", "MAR", "ABRI", "MAI", "JUN", "JUL", "AGO", "SET", "OUT", "NOV", "DEZ"};
        int dias[] = {31, 28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
        for (int c = 0; c < mes.length; c++) {
            System.out.println("O MES " + mes[c] + " TEM " + dias[c] + " DIAS.");
        }
    }
}
