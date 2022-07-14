import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class QuadrilateralDistance {

    public double ab(Quadrilateral quadrilateral) {
        Point a = quadrilateral.getA();
        Point b = quadrilateral.getB();
        double ab = sqrt(pow((b.getX() - a.getX()), 2) + pow((b.getY() - a.getY()), 2));
        return ab;
    }

    public double bc(Quadrilateral quadrilateral) {
        Point b = quadrilateral.getB();
        Point c = quadrilateral.getC();
        double bc = sqrt(pow((c.getX() - b.getX()), 2) + pow((c.getY() - b.getY()), 2));
        return bc;
    }

    public double cd(Quadrilateral quadrilateral) {
        Point c = quadrilateral.getC();
        Point d = quadrilateral.getB();
        double cd = sqrt(pow((d.getX() - c.getX()), 2) + pow((d.getY() - c.getY()), 2));
        return cd;
    }

    public double da(Quadrilateral quadrilateral) {
        Point d = quadrilateral.getD();
        Point a = quadrilateral.getA();
        double da = sqrt(pow((a.getX() - d.getX()), 2) + pow((a.getY() - d.getY()), 2));
        return da;
    }

    public double ac(Quadrilateral quadrilateral) {
        Point c = quadrilateral.getC();
        Point a = quadrilateral.getA();
        double ac = sqrt(pow((c.getX() - a.getX()), 2) + pow((c.getY() - a.getY()), 2));
        return ac;
    }

    public double bd(Quadrilateral quadrilateral) {
        Point b = quadrilateral.getB();
        Point d = quadrilateral.getD();
        double bd = sqrt(pow((d.getX() - b.getX()), 2) + pow((d.getY() - b.getY()), 2));
        return bd;
    }
}