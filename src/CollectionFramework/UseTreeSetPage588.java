package CollectionFramework;

import java.util.TreeSet;

public class UseTreeSetPage588 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("D");
        treeSet.add("Z");
        treeSet.add("Y");
        treeSet.add("A");
        treeSet.add("W");
        treeSet.add("H");
        treeSet.add("О");
        //Сразу заполняеет и выводит в отсортированом виде.
        System.out.println(treeSet);

        //можно выводить отдельное множество
        System.out.println(treeSet.subSet("D", "Y"));
    }
}
