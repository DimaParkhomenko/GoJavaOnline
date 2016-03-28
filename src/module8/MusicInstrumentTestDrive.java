package module8;
/*
Выбрать иерархию классов из ДЗ по теме OOP in Java и создать несколько коллекций объектов из данной иерархии.
Хотя бы одна коллекция должна содержать в себе объекты разных классов.
Создать класс, который печатает созданные коллекции на экран в виде таблицы.

Колонки таблицы соответствуют полям объектов. Каждая строка в таблице соответствует объекту из коллекции.

Создать упорядоченный список объектов из ДЗ по теме OOP in Java не прибегая к  использованию Collections.sort().
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Iterator;

public class MusicInstrumentTestDrive {
    public static void main(String[] args) {
        ArrayList<Guitar> guitarList = new ArrayList<>();
        ArrayList<Piano> pianoList = new ArrayList<>();
        ArrayList<Trumpet> trumpetList = new ArrayList<>();
        MusicStore musicStore = new MusicStore();

        System.out.println("Sort piano's list:");
        makeSort();
        System.out.println();

        musicStore.putMusicInstrument(new Guitar("Best guitar", 656));
        musicStore.putMusicInstrument(new Piano("Best piano", 56));
        musicStore.putMusicInstrument(new Trumpet("Best trumpet", 56));

        pianoList.add(new Piano("My   piano", 25));
        pianoList.add(new Piano("Your piano", 66));
        pianoList.add(new Piano("Our  piano", 77));

        guitarList.add(new Guitar("My   guitar", 2));
        guitarList.add(new Guitar("Your guitar", 6));
        guitarList.add(new Guitar("Our  guitar", 7));

        trumpetList.add(new Trumpet("My   trumpet", 256));
        trumpetList.add(new Trumpet("Your trumpet", 666));
        trumpetList.add(new Trumpet("Our  trumpet", 776));

        System.out.println("List of Collections");
        System.out.println("Type of instruments " + "Price of instruments");

        guitarList.stream().forEach(instrument -> System.out.println(instrument + " "));
        pianoList.stream().forEach(instrument -> System.out.println(instrument + " "));
        trumpetList.stream().forEach(instrument -> System.out.println(instrument + " "));
        musicStore.printMusicInstrumentDetails();

    }

    public static void makeSort() {
        TreeSet<Piano> piano = new TreeSet<Piano>();
        piano.add(new Piano("Jack's piano", 56));
        piano.add(new Piano("Nick's piano", 856));
        piano.add(new Piano("Alice's piano", 526));
        piano.add(new Piano("Bill's piano", 456));
        for (Piano pianos : piano) System.out.println(pianos.getTypeOfInstruments());
    }
}

