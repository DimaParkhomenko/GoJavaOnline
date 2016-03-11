package module5;

import java.util.Arrays;

/*
Создать класс, который осуществляет поиск максимального и минимального элемента в массиве из целых чисел (int[]).
Выбрать один из алгоритмов сортировки массивов и реализовать его
 */
public class ArrMinMaxSortTestDrive {
    public static void main(String[] args) {

        int[] arr = {1, 4, 9, 8, 3};
        int maxValue = arr[0];
        int minValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println("Max Array's value is " + maxValue);
        System.out.println("Min Array's value is " + minValue);

        System.out.println("Sort arr:");
        Arrays.sort(arr);
        for (int element : arr) {
            System.out.println(element);
        }
    }
}

