package Exercicio04;

public class Elevador {
    private int andarAtual;
    private int totalDeAndares;
    private int capacidadeDoElevador;
    private int totalPessoas;

    public Elevador(int andarAtual, int totalPessoas) {
        this.andarAtual = andarAtual;
        this.totalPessoas = totalPessoas;
    }

    public void inicializar(int capacidadeDoElevador, int totalDeAndares) {
        this.capacidadeDoElevador = capacidadeDoElevador;
        this.totalDeAndares = totalDeAndares;

    }

    public int entrar(int pessoa) {
        System.out.println("Capacidade do elevador: " + capacidadeDoElevador);
        if ((totalPessoas + pessoa) < capacidadeDoElevador) {
            totalPessoas += pessoa;
            System.out.println("Pessoa entrando..." + pessoa);
            System.out.println("Lotação atual " + totalPessoas);
            System.out.println("");
        } else {
            System.out.println("Elevador lotado!");
            System.out.println("Pessoas querendo entra " + pessoa);
            System.out.println("Lotação atual " + totalPessoas);
            System.out.println("");
        }
        return pessoa;

    }

    public void sair(int pessoaSaindo) {
        System.out.println("Quantidade pessoas atual " + totalPessoas);
        if (totalPessoas != 0) {
            totalPessoas -= pessoaSaindo;
            System.out.println("Pessoa saindo..." + pessoaSaindo);
            System.out.println("Lotação atual " + totalPessoas);
        } else {
            System.out.println("Elevador vazio " + totalPessoas);
        }
    }

    public void subir(int subirAndar) {
        if (subirAndar > totalDeAndares) {
            System.out.println("Andar atual..." + andarAtual);
            andarAtual = subirAndar;
            System.out.println("Ultimo andar é " + totalDeAndares);

        } else {
            andarAtual = subirAndar;
            System.out.println("Subindo andar..." + andarAtual);
        }

    }

    public void descer(int descerAndar) {
        if (andarAtual != 0) {

            if (descerAndar < 0) {
                System.out.println("Andar atual..." + andarAtual);
                System.out.println("térreo é 0");
            } else {

                andarAtual = descerAndar;
                System.out.println("Descendo andar...");
                System.out.println("Andar atual..." + andarAtual);
            }

        } else{
            System.out.println("Elevador já esta no térreo");
        }

    }


    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalDeAndares() {
        System.out.println("");
        System.out.println("Total de andares " + totalDeAndares);
        return totalDeAndares;
    }

    public void setTotalDeAndares(int totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public int getCapacidadeDoElevador() {
        System.out.println("");
        System.out.println("Capacidade máxima " + capacidadeDoElevador);
        return capacidadeDoElevador;
    }

    public void setCapacidadeDoElevador(int capacidadeDoElevador) {
        this.capacidadeDoElevador = capacidadeDoElevador;
    }

    public int getTotalPessoas() {
        return totalPessoas;
    }

    public void setTotalPessoas(int totalPessoas) {
        this.totalPessoas = totalPessoas;
    }
}
