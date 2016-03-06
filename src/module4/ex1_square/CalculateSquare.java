package module4.ex1_square;

/**
 * Создать класс, вычисляющий площадь простых геометрических фигур:
 * треугольника, прямоугольника и круга.
 */
public class CalculateSquare {
    public static void main(String[] args) {
        int a = 12;
        int h = 14; //the height of a triangle lowered on the side a
        System.out.println("Площадь треугольника = " + countTriangleSquare(a, h) + ";"); //Triangle Square

        int b = 5;
        int c = 5;
        System.out.println("Площадь прямоугольника = " + countRectangleSquare(b, c) + ";"); //Rectangle Square


        int r = 6; //r - radius of circle
        System.out.println("Площадь круга = " + countCircleSquare(r) + ";"); //Circle Square

    }

    static int countTriangleSquare(int a, int h) {
        int triangleSqure = (a * h) / 2;
        return triangleSqure;
    }

    static int countRectangleSquare(int b, int c) {
        int rectangleSqure = b * c;
        return rectangleSqure;
    }

    static int countCircleSquare(double r) {
        int circleSqure = (int) (Math.PI * r);
        return circleSqure;
    }
}
