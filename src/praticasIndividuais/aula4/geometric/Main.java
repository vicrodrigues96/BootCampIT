package praticasIndividuais.aula4.geometric;

public class Main {

    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        circulo.setRaio(10);
        System.out.println(circulo.getArea());

        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(10);
        triangulo.setBase(20);

        GeometricFigure[] geometricFigures = new GeometricFigure[2];
        geometricFigures[0] = circulo;
        geometricFigures[1] = triangulo;

        System.out.println(GeometricUtil.areaMedia(geometricFigures));
    }
}
