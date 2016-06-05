package CollectionFramework;

import java.util.LinkedList;

public class UseLinkedListPage584 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("F");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("C");
        linkedList.addLast("Z");
        linkedList.addFirst("A");
        linkedList.add(1, "A2");

        System.out.println("Исходное содержимое связаного списка: " + linkedList);

        linkedList.remove("F");
        linkedList.remove(2);

        System.out.println("Содержимое спска после удалления элементов: " + linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("Содержимое спска после удалления первого и последнего элементов: " + linkedList);

        String val = linkedList.get(2);
        linkedList.set(2, val + " изменено");

        System.out.println("Содержимое списка после изменения: " + linkedList);
    }
}
