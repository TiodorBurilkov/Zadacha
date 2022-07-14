import static java.lang.Math.sin;

public class QuadrilateralCalculations {


    public double perimeter(Quadrilateral quadrilateral){
        QuadrilateralDistance quadrilateralDistance= new QuadrilateralDistance();
        double ab=quadrilateralDistance.ab(quadrilateral);
        double bc=quadrilateralDistance.bc(quadrilateral);
        double cd=quadrilateralDistance.cd(quadrilateral);
        double da=quadrilateralDistance.da(quadrilateral);
        return ab+bc+cd+da;
    }

    public double area(Quadrilateral quadrilateral, double sinus){
        QuadrilateralDistance quadrilateralDistance=new QuadrilateralDistance();
        double ac=quadrilateralDistance.ac(quadrilateral);
        double bd=quadrilateralDistance.bd(quadrilateral);
        return ac*bd*0.5*sin(sinus);
    }



}