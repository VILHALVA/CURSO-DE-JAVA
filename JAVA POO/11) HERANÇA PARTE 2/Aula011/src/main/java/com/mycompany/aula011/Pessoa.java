package com.mycompany.aula011;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    
    public void fazerAniv() {
        this.idade ++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "DADOS {" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
}
