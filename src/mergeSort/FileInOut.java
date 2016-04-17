package mergeSort;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileInOut implements ArrayWriter, ArrayReader {
    private int size;
    private int array[];
    String fileName = "ArrayForMargeSort.txt";

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

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(Arrays.toString(array));
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void read() {
        try (FileReader reader = new FileReader(fileName)) {
            int c;
            System.out.print("Заполненный массив состоит из следующих чисел:");
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
