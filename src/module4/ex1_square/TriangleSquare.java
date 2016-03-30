package module4.ex1_square;

public class TriangleSquare {

    private int sideOfTriangle;
    private int heightOfTriangle; //the height of a triangle lowered on the side "sideOfTriangle"

    public TriangleSquare(int sideOfTriangle, int heightOfTriangle) {
        this.sideOfTriangle = sideOfTriangle;
        this.heightOfTriangle = heightOfTriangle;
    }

    public int countTriangleSquare() {
        return (sideOfTriangle * heightOfTriangle) / 2;
    }
}
