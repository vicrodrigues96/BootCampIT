package praticasIndividuais.aula4.geometric;

public class GeometricUtil {

    public static double areaMedia (GeometricFigure[] figures) {
       double areaMedia = 0;

        for (GeometricFigure figure : figures) {
            areaMedia += figure.area();
        }

        return areaMedia / figures.length;
    }
}
