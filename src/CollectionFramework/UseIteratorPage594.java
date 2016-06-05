package CollectionFramework;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class UseIteratorPage594 {
    public static void main(String[] args) {
        AbstractList<String> arrayList = new ArrayList<>();
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");

        System.out.print("Исходное содержимое списочного массива: ");
        Iterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.print(element + " ");
        }
        System.out.println();


        //видоизменить перебираемые эллементы
        ListIterator<String> stringListIterator = arrayList.listIterator();
        while (stringListIterator.hasNext()) {
            String element = stringListIterator.next();
            System.out.print(element + "+");
        }
        System.out.println();

        while (listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.print(element + " ");
        }
        System.out.println();
        //отобразить список в обратном порядке
        System.out.print("Изменить содержимое списочного массива в обратном порядке: ");
        while (stringListIterator.hasPrevious()) {
            String element = stringListIterator.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
