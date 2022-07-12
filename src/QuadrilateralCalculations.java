import static java.lang.Math.*;

public class QuadrilateralCalculations {

    public double perimeter(Quadrilateral quadrilateral){
    Point a=quadrilateral.getA();
    Point b=quadrilateral.getB();
    Point c=quadrilateral.getC();
    Point d=quadrilateral.getD();
    double ab=sqrt(pow((b.getX()-a.getX()),2) + pow((b.getY()-a.getY()),2));
    double bc=sqrt(pow((c.getX()-b.getX()),2) + pow((c.getY()-b.getY()),2));
    double cd=sqrt(pow((d.getX()-c.getX()),2) + pow((d.getY()-c.getY()),2));
    double da=sqrt(pow((a.getX()-d.getX()),2) + pow((a.getY()-d.getY()),2));

      return ab+bc+cd+da;

    }

    public double area(Quadrilateral quadrilateral, double sinus){
        Point a=quadrilateral.getA();
        Point b=quadrilateral.getB();
        Point c=quadrilateral.getC();
        Point d=quadrilateral.getD();
        double ac=sqrt(pow((c.getX()-a.getX()),2) + pow((c.getY()-a.getY()),2));
        double bd=sqrt(pow((d.getX()-b.getX()),2) + pow((d.getY()-b.getY()),2));

        return ac*bd*0.5*sin(sinus);
    }
}

