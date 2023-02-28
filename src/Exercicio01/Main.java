package Exercicio01;

import java.util.Scanner;

//1. Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e
//  altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir
//  todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa daniel = new Pessoa();

        daniel.setNome("Daniel Teixeira");
        daniel.setAltura(1.82);
        daniel.setDataNascimento("17/10/1994");

        System.out.println("Nome: " + daniel.getNome());
        System.out.println("Altura: " + daniel.getAltura());
        System.out.println("Data de nascimento: " + daniel.getDataNascimento());
        System.out.println("Idade: " + daniel.calcularIdade(1994) + " anos");

    }
}
