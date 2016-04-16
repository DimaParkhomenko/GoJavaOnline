package mergeSort;


import java.util.Scanner;

public class ConsoleArrayReader implements ArrayReader, ArrayWriter {

    private int size;
    private int array[];

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void write() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ведите длину массива: ");
        setSize(input.nextInt());
        setArray(new int[getSize()]);
        System.out.println("Заполните массив числами: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
    }

    @Override
    public void read() {
        System.out.print("Заполненный массив состоит из следующих чисел:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
