
import static java.lang.Math.sin;
import static java.lang.Math.toRadians;

public class QuadrilateralCalculations {

    public double perimeter(Quadrilateral quadrilateral) {
        QuadrilateralDistance quadrilateralDistance = new QuadrilateralDistance();
        double ab = quadrilateralDistance.calculateDistance(quadrilateral.getA(), quadrilateral.getB());
        double bc = quadrilateralDistance.calculateDistance(quadrilateral.getB(), quadrilateral.getC());
        double cd = quadrilateralDistance.calculateDistance(quadrilateral.getC(), quadrilateral.getD());
        double da = quadrilateralDistance.calculateDistance(quadrilateral.getD(), quadrilateral.getA());
        return ab + bc + cd + da;

    }

    public double area(Quadrilateral quadrilateral, double sinus) {
        QuadrilateralDistance quadrilateralDistance = new QuadrilateralDistance();
        double ac = quadrilateralDistance.calculateDistance(quadrilateral.getA(), quadrilateral.getC());
        double bd = quadrilateralDistance.calculateDistance(quadrilateral.getB(), quadrilateral.getD());
        return ac * bd * 0.5 * sin(toRadians(sinus));
    }

}