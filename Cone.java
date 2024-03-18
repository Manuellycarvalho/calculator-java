public class Cone {
    private double raio;
    private double altura;

    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double calcularVolume() {
        return (Math.PI * Math.pow(raio, 2) * altura) / 3;
    }

    public double calcularAreaSuperficial() {
        double areaBase = Math.PI * Math.pow(raio, 2);
        double areaLateral = Math.PI * raio * Math.sqrt(Math.pow(altura, 2) + Math.pow(raio, 2));
        return areaBase + areaLateral;
    }
}
