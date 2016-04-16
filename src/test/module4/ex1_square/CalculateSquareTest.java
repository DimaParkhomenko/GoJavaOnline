package test.module4.ex1_square;

import module4.ex1_square.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculateSquareTest {

    @Test(timeout = 3000)
    public void testCountCircleSquare() throws Exception {
        final double radius = 5;

        CircleSquare circleSquare = new CircleSquare(radius);
        final double resultCircleSquare = circleSquare.countCircleSquare();

        Assert.assertEquals(78.54, resultCircleSquare, 0.01);
    }

    @Test(timeout = 3000)
    public void testCountRectangleSquare() throws Exception {
        final double heightOfRectangle = 9;
        final double widthOfRectangle = 8;

        RectangleSquare rectangleSquare = new RectangleSquare(heightOfRectangle, widthOfRectangle);
        final double resultRectangleSquare = rectangleSquare.countRectangleSquare();

        Assert.assertEquals(36, resultRectangleSquare, 0.01);
    }

    @Test(timeout = 3000)
    public void testCountTriangleSquare() throws Exception {
        final double sideOfTriangle = 5;
        final double heightOfTriangle = 5;

        TriangleSquare triangleSquare = new TriangleSquare(sideOfTriangle, heightOfTriangle);
        final double resultTriangleSquare = triangleSquare.countTriangleSquare();

        Assert.assertEquals(12.5, resultTriangleSquare, 0.01);
    }
}
