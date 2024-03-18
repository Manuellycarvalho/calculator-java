public class PiramideDeBaseQuadrada {
    private double ladoBase;
    private double altura;

    public PiramideDeBaseQuadrada(double ladoBase,double altura){
      this.ladoBase=ladoBase;
      this.altura = altura;
    }

    public double calcularVolume(){
        return (ladoBase * altura) / 3;
    }

    public double calcularAreaSuperficial(){
        double areaLateral = ladoBase * Math.sqrt(Math.pow(ladoBase / 2,2)+ Math.pow(altura,2));
        double areaBase = Math.pow(ladoBase,2);
        return areaLateral + 4 * areaBase;
    }
}
