import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class QuadrilateralDistance {

    public List<Double> pointsList(Quadrilateral quadrilateral) {
        List<Double> pointsList = new ArrayList<>();
        Point a = quadrilateral.getA();
        Point b = quadrilateral.getB();
        Point c = quadrilateral.getC();
        Point d = quadrilateral.getD();
        double ab = sqrt(pow((b.getX() - a.getX()), 2) + pow((b.getY() - a.getY()), 2));
        double bc = sqrt(pow((c.getX() - b.getX()), 2) + pow((c.getY() - b.getY()), 2));
        double cd = sqrt(pow((d.getX() - c.getX()), 2) + pow((d.getY() - c.getY()), 2));
        double da = sqrt(pow((a.getX() - d.getX()), 2) + pow((a.getY() - d.getY()), 2));
        double bd = sqrt(pow((d.getX() - b.getX()), 2) + pow((d.getY() - b.getY()), 2));
        double ac = sqrt(pow((c.getX() - a.getX()), 2) + pow((c.getY() - a.getY()), 2));
        pointsList.add(ab);
        pointsList.add(bc);
        pointsList.add(cd);
        pointsList.add(da);
        pointsList.add(ac);
        pointsList.add(bd);
        return pointsList;
    }
}