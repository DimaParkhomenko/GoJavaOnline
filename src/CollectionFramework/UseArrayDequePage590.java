package CollectionFramework;

import java.util.ArrayDeque;

public class UseArrayDequePage590 {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.push("A");
        arrayDeque.push("B");
        arrayDeque.push("D");
        arrayDeque.push("E");
        arrayDeque.push("F");

        System.out.println("Извлечение из стека: ");
//выводится по умолчанию начиная с последнего эллемента
        while (arrayDeque.peek() != null) {
            System.out.print(arrayDeque.pop() + " ");

            System.out.println();
        }
    }
}
