package module5;

import java.util.Arrays;

/*
Создать класс, который осуществляет поиск максимального и минимального элемента в массиве из целых чисел (int[]).
Выбрать один из алгоритмов сортировки массивов и реализовать его
 */
public class ArrMinMaxSortTestDrive {
    public static void main(String[] args) {

        int[] arr = {1, 4, 9, 8, 3};

        System.out.println("Max Array's value is " + getMaxValue(arr));
        System.out.println("Min Array's value is " + getMinValue(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }

            }
        }
        System.out.println("Sort arr using  'bubble sort':" + Arrays.toString(arr));
    }


    public static int getMaxValue(int[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[] arr) {
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }
}



