package com.mycompany.herancarelacionamentoclass;

public class HerancaRelacionamentoClass {
    public static void main(String[] args) {
        EmojiCombate l[] = new EmojiCombate[6];
        l[0] = new EmojiCombate("Pretty Boy", "França", 31,68.9f, 1.75f, 11, 3, 1);
        l[0].apresentar();
        l[0].status();
        
        l[1] = new EmojiCombate("Putscript", "Brasil", 29, 57.8f, 1.60f, 14, 2, 3);
        l[1].apresentar();
        l[1].status();
        
        l[2] = new EmojiCombate("Snapshadow", "EUA", 35, 80.9f, 1.65f, 12, 2, 1);
        l[2].apresentar();
        l[2].status();
        
        l[3] = new EmojiCombate("Dead Code", "Australia", 28, 83.4f, 1.80f, 13, 0, 2);
        l[3].apresentar();
        l[3].status();
        
        l[4] = new EmojiCombate("Futher", "Canadá", 22, 93.4f, 1.92f, 15, 1, 4);
        l[4].apresentar();
        l[4].status();
        
        l[5] = new EmojiCombate("Dracula", "Russia", 45, 67.6f, 1.89f, 20, 0, 0);
        l[5].apresentar();
        l[5].status();
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
    }
}
