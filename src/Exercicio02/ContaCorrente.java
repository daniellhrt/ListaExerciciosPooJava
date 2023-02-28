package Exercicio02;

//CLASSE: número da conta, nome do correntista e saldo
//MÉTODOS: alterarNome, depósito e saque;

public class ContaCorrente {
    private int numeroConta;
    private String nome;
    private float saldo = 0.0f;

    public ContaCorrente(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void depositar(float dep) {
        saldo = saldo + dep;
    }

    public void sacar(float sac) {
        if (saldo <= 0) {
            System.out.println("Saque inválido - Sem saldo");
        } else {
            saldo = saldo - sac;
        }
    }


    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
