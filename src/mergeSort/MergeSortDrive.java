package mergeSort;

import java.util.Arrays;

public class MergeSortDrive {
    public static void main(String[] args) {

        MergeSort mergeSort = new MergeSort();
        try {
            System.out.println("Первый вариант - считывание данных для сортировки с консоли.");
            ConsoleInOut consoleArrayReader = new ConsoleInOut();
            consoleArrayReader.write();
            consoleArrayReader.read();
            System.out.println();
            System.out.print("Отсортированный массив методом слияния: ");
            System.out.println(Arrays.toString(mergeSort.sort(consoleArrayReader.getArray())) + '\n');

            System.out.println("Второй вариант - считывание данных для сортировки с файла.");
            FileInOut fileArrayReader = new FileInOut();
            fileArrayReader.write();
            fileArrayReader.read();
            System.out.println();
            System.out.print("Отсортированный массив методом слияния: ");
            System.out.println(Arrays.toString(mergeSort.sort(fileArrayReader.getArray())));
        } catch (Exception e) {
            System.out.println("Вы ввели недопустимый символ." + '\n' +
                    "Длина массива должна иметь цыфровое значение и быть больше ноля." + '\n' +
                    "Заполнять массив можно только цыфрами, значения меньше ноля допускаются." + '\n' +
                    "Перезагрузите пожалуйста приложение и введите данные заново.");
        }
    }
}
