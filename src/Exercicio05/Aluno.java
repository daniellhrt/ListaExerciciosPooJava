package Exercicio05;

public class Aluno {
    private int matricula;
    private String nome;
    private double nota1, nota2, trabalho;

    public Aluno(int matricula, String nome, double nota1, double nota2, double trabalho) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.trabalho = trabalho;
    }

    public double media() {
        return (((this.nota1 + this.nota2) * 2.5) + (this.trabalho * 2)) / 7;
    }

    public void provaFinal() {
        double media = media();
        if (media < 2.5 || media >= 5.0) {
            System.out.println("0");
        } else {
            System.out.printf("Nota para aprovar: %.2f\n", (10 - media));
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }
}
