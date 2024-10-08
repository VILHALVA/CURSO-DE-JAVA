package com.mycompany.operadoresaritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        //OPERADORES ARITMETICOS:
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println("A MÉDIA É IGUAL A " + m);
        
        //OPERADORES UNÁRIOS:
        int numero = 5;
        numero ++;
        System.out.println(numero);
        
        int num = 10;
        int valor = 10 + num++;
        System.out.println(valor);
        
        int nu = 10;
        int valo = 10 + ++nu;
        System.out.println(valo);
        
        int n = 10;
        int v = 10 + n--;
        System.out.println(v);
        
        int a = 10;
        int b = 10 + --a;
        System.out.println(b);
        
        //OPERADORES DE ATRIBUIÇÃO:
        int x = 4;
        x += 2; // x = x + 2
        System.out.println(x);
        
        int y = 4;
        y *= 2; // y = y * 2
        System.out.println(y);
        
        //CLASS MATH:
        float res = 20;
        float total = (float) Math.sqrt(res); //RAIZ QUADRADA.
        System.out.println(total);
        
        //ARRENDODAMENTO:
        float foy = 8.3f;
        int flor = (int) Math.floor(foy); //ARRENDODAMENTO PRA BAIXO.
        System.out.println(flor);   
        
        float f = 8.3f;
        int fr = (int) Math.ceil(f); //ARRENDODAMENTO PRA CIMA.
        System.out.println(fr); 
        
        //RANDOM (ALEATORIO):
        double ale = Math.random(); //VALORES FLOAT ENTRE 0 E 1.
        System.out.println(ale);
        
        double goo = Math.random(); 
        int raw = (int) (5 + goo * (10-5)); //VALORES INT ENTRE 5 E 10.
        System.out.println(raw);
        
        double got = Math.random(); 
        int rab = (int) (15 + got * (50-15)); //VALORES INT ENTRE 15 E 50.
        System.out.println(rab);
    }
}
