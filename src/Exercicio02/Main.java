package Exercicio02;

import java.util.Scanner;

//2. Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
//número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e
//saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaCorrente daniel = new ContaCorrente(1001, "Daniel");

        System.out.println(daniel.getNome());
        daniel.alterarNome("Daniel Teixeira");
        System.out.println(daniel.getNome());

        System.out.println(daniel.getSaldo());


        daniel.sacar(25.0f);


    }

}
