public class Paralelepipedo {
    private double comprimento;
    private double largura;
    private double altura;


    public Paralelepipedo(double comprimento, double largura, double altura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }


    public double calcularVolume() {
        return comprimento * largura * altura;
    }


    public double calcularAreaSuperficial() {
        return 2 * (comprimento * largura + comprimento * altura + largura * altura);
    }
}
