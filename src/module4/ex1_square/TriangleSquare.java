package module4.ex1_square;

public class TriangleSquare {
    private int sideOfTriangle;
    private int heightOfTriangle; //the height of a triangle lowered on the side "sideOfTriangle"

    public int getHeightOfTriangle() {
        return heightOfTriangle;
    }

    public void setHeightOfTriangle(int heightOfTriangle) {
        this.heightOfTriangle = heightOfTriangle;
    }

    public int getSideOfTriangle() {
        return sideOfTriangle;
    }

    public void setSideOfTriangle(int sideOfTriangle) {
        this.sideOfTriangle = sideOfTriangle;
    }

    public int countTriangleSquare() {
        int triangleSqure = (sideOfTriangle * heightOfTriangle) / 2;
        return triangleSqure;
    }
}
