package module4.ex1_square;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RectangleSquare {
    private double heightOfRectangle;
    private double widthOfRectangle;

    public RectangleSquare(double heightOfRectangle, double widthOfRectangle) {
        this.heightOfRectangle = heightOfRectangle;
        this.widthOfRectangle = widthOfRectangle;
    }

    public double countRectangleSquare() {
        return new BigDecimal((heightOfRectangle * widthOfRectangle) / 2).setScale(3, RoundingMode.UP).doubleValue();
    }
}
