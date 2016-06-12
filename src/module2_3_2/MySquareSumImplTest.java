package module2_3_2;

public class MySquareSumImplTest {
    public static void main(String[] args) {
        int[] array1 = {9, 2, 3, 3, 4, 1, 5, 5, 8};
        int[] array2 = {6, 2, 1, 3, 9, 4, 9, 7, 9};

        long squareSum1 = new MySquareSumImpl().getSquareSum(array1, 3);
        long squareSum2 = new MySquareSumImpl().getSquareSum(array2, 4);

        System.out.println(squareSum1);
        System.out.println(squareSum2);
    }
}