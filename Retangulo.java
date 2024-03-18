public class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public double calcularArea() {
        return base * altura;
    }

    public String toString(int modo) {
        String output;
        if (modo % 2 == 0) {
            output = "Base: " + base + "\nAltura: " + altura + "\nPerímetro: " + calcularPerimetro() + "\nÁrea: " + calcularArea();
            return output.toUpperCase();
        } else {

            output = "Base: " + base + "\nAltura: " + altura + "\nPerímetro: " + calcularPerimetro() + "\nÁrea: " + calcularArea();
            return output.toLowerCase();
        }
    }
}
