package praticasIndividuais.aula4.geometric;

public class Circulo extends GeometricFigure{

    private double pi = 3.14;
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        this.setArea(this.pi * this.raio);
        return this.pi * this.raio;
    }
}
