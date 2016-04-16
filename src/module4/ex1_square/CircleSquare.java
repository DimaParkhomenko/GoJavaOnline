package module4.ex1_square;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CircleSquare {

    private double radius; //radius of circle

    public CircleSquare(double radius) {
        this.radius = radius;
    }

    public double countCircleSquare() {
        return new BigDecimal(Math.PI * (radius * radius)).setScale(3, RoundingMode.UP).doubleValue();
    }
}
