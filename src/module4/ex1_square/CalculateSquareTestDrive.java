package module4.ex1_square;

public class CalculateSquareTestDrive {
    public static void main(String[] args) {
        CircleSquare circleSquare = new CircleSquare();
        TriangleSquare triangleSquare = new TriangleSquare();
        RectangleSquare rectangleSquare = new RectangleSquare();
        circleSquare.setRadius(6);
        triangleSquare.setHeightOfTriangle(5);
        triangleSquare.setSideOfTriangle(5);
        rectangleSquare.setHeightOfRectangle(9);
        rectangleSquare.setWidthOfRectangle(8);

        System.out.println("Площадь треугольника = " + circleSquare.countCircleSquare() + ";"); //Triangle Square
        System.out.println("Площадь прямоугольника = " + triangleSquare.countTriangleSquare() + ";"); //Rectangle Square
        System.out.println("Площадь круга = " + rectangleSquare.countRectangleSquare() + ";"); //Circle Square
    }
}
