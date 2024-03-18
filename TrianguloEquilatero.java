public class TrianguloEquilatero {
    private double lado;

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro() {
        return 3 * lado;
    }

    public double calcularArea() {
        return (Math.sqrt(3) / 4) * lado * lado;
    }

    public String toString(int modo) {
        String output;
        if (modo % 2 == 0) {
            output = "Lado: " + lado + "\nPerímetro: " + calcularPerimetro() + "\nÁrea: " + calcularArea();
            return output.toUpperCase();
        } else {
            output = "Lado: " + lado + "\nPerímetro: " + calcularPerimetro() + "\nÁrea: " + calcularArea();
            return output.toLowerCase();
        }
    }
}
