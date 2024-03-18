public class Cubo {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double calcularVolume() {
        return lado * lado * lado;
    }

    public double calcularAreaSuperficial() {
        return 6 * lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
