package com.mycompany.vetores01;

import java.util.Calendar;

public class AnoBixxesto {
    public static void main(String[] args) {
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
       
        int tot[] = {31, 00, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Calendar ano = Calendar.getInstance();
        int anoAtual = (ano.get(Calendar.YEAR));
        
        if (anoAtual % 400 == 0 || (anoAtual % 4 == 0) && (anoAtual % 100 != 0)){
            tot[1] = 29;
        } 
        else {
            tot[1] = 28;
        }
        
        for(int c=0; c<mes.length; c++){
            System.out.println("O mês de "+mes[c]+" tem "+tot[c]+" dias ao todo.");
        }
    }
}
    
}
