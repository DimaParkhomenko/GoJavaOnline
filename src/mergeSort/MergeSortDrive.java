package mergeSort;

import java.util.Arrays;

public class MergeSortDrive {
    public static void main(String[] args) {

        MergeSort mergeSort = new MergeSort();

        System.out.println("Первый вариант - считывание данных для сортировки с консоли.");
        ConsoleArrayReader consoleArrayReader = new ConsoleArrayReader();
        consoleArrayReader.write();
        consoleArrayReader.read();
        System.out.println();
        System.out.print("Отсортированный массив методом слияния: ");
        System.out.println(Arrays.toString(mergeSort.sort(consoleArrayReader.getArray())));
        System.out.println();

        System.out.println("Второй вариант - считывание данных для сортировки с файла.");
        FileArrayReader fileArrayReader = new FileArrayReader();
        fileArrayReader.write();
        fileArrayReader.read();
        System.out.println();
        System.out.print("Отсортированный массив методом слияния: ");
        System.out.println(Arrays.toString(mergeSort.sort(fileArrayReader.getArray())));
    }
}
