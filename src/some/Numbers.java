package some;

/**
 * Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
 */
public class Numbers {
    public static void main(String[] args) {

        int[] arr = new int[10];
        numbers(arr);
    }

    public static void numbers(int[] arr) {

        int num = 1000;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num;
            System.out.println(arr[i]);
            num = num + 3;
        }
    }
}
