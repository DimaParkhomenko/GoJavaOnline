package module4.ex1_square;

public class CircleSquare {

    private int radius; //radius of circle

    public CircleSquare(int radius) {
        this.radius = radius;
    }

    public int countCircleSquare() {
        return (int) (Math.PI * radius);
    }
}
