package module4.ex1_square;

public class RectangleSquare {
    private int heightOfRectangle;
    private int widthOfRectangle;

    public RectangleSquare(int heightOfRectangle, int widthOfRectangle) {
        this.heightOfRectangle = heightOfRectangle;
        this.widthOfRectangle = widthOfRectangle;
    }

    public int countRectangleSquare() {
        return heightOfRectangle * widthOfRectangle;
    }
}
