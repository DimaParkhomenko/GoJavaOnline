package module4.ex1_square;

public class RectangleSquare {
    private int heightOfRectangle;
    private int widthOfRectangle;

    public int getHeightOfRectangle() {
        return heightOfRectangle;
    }

    public void setHeightOfRectangle(int heightOfRectangle) {
        this.heightOfRectangle = heightOfRectangle;
    }

    public int getWidthOfRectangle() {
        return widthOfRectangle;
    }

    public void setWidthOfRectangle(int widthOfRectangle) {
        this.widthOfRectangle = widthOfRectangle;
    }

    public int countRectangleSquare() {
        int rectangleSqure = heightOfRectangle * widthOfRectangle;
        return rectangleSqure;
    }
}
