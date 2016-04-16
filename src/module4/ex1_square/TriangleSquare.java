package module4.ex1_square;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TriangleSquare {

    private double sideOfTriangle;
    private double heightOfTriangle; //the height of a triangle lowered on the side "sideOfTriangle"

    public TriangleSquare(double sideOfTriangle, double heightOfTriangle) {
        this.sideOfTriangle = sideOfTriangle;
        this.heightOfTriangle = heightOfTriangle;
    }

    public double countTriangleSquare() {
        return  new BigDecimal((sideOfTriangle * heightOfTriangle) / 2).setScale(3, RoundingMode.UP).doubleValue();
    }
}
