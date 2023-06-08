package com.mycompany.aula011;

public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa() {
        System.out.println("BOLSA RENOVADA COM SUCESSO DE "+this.nome);
    }
    
    @Override // SOBREPOSIÇÃO A PAGAR MENSALIDADE DO ALUNO.
    public void pagarMensalidade() {
        System.out.println(this.nome+" É BOLSISTA. PAGAMENTO FACILITADO!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
