package CollectionFramework.use_Comparator;

import java.util.TreeSet;

public class CompDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>(new MyComp());
        treeSet.add("A");
        treeSet.add("Z");
        treeSet.add("X");
        treeSet.add("W");
        treeSet.add("K");
        treeSet.add("O");

        for (String element : treeSet) {
            System.out.print(element + " ");
            System.out.println();
        }
    }
}
