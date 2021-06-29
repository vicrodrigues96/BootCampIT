package praticasIndividuais.aula4.geometric;

public class Triangulo extends GeometricFigure{
    private double base;
    private double altura;

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

    @Override
    public double area() {
        return (this.base * this.altura) / 2;
    }
}
