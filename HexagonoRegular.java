public class HexagonoRegular {
    private double lado;

    public HexagonoRegular(double lado) {
        this.lado = lado;
    }

    public double calcularArea(){
        return 6 * lado * Math.sqrt(3)/4;
    }

    public double calcularPerimetro(){
        return 6 * lado;
    }
}
