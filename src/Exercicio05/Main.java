package Exercicio05;

// 5. Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto dessa
// classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho.
// Escreva os seguintes métodos para esta classe:

// a. media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
// b. final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)

public class Main {
    public static void main(String[] args) {

        Aluno daniel = new Aluno(1001,
                "Daniel Teixeira", 7.8, 6.4, 5);
        System.out.println("Notas: " + daniel.getNota1() + " - " + daniel.getNota2() + " - " + daniel.getTrabalho());
        System.out.printf("A média do aluno é: %.2f\n", daniel.media());
        daniel.provaFinal();
    }
}
