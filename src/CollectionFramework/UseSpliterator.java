package CollectionFramework;

import java.util.ArrayList;
import java.util.Spliterator;

public class UseSpliterator {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(1.0);
        arrayList.add(2.0);
        arrayList.add(3.0);
        arrayList.add(4.0);
        arrayList.add(5.0);

        //вызов метода tryAdvance для вывода содержимого списосчного массива
        Spliterator<Double> spliterator = arrayList.spliterator();
        while (spliterator.tryAdvance((n) -> System.out.println(n))) ;
        System.out.println();

        //создать новый списочный массив содержащий квадратные корни числовых значений из arrayList
        spliterator = arrayList.spliterator();
        ArrayList<Double> sqrt = new ArrayList<>();
        while (spliterator.tryAdvance((n) -> sqrt.add(Math.sqrt(n)))) ;
        System.out.println();

        //вызвать метод forEachRemaining для вывода содержимого списочного массива
        spliterator = sqrt.spliterator();
        spliterator.forEachRemaining((n) -> System.out.println(n));
    }
}
