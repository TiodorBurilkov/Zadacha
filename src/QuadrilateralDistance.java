import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class QuadrilateralDistance {

    public double pointCalculation(Point a, Point b) {
        double ab = sqrt(pow((b.getX() - a.getX()), 2) + pow((b.getY() - a.getY()), 2));
        return ab;
    }
}