
import static java.lang.Math.sin;

public class QuadrilateralCalculations {

    public double perimeter(Quadrilateral quadrilateral) {
        QuadrilateralDistance quadrilateralDistance = new QuadrilateralDistance();
        double ab = quadrilateralDistance.pointCalculation(quadrilateral.getA(), quadrilateral.getB());
        double bc = quadrilateralDistance.pointCalculation(quadrilateral.getA(), quadrilateral.getB());
        double cd = quadrilateralDistance.pointCalculation(quadrilateral.getA(), quadrilateral.getB());
        double da = quadrilateralDistance.pointCalculation(quadrilateral.getA(), quadrilateral.getB());
        return ab + bc + cd + da;

    }

    public double area(Quadrilateral quadrilateral, double sinus) {
        QuadrilateralDistance quadrilateralDistance = new QuadrilateralDistance();
        double ac = quadrilateralDistance.pointCalculation(quadrilateral.getA(), quadrilateral.getB());
        double bd = quadrilateralDistance.pointCalculation(quadrilateral.getA(), quadrilateral.getB());
        return ac * bd * 0.5 * sin(sinus);
    }

}