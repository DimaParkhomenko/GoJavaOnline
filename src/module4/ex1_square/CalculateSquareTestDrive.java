package module4.ex1_square;

public class CalculateSquareTestDrive {
    public static void main(String[] args) {
        CircleSquare circleSquare = new CircleSquare(5);
        TriangleSquare triangleSquare = new TriangleSquare(5, 5);
        RectangleSquare rectangleSquare = new RectangleSquare(9, 8);

       /* circleSquare.setRadius(6);
        triangleSquare.setHeightOfTriangle(5);
        triangleSquare.setSideOfTriangle(5);
        rectangleSquare.setHeightOfRectangle(9);
        rectangleSquare.setWidthOfRectangle(8);
       */

        System.out.println("Площадь треугольника = " + triangleSquare.countTriangleSquare() + ";"); //Triangle Square
        System.out.println("Площадь прямоугольника = " + rectangleSquare.countRectangleSquare() + ";"); //Rectangle Square
        System.out.println("Площадь круга = " + circleSquare.countCircleSquare() + ";"); //Circle Square
    }
}
