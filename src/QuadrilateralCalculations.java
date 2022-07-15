import java.util.List;

import static java.lang.Math.sin;

public class QuadrilateralCalculations {

    public double perimeter(Quadrilateral quadrilateral) {
        QuadrilateralDistance quadrilateralDistance = new QuadrilateralDistance();
        List<Double> pointsList = quadrilateralDistance.pointsList(quadrilateral);
        double ab = pointsList.get(0);
        double bc = pointsList.get(1);
        double cd = pointsList.get(2);
        double da = pointsList.get(3);
        return ab + bc + cd + da;

    }

    public double area(Quadrilateral quadrilateral, double sinus) {
        QuadrilateralDistance quadrilateralDistance = new QuadrilateralDistance();
        List<Double> pointsList = quadrilateralDistance.pointsList(quadrilateral);
        double ac = pointsList.get(4);
        double bd = pointsList.get(5);
        return ac * bd * 0.5 * sin(sinus);

    }

}