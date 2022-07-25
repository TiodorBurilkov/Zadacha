import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadrilateralCalculationsTest {
    private Quadrilateral test;
    private double sinus;

    @BeforeEach
    void setUp() {

        sinus = 90;
        this.test = new Quadrilateral(new Point(1, 1), new Point(5, 1), new Point(5, 6), new Point(3, 6));
    }

    @Test
    void perimeter() {
        QuadrilateralCalculations quadrilateralCalculations = new QuadrilateralCalculations();
        assertEquals(16, quadrilateralCalculations.perimeter(test));
    }

    @Test
    void area() {
        QuadrilateralCalculations quadrilateralCalculations = new QuadrilateralCalculations();
        double area = Math.round(quadrilateralCalculations.area(test, sinus) * 100) / 100;
        assertEquals(15, area);
    }
}