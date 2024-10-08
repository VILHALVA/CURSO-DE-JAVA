package com.mycompany.contabanco;

public class ContaBanco {
    public int numConta; 
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean Status;

    public void ContaBanco() {
        this.saldo = 0;
        this.Status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public void AbrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        System.out.println("CONTA ABERTA COM SUCESSO!");

        if (t == "CC") {
            this.setSaldo(50);
        }

        else if (t == "CP") {
            this.setSaldo(150);
        }
    }

    public void FecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("ERRO: ESSA CONTA AINDA TEM DINHEIRO!");
        }

        else if (this.getSaldo() < 0) {
            System.out.println("ERRO: VOCÊ ESTÁ DEVENDO DINHEIRO!"); 
        }

        else {
            System.out.println("FECHAMENTO EFETUADO COM SUCESSO!");
            this.setStatus(false);
        }
    }

    public void Sacar(float v) {
        if (this.getStatus() == true && this.getSaldo() >= v) {
            this.saldo = this.saldo - v;
            System.out.println("SAQUE REALIZADO COM SUCESSO!");
        }

        else if (this.getSaldo() < v) {
            System.out.println("ERRO: SALDO INSUFICIENTE!");
        }

        else if (this.getStatus() == false) {
            System.out.println("ERRO: IMPOSSIVEL SACAR!");
        }
    }

    public void Depositar(float v) {
        if (this.getStatus() == true) {
            this.saldo = this.saldo + v;
            System.out.println("DEPOSITO REALIZADO COM SUCESSO!");
        }

        else {
            System.out.println("ERRO: IMPOSSIVEL DEPOSITAR");  
        }
    }

    public void PagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        }

        else if (this.getTipo() == "CP") {
            v = 20;
        }

        if (this.getStatus()) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("MENSALIDADE PAGA COM SUCESSO!");
            }
            else {
                System.out.println("ERRO: SALDO INSUFICIENTE!");
            }
        }
        else {
            System.out.println("ERRO: IMPOSSIVEL PAGAR!");
        }
    }
    
    public void estadoAtual() {
        System.out.println("========================================");
        System.out.println("DONO "+this.getDono());
        System.out.println("CONTA "+this.getNumConta());
        System.out.println("TIPO: "+this.getTipo());
        System.out.println("SALDO: "+this.getSaldo());
        System.out.println("STATUS "+this.getStatus());
        System.out.println("========================================");
    }
}
