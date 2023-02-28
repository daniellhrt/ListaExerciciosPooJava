package Exercicio03;


public class BombaCombustivel {

    // atributos: tipo de combustível, valor por litro e quantidade de combustível.
    private String combustivel;
    private Float valorCombustivel;
    private float quantidadeCombustivel;

    public BombaCombustivel(String combustivel, Float valorCombustivel, float quantidadeCombustivel) {
        this.combustivel = combustivel;
        this.valorCombustivel = valorCombustivel;
        this.quantidadeCombustivel = quantidadeCombustivel;
        System.out.println("TIPO COMBUSTIVEL: " + this.combustivel + " | VALOR R$: " + this.valorCombustivel);
        System.out.println();
    }


// métodos

    //a. abastecerPorValor: método onde é informado o valor a ser abastecido e mostra a quantidade de
    // litros que foi colocada no veículo OK
    public void abastecerPorValor(float preco) {

        System.out.println("Abastecendo por valor solicitado");
        System.out.println("Valor R$:" + preco);

        float litros = preco / valorCombustivel;
        alterarQuantidadeCombustivel(this.quantidadeCombustivel - litros);

        System.out.printf("Litros abastecido: %.2f\n", litros);
    }

    //b. abastecerPorLitro: método onde é informado a quantidade em litros de combustível e mostra o
    // valor a ser pago pelo cliente. OK
    public void abastecerPorLitro(float litrosAbastecer) {

        System.out.println("Abastecendo por litros");
        System.out.println("Litros solicitados: " + litrosAbastecer);

        float litros2 = litrosAbastecer * valorCombustivel;
        alterarQuantidadeCombustivel(this.quantidadeCombustivel - litrosAbastecer);

        System.out.printf("Valor pago R$: %.2f\n", litros2);

    }

    //c. alterarValor: altera o valor do litro do combustível. OK
    public void alterarValor(float valorCombustivel) {
        this.valorCombustivel = valorCombustivel;

    }

    //d. alterarCombustivel: altera o tipo do combustível. OK
    public void alterarCombustivel(String combustivel) {
        combustivel = this.combustivel;
    }

    //e. alterarQuantidadeCombustivel: altera a quantidade de combustível restante na bomba. OK
    public void alterarQuantidadeCombustivel(float quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;

    }

    public String getCombustivel() {
        return combustivel;
    }

    public String setCombustivel(String combustivel) {
        this.combustivel = combustivel;
        return combustivel;
    }

    public Float getValorCombustivel() {
        return valorCombustivel;
    }

    public float setValorCombustivel(Float valorCombustivel) {
        this.valorCombustivel = valorCombustivel;
        return 0;
    }

    public float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public float setQuantidadeCombustivel(float quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
        return quantidadeCombustivel;
    }
}
