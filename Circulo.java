public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public String toString(int modo) {
        String output;
        if (modo % 2 == 0) {
            output = "Raio: " + raio + "\nPerímetro: " + calcularPerimetro() + "\nÁrea: " + calcularArea();
            return output.toUpperCase();
        } else {
            output = "Raio: " + raio + "\nPerímetro: " + calcularPerimetro() + "\nÁrea: " + calcularArea();
            return output.toLowerCase();
        }
    }
}
