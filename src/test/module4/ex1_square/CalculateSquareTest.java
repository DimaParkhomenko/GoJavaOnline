package test.module4.ex1_square;


import org.junit.Assert;
import org.junit.Test;

public class CalculateSquareTest {

    @Test(timeout = 3000)
    public void testCountCircleSquare() throws Exception {
        final int radius = 5;

        CircleSquare circleSquare = new CircleSquare(radius);
        final int resultCircleSquare = circleSquare.countCircleSquare();

        Assert.assertEquals(15, resultCircleSquare);
    }

    @Test(timeout = 3000)
    public void testCountRectangleSquare() throws Exception {
        final int heightOfRectangle = 9;
        final int widthOfRectangle = 8;

        RectangleSquare rectangleSquare = new RectangleSquare(heightOfRectangle, widthOfRectangle);
        final int resultRectangleSquare = rectangleSquare.countRectangleSquare();

        Assert.assertEquals(72, resultRectangleSquare);
    }

    @Test(timeout = 3000)
    public void testCountTriangleSquare() throws Exception {
        final int sideOfTriangle = 5;
        final int heightOfTriangle = 5;

        TriangleSquare triangleSquare = new TriangleSquare(sideOfTriangle, heightOfTriangle);
        final int resultTriangleSquare = triangleSquare.countTriangleSquare();

        Assert.assertEquals(12, resultTriangleSquare);
    }
}
