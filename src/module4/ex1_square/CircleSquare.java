package module4.ex1_square;

public class CircleSquare {

    private int radius; //radius of circle

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

  public int countCircleSquare() {
        int circleSqure = (int) (Math.PI * radius);
        return circleSqure;
    }
}
