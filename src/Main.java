import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Point pointA = new Point();
        Point pointB = new Point();
        Point pointC = new Point();
        Point pointD = new Point();
        double sinus = 0;

        System.out.println("Enter the coordinates of A ");
        pointA.setX(scanner.nextInt());
        pointA.setY(scanner.nextInt());

        System.out.println("Enter the coordinates of B ");
        pointB.setX(scanner.nextInt());
        pointB.setY(scanner.nextInt());

        System.out.println("Enter the coordinates of C ");
        pointC.setX(scanner.nextInt());
        pointC.setY(scanner.nextInt());

        System.out.println("Enter the coordinates of D ");
        pointD.setX(scanner.nextInt());
        pointD.setY(scanner.nextInt());

        Quadrilateral quadrilateral= new Quadrilateral(pointA, pointB, pointC,pointD);
        QuadrilateralCalculations quadrilateralCalculations = new QuadrilateralCalculations();
        double perimeter=quadrilateralCalculations.perimeter(quadrilateral);
        System.out.println("Perimeter is " + perimeter);

        System.out.println("Enter the value of sinus ");
        sinus= scanner.nextInt();
        double area=quadrilateralCalculations.area(quadrilateral, sinus);
        System.out.println("Area is " + area);


        
    }
}



