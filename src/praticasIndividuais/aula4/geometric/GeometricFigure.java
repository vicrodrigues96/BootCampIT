package praticasIndividuais.aula4.geometric;

public abstract class GeometricFigure {
    private String nome;
    private double Area;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public abstract double area();

    @Override
    public String toString() {
        return "Figura: " + this.nome + ", Área: " + this.area();
    }
}
