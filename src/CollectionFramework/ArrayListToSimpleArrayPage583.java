package CollectionFramework;

import java.util.ArrayList;

public class ArrayListToSimpleArrayPage583 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            arrayList.add(i);
        }

        System.out.println("Содержимое списка массива: " + arrayList);

        Integer[] simpleArray = new Integer[arrayList.size()];
        simpleArray = arrayList.toArray(simpleArray);

        int sum = 0;

        for (int i : simpleArray) sum += i;
        System.out.println("Сумма: " + sum);
    }
}

