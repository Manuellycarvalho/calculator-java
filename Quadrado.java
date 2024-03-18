public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    public double calcularArea() {
        return lado * lado;
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
