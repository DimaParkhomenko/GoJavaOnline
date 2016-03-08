package module4.ex3_distance;

public class CalculateDistanceTestDrive {
    public static void main(String[] args) {
        CalculateDistance calculateDistance = new CalculateDistance();
        calculateDistance.setX1(5);
        calculateDistance.setX2(9);
        calculateDistance.setY1(8);
        calculateDistance.setY2(7);
        System.out.println("Pасстояние между двумя точками " + "A(" + calculateDistance.getX1() + ";" + calculateDistance.getY1() + ") и " + "B(" + calculateDistance.getX2() + ";" + calculateDistance.getY2() + ") " + "равняется " + calculateDistance.distanceBetweenTwoPoints());

    }
}
