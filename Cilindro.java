public class Cilindro {
    private double raio;
    private double altura;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double calcularVolume() {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    public double calcularAreaSuperficial() {
        double areaLateral = 2 * Math.PI * raio * altura;
        double areaBase = Math.PI * Math.pow(raio, 2);
        return 2 * areaBase + areaLateral;
    }
}
