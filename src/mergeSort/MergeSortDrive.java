package mergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortDrive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ведите длину массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Заполните массив числами: ");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Заполненный массив состоит из следующих чисел:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();

        System.out.print("Отсортированный массив методом слияния: ");
        MergeSort mergeSort = new MergeSort();
        System.out.println(Arrays.toString(mergeSort.sort(array)));
    }
}
