package module4.ex3_distance;

/**
 * Создать класс вычисляющий расстояние между двумя точками, представленными
 * координатами в двумерном пространстве (x1, y1), (x2, y2).
 */
public class CalculateDistance {
    public static void main(String[] args) {
        int x1 = 2;
        int x2 = 9;
        int y1 = 5;
        int y2 = 8;
        System.out.println("Pасстояние между двумя точками " + "A(" + x1 + ";" + y1 + ") и " + "B(" + x2 + ";" + y2 + ") "+ "равняется " + distanceBetweenTwoPoints(x1, y1, x2, y2));
    }

    public static int distanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {
        int distance = (int) Math.sqrt(Math.pow(2, (x2 - x1)) + Math.pow(2, (y2 - y1)));
        return distance;
    }
}
