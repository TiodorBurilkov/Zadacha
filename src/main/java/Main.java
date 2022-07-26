import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(Main.class);


        Scanner scanner = new Scanner(System.in);
        Point pointA = new Point();
        Point pointB = new Point();
        Point pointC = new Point();
        Point pointD = new Point();
        double sinus = 0;

        logger.info("Enter the coordinates of A");
        pointA.setX(scanner.nextInt());
        pointA.setY(scanner.nextInt());
        logger.info("Enter the coordinates of B");
        pointB.setX(scanner.nextInt());
        pointB.setY(scanner.nextInt());

        logger.info("Enter the coordinates of C");
        pointC.setX(scanner.nextInt());
        pointC.setY(scanner.nextInt());

        logger.info("Enter the coordinates of D");
        pointD.setX(scanner.nextInt());
        pointD.setY(scanner.nextInt());

        Quadrilateral quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);
        QuadrilateralCalculations quadrilateralCalculations = new QuadrilateralCalculations();
        QuadrilateralDistance quadrilateralDistance = new QuadrilateralDistance();
        double perimeter = quadrilateralCalculations.perimeter(quadrilateral);

        logger.info("Perimeter is  " + perimeter);
        logger.error("Error");


        logger.info("Enter the value of sinus ");
        sinus = scanner.nextInt();
        double area = quadrilateralCalculations.area(quadrilateral, sinus);
        logger.info("Area is  " + area);


    }
}
