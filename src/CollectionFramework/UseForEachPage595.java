package CollectionFramework;

import java.util.ArrayList;

public class UseForEachPage595 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            arrayList.add(i);
        }
        //вывод содержимого коллекции
        for (int value : arrayList) {
            System.out.print(value + " ");
        }
        System.out.println();
        //сумирование чисел
        int sum = 0;
        for (int value : arrayList) {
            sum+= value;
        }
        System.out.println(sum);
    }
}
