
import static java.lang.Math.sin;

public class QuadrilateralCalculations {

    public double perimeter(Quadrilateral quadrilateral) {
        QuadrilateralDistance quadrilateralDistance = new QuadrilateralDistance();
        double ab = quadrilateralDistance.calculateDistance(quadrilateral.getA(), quadrilateral.getB());
        double bc = quadrilateralDistance.calculateDistance(quadrilateral.getA(), quadrilateral.getB());
        double cd = quadrilateralDistance.calculateDistance(quadrilateral.getA(), quadrilateral.getB());
        double da = quadrilateralDistance.calculateDistance(quadrilateral.getA(), quadrilateral.getB());
        return ab + bc + cd + da;

    }

    public double area(Quadrilateral quadrilateral, double sinus) {
        QuadrilateralDistance quadrilateralDistance = new QuadrilateralDistance();
        double ac = quadrilateralDistance.calculateDistance(quadrilateral.getA(), quadrilateral.getB());
        double bd = quadrilateralDistance.calculateDistance(quadrilateral.getA(), quadrilateral.getB());
        return ac * bd * 0.5 * sin(sinus);
    }

}