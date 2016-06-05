package CollectionFramework;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class UseTreeMapPage611 {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>();
        tm.put("Джон, Доу", new Double(3434.34));
        tm.put("Том, Смит", new Double(99.34));
        tm.put("Джейн, Бейкер", new Double(126.56));

        //получить множество записей
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //вывести множество
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        //внести сумму 1000 на счет Джона Доу
        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000.00);
        System.out.println("Новый остаток на счете Джона Доу: " + tm.get("Джон Доу"));
    }
}
