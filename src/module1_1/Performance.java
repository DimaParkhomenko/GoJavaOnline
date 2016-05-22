package module1_1;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Performance extends JFrame {
    public static void createGUI(String nameFrame, String[] columnNames, String[][] data) {
        JFrame frame = new JFrame(nameFrame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTable table = new JTable(data, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);

        frame.getContentPane().add(scrollPane);
        frame.setPreferredSize(new Dimension(700, 150));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        TreeSet<Integer> treeSet = new TreeSet<Integer>();


        int tenThousand = 10000;
        int hundredThousand = 100000;
        int oneMillion = 1000000;
        String tableName = "Table 10K";
        String[] columnNames = {"Collections", "add", "get", "contains", "remove", "populate", "iterator.add", "iterator.remove"};
        String[][] data = {
                {"ArrayList", addListDuration(arrayList, tenThousand), getListDuration(arrayList, tenThousand),
                        containsListDuration(arrayList, tenThousand), removeListDuration(arrayList, tenThousand), "",
                        iteratorAddListDuration(arrayList, tenThousand), iteratorRemoveListDuration(arrayList, tenThousand), ""},

                {"LinkedList", addListDuration(linkedList, tenThousand), getListDuration(linkedList, tenThousand),
                        containsListDuration(linkedList, tenThousand), removeListDuration(linkedList, tenThousand), "",
                        iteratorAddListDuration(linkedList, tenThousand), iteratorRemoveListDuration(linkedList, tenThousand)},

                {"HashSet", addSetDuration(hashSet, tenThousand), "", containsSetDuration(hashSet, tenThousand),
                        removeSetDuration(hashSet, tenThousand), " ", " ", ""},

                {"TreeSet", addSetDuration(treeSet, tenThousand), "", containsSetDuration(treeSet, tenThousand),
                        removeSetDuration(treeSet, tenThousand), " ", " ", ""}};

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                createGUI(tableName, columnNames, data);
            }
        });
    }

    public static String iteratorAddListDuration(AbstractList list, int number) {
        ListIterator<Integer> listIterator = list.listIterator();
        long startTime = System.nanoTime();
        for (int i = 0; i < number; i++) {
            listIterator.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        return Long.toString(duration);
    }

    public static String iteratorRemoveListDuration(AbstractList list, int number) {
        ListIterator<Integer> listIterator = list.listIterator();

        long startTime = System.nanoTime();
        while (listIterator.hasNext()) {
            long s = listIterator.next();
            listIterator.remove();
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        return Long.toString(duration);
    }

    public static String addListDuration(AbstractList list, int number) {
        long startTime = System.nanoTime();

        for (int i = 0; i < number; i++) {
            list.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        return Long.toString(duration);
    }

    public static String addSetDuration(AbstractSet set, int number) {
        long startTime = System.nanoTime();

        for (int i = 0; i < number; i++) {
            set.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        return Long.toString(duration);
    }

    public static String getListDuration(AbstractList list, int number) {
        long startTime = System.nanoTime();

        for (int i = 0; i < number; i++) {
            list.get(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        return Long.toString(duration);
    }

    public static String containsListDuration(AbstractList list, int number) {
        long startTime = System.nanoTime();

        for (int i = 0; i < number; i++) {
            list.contains(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        return Long.toString(duration);
    }

    public static String containsSetDuration(AbstractSet set, int number) {
        long startTime = System.nanoTime();

        for (int i = 0; i < number; i++) {
            set.contains(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        return Long.toString(duration);
    }

    public static String removeSetDuration(AbstractSet set, int number) {
        long startTime = System.nanoTime();

        for (int i = number - 1; i >= 0; i--) {
            set.remove(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        return Long.toString(duration);
    }

    public static String removeListDuration(AbstractList list, int number) {
        long startTime = System.nanoTime();

        for (int i = number - 1; i >= 0; i--) {
            list.remove(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        return Long.toString(duration);
    }
}
