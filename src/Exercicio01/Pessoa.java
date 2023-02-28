package Exercicio01;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private double altura;
    private int idade;


    public void imprimirDados() {
        System.out.println("Nome: " + nome + "\nData de Nascimento: " +
                dataNascimento + "\nAltura: " + altura);

    }

    // método que calcula a idade da pessoa
    public int calcularIdade(int ano) {
        this.idade = LocalDate.now().getYear() - ano;
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
