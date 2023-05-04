package com.mycompany.herancarelacionamentoclass;

public class EmojiCombate {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public void apresentar() {
        System.out.println("=======================================");
        System.out.println("LUTADOR: "+getNome());
        System.out.println("ORIGEM: "+getNacionalidade());
        System.out.println("IDADE: "+getIdade());
        System.out.println("ALTURA: "+getAltura());
        System.out.println("PESO: "+getPeso());
        System.out.println("VITORIAS: "+getVitorias());
        System.out.println("DERROTAS: "+getDerrotas());
        System.out.println("EMPATES "+getEmpates());
        System.out.println("=======================================");
    }

    public void status() {
        System.out.println("=======================================");
        System.out.print(getNome());
        System.out.print("É DA CATEGORIA "+categoria);
        System.out.print(" TEVE "+getVitorias()+ " VITORIAS,");
        System.out.print("COM "+getDerrotas()+ " DERROTAS,");
        System.out.print("E "+getEmpates()+ " EMPATES.");
        System.out.println("=======================================");
    }

    public EmojiCombate(String no, String na, int id, float pe, float al, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.setPeso(pe);
        this.altura = al;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
         if (this.peso < 52.2) {
            this.categoria = "Invalido";
        }
        else if (this.peso >= 52.2 && this.peso <= 70.3) {
            this.categoria = "Leve";
        }
        else if (this.peso > 70.3 && this.peso <= 83.9) {
            this.categoria = "Medio";
        }
        else if (this.peso > 83.9 && this.peso <= 120.2) {
            this.categoria = "Pesado";
        }
        else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
